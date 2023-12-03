package uz.gita.luis.tryfind.UI.Menu

class MenuPresenter(val view: MenuContract.View) : MenuContract.Presenter{
    private val model: MenuContract.Model = MenuModel()


    override fun sayGoToClosedTest() {
        view.gotoClosedTest()
    }

    override fun sayGoToLogical() {
        view.goToLogical()
    }

    override fun sayGoToWorldly() {
        view.goToWorldly()
    }
}