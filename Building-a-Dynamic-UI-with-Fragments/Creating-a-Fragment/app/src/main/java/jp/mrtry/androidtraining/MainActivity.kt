package jp.mrtry.androidtraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // タブレット以外で表示している時
        if (findViewById(R.id.fragment_container) != null) {
            // restoreした時、特に処理はしない
            if (savedInstanceState != null) {
                return
            }

            val firstFragment: HeadlinesFragment = HeadlinesFragment()
            // 外部のIntentから起動されたなら、その変数を受け取る
            firstFragment.setArguments(intent.extras)

            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container, firstFragment)
                    .commit()
        }
    }
}
