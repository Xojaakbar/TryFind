package uz.gita.luis.tryfind.UI.Menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.gita.luis.topchi.UI.Worldly.WorldlyActivity
import uz.gita.luis.tryfind.UI.Logic.LogicalActivity
import uz.gita.luis.tryfind.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity(), MenuContract.View {
    val presenter: MenuContract.Presenter = MenuPresenter(this)
    lateinit var bind: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(bind.root)
        clickListener()

    }
    fun clickListener(){
        bind.logical.setOnClickListener { presenter.sayGoToLogical() }
        bind.exit.setOnClickListener { finish() }
        bind.closedTest.setOnClickListener { presenter.sayGoToClosedTest() }
    }


    override fun gotoClosedTest() {
        val intent = Intent(this, WorldlyActivity::class.java)
        startActivity(intent)
    }

    override fun goToLogical() {
        val intent = Intent(this, LogicalActivity::class.java)
        startActivity(intent)
    }

    override fun goToWorldly() {
        val intent = Intent(this, WorldlyActivity::class.java)
        startActivity(intent)
    }
}