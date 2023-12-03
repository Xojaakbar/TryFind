package uz.gita.luis.topchi.UI.Worldly

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import uz.gita.luis.tryfind.R
import uz.gita.luis.tryfind.databinding.ActivityWorldlyBinding
import uz.gita.luis.tryfind.repository.RepositClosedTest

class WorldlyActivity : AppCompatActivity() {
    lateinit var bind: ActivityWorldlyBinding
    private val reposit = RepositClosedTest.getInstance()
    private val list = reposit.closedTestList
    private var index = 0
    private var isQuestionOpened = true
    private var isAnswerOpened = false
    private lateinit var downForAnswer: Animation
    private lateinit var downForQuestion: Animation
    private lateinit var upForAnswer: Animation
    private lateinit var upForQuestion: Animation
    private lateinit var visible: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityWorldlyBinding.inflate(layoutInflater)
        setContentView(bind.root)

        downForAnswer = AnimationUtils.loadAnimation(this, R.anim.slide_down_for_answer)
        downForQuestion = AnimationUtils.loadAnimation(this, R.anim.slide_down_for_question)
        upForAnswer = AnimationUtils.loadAnimation(this, R.anim.slide_up_for_answer)
        upForQuestion = AnimationUtils.loadAnimation(this, R.anim.slide_up_for_question)
        visible = AnimationUtils.loadAnimation(this, R.anim.visibility)
        nextQuestion()

        if (isQuestionOpened) {
            bind.imageCloseOpenQuestion.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
            bind.question.visibility = View.VISIBLE
        } else {
            bind.imageCloseOpenQuestion.setImageResource(R.drawable.ic_baseline_arrow_left_24)
            bind.question.visibility = View.GONE
        }

        if (isAnswerOpened) {
            bind.answer.visibility = View.VISIBLE
            bind.imageCloseOpenAnswer.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24)
        } else {
            bind.answer.visibility = View.GONE
            bind.imageCloseOpenAnswer.setImageResource(R.drawable.ic_baseline_arrow_left_24)
        }

        bind.showAnswer.setOnClickListener {
            if (isAnswerOpened) {
                bind.imageCloseOpenAnswer.setImageResource(R.drawable.ic_baseline_arrow_left_24)
                bind.answer.startAnimation(downForAnswer)
                bind.personAnswer.startAnimation(visible)
                bind.answer.visibility = View.GONE
                isAnswerOpened = false
            } else {
                bind.imageCloseOpenAnswer.setImageResource(R.drawable.ic_baseline_arrow_drop_up_24)
                bind.answer.startAnimation(upForAnswer)
                bind.personAnswer.startAnimation(visible)
                bind.answer.visibility = View.VISIBLE
                isAnswerOpened = true
            }


        }

        bind.showQuestion.setOnClickListener {
            if (isQuestionOpened) {
                bind.imageCloseOpenQuestion.setImageResource(R.drawable.ic_baseline_arrow_left_24)
                bind.question.startAnimation(upForQuestion)
                bind.personQuestion.startAnimation(visible)
                bind.question.visibility = View.GONE
                isQuestionOpened = false
            } else {
                bind.imageCloseOpenQuestion.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
                bind.question.startAnimation(downForQuestion)
                bind.personQuestion.startAnimation(visible)
                bind.question.visibility = View.VISIBLE
                isQuestionOpened = true
            }
        }

        bind.btnNext.setOnClickListener {
            if (isAnswerOpened) {
                bind.imageCloseOpenAnswer.setImageResource(R.drawable.ic_baseline_arrow_left_24)
                bind.answer.visibility = View.GONE
                isAnswerOpened = false
            }
//            if (isQuestionOpened) {
//                bind.imageCloseOpenQuestion.setImageResource(R.drawable.ic_baseline_arrow_left_24)
//                bind.question.startAnimation(upForQuestion)
//                bind.question.visibility = View.GONE
//                isQuestionOpened = false
//            }
            nextQuestion()
            if(!isQuestionOpened){
            bind.imageCloseOpenQuestion.setImageResource(R.drawable.ic_baseline_arrow_drop_down_24)
            bind.question.startAnimation(downForQuestion)
            bind.personQuestion.startAnimation(visible)
            bind.question.visibility = View.VISIBLE
            isQuestionOpened = true
        }
        }

        bind.backImageWorldly.setOnClickListener {
            finish()
        }
    }

    fun nextQuestion(){
        if (index==list.size){
            index=0
        }
        if (isQuestionOpened){
        bind.question.startAnimation(visible)
        bind.personQuestion.startAnimation(visible)}
        bind.question.text = list[index].question
        bind.answer.text = list[index++].answer
    }
}