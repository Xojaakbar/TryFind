package uz.gita.luis.tryfind.UI.Logic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.shashank.sony.fancytoastlib.FancyToast
import uz.gita.luis.topchi.model.OpenedTestData
import uz.gita.luis.tryfind.R
import uz.gita.luis.tryfind.databinding.ActivityLogicalBinding

class LogicalActivity : AppCompatActivity(), LogicalContract.View{
    lateinit var chapdan: Animation
    lateinit var ongdan: Animation
    lateinit var visibility: Animation
    val presenter: LogicalContract.Presenter = LogicPresenter(this)
    lateinit var bind: ActivityLogicalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityLogicalBinding.inflate(layoutInflater)
        setContentView(bind.root)
        chapdan = AnimationUtils.loadAnimation(this, R.anim.chapdan)
        ongdan = AnimationUtils.loadAnimation(this, R.anim.ongdan)
        visibility = AnimationUtils.loadAnimation(this,R.anim.visibility)
        presenter.loadNextTest()
        clicklistener()
    }

    fun animate(){
        bind.ajovobmantiqiy.startAnimation(chapdan)
        bind.bjovobmantiqiy.startAnimation(ongdan)
        bind.cjovobmantiqiy.startAnimation(chapdan)
        bind.djovobmantiqiy.startAnimation(ongdan)
        bind.tekstSovoli.startAnimation(visibility)
    }

    private fun clicklistener() {
        bind.backImage.setOnClickListener {
            presenter.finish()
        }

        bind.ajovobmantiqiy.setOnClickListener { presenter.answerClicked(bind.ajovobmantiqiy.text.toString()) }
        bind.bjovobmantiqiy.setOnClickListener { presenter.answerClicked(bind.bjovobmantiqiy.text.toString()) }
        bind.cjovobmantiqiy.setOnClickListener { presenter.answerClicked(bind.cjovobmantiqiy.text.toString()) }
        bind.djovobmantiqiy.setOnClickListener { presenter.answerClicked(bind.djovobmantiqiy.text.toString()) }
    }

    override fun backToMenu(){
        finish()
    }

    override fun showSuccessToast(text: String) {
         FancyToast.makeText(this,text,FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,false).show()
        var corrects = bind.correctCounter.text.toString().toInt() + 1
        bind.correctCounter.text = corrects.toString()
    }

    override fun showMistakeToast(text: String) {
        FancyToast.makeText(this,text,FancyToast.LENGTH_SHORT,FancyToast.ERROR,false).show()
        var wrongs = bind.wrongCounter.text.toString().toInt() + 1
        bind.wrongCounter.text = wrongs.toString()
    }

    override fun describe(test: OpenedTestData) {
        bind.tekstSovoli.text = test.question
        bind.ajovobmantiqiy.text = test.variant1
        bind.bjovobmantiqiy.text = test.variant2
        bind.cjovobmantiqiy.text = test.variant3
        bind.djovobmantiqiy.text = test.variant4
        animate()
    }

    override fun onStop() {
        super.onStop()
    }
}