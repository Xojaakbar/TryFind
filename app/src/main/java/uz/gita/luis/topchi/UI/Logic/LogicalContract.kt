package uz.gita.luis.tryfind.UI.Logic

import uz.gita.luis.topchi.model.OpenedTestData


interface LogicalContract {
    interface View{
        fun backToMenu()
        fun showSuccessToast(text: String)
        fun showMistakeToast(text: String)
        fun describe(test: OpenedTestData)
    }
    interface Presenter{
        fun answerClicked(answer: String)
        fun finish()
        fun loadNextTest()
    }
    interface Model{
        fun checkAnswer(answer: String) : Boolean
        fun giveNextTest() : OpenedTestData
    }
}