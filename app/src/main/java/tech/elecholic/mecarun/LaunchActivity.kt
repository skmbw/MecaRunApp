package tech.elecholic.mecarun

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class LaunchActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent = Intent(this, MainActivity::class.java)

        // Appear
        val view = View.inflate(this, R.layout.activity_launch, null)
        view.alpha = 0f
        setContentView(view)

    }
}