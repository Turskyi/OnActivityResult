package ua.turskyi.activityresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity(), View.OnClickListener {
    private var tvName: TextView? = null
    private var btnName: Button? = null
    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvName = findViewById<View>(R.id.tvName) as TextView
        btnName = findViewById<View>(R.id.btnName) as Button
        btnName!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, NameActivity::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent
    ) {
        val name = data.getStringExtra("name")
        tvName!!.text = getString(R.string.your_name, name)
    }
}