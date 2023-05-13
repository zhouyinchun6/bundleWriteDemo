package com.zyc.bundle.demo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.zyc.bundle.annotation.WriteBundle
import com.zyc.bundle.inject.BundleInit

/**
 *
 * author Zyc on date 2023/5/12
 *
 * description:
 */
class KotlinActivity : AppCompatActivity() {

    companion object {
        fun go(context: Context, tag: String) {
            val intent = Intent(context, JavaActivity::class.java)
            intent.putExtra("tag", tag)
            context.startActivity(intent)
        }
    }


    private val tv: TextView by lazy {
        findViewById(R.id.tv)
    }

    @JvmField
    @WriteBundle
    var tag: String = "默认值"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        BundleInit.inject(this)
        initView()
    }


    private fun initView() {
        tv.text = tag
    }

}