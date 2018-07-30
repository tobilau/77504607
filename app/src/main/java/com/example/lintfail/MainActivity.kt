package com.example.lintfail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    data class Test(val number:  Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = getTest()
        test.let {
            test_string.text = getString(R.string.lint_test, it.number)
        }
    }

    private fun getTest() : Test {
        return Test(2)
    }
}
