package uz.gita.luis.tryfind.UI.Logic

class LogicPresenter(val view:LogicalContract.View) : LogicalContract.Presenter{
    val model: LogicalContract.Model = LogicModel()
    override fun answerClicked(answer: String) {
        if (model.checkAnswer(answer))
            view.showSuccessToast("malades")
        else view.showMistakeToast("xatoyu")
        loadNextTest()
    }


    override fun finish() {
        view.backToMenu()
    }

    override fun loadNextTest() {
        view.describe(model.giveNextTest())
    }
}