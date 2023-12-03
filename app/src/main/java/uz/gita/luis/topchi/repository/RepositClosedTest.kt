package uz.gita.luis.tryfind.repository

import uz.gita.luis.topchi.model.ClosedTestData

class RepositClosedTest private constructor() {

    lateinit var closedTestList: MutableList<ClosedTestData>
    companion object {
        private var repositClosedTest: RepositClosedTest? = null
        fun getInstance(): RepositClosedTest {
            if (repositClosedTest == null)
                repositClosedTest = RepositClosedTest()
            return repositClosedTest as RepositClosedTest
        }
    }

    init {
        loadClosedTest()
    }

    fun loadClosedTest() {
        closedTestList = ArrayList()
        closedTestList.add(ClosedTestData("Barcha sharoitlari bor xonaning qayerga qalam qo'yilsa uning ustidan sakrab o'tib bo'lmaydi",
            "burchagiga"))
        closedTestList.add(ClosedTestData("1dan 100gacha sonlar orasida nechta 9 bor?","20ta"))
        closedTestList.add(ClosedTestData("Bo'ri o'lgan qo'yni qanday yeydi","bo'ri o'lgan"))
        closedTestList.add(ClosedTestData("Nuriddin doim futbol boshlanishidan oldin anniq hisobni ayta olardi, shunaqasi ham bo'lishi mumkinmi?","Futbol o'yini 0:0 dan boshlangani uchun u har doim anniq hisobni to'g'ri topardi"))
        closedTestList.add(ClosedTestData("Futbolchining Farxod ismli akasi bor edi, lekin Farxodning ukasi yo'q edi. Buning sababi nima?","futbolchi Farxodning singlisi edi"))
        closedTestList.add(ClosedTestData("Yog'ochni 12 bo'lakka bo'lish uchun uni necha marta arralash kerak?","11 marta"))
        closedTestList.add(ClosedTestData("Stolda 70dona qog'oz turibdi. Har 10soniyada 10ta qog'oz sanash mumkin. Bu holda 50ta qog'ozni sanash uchun qancha vaqt ketadi?","20 soniya. 20 soniyada 20tasini chiqarib tashlasak stolda 50ta qoladi"))
        closedTestList.add(ClosedTestData("qaysi so'z doimo xato bo'lib eshitiladi?","xato degan so'z"))

        closedTestList.add(ClosedTestData("Shoh vazirga menga nok olma anor keltir - deb buyurdi. Zukko vazir bitta meva keltirdi. Bu qaysi meva edi?",
            "anor. Chunki shoh nokni olma, anor keltir degan"))
        closedTestList.add(ClosedTestData("Uni chap qo'l bilan ushlasa bo'ladi ammo o'ng qo'l bilan hechqachon ushlab bo'lmaydi",
            "o'ng qo'lning tirsagi"))
        closedTestList.add(ClosedTestData("3ta tolning har birida 7tadan shox mavjud. Har bir shoxda 3tadan olma meva bor. Barcha daraxtning mevalari soni nechta bo'ladi?",
            "Tolda olma nima qilyapti?"))
        closedTestList.add(ClosedTestData("Professor kech soat sakkizda budilnikni 9ga qo'yib uyquga yotdi. U necha soat uxlaydi?",
            "1 soat"))
        closedTestList.add(ClosedTestData("O'n metrlik narvondan sakrab tushib, hech bir jarohat olmaslik uchun qanday sakrash kerak?",
            "narvonning birinchi zinasidan sakrash kerak"))
        closedTestList.add(ClosedTestData("Nimani 10daqiqadan ortiq ushlab turishning iloji yo'q, garchi u o'ta yengil bo'lsa ham?",
            "nafasni"))
        closedTestList.add(ClosedTestData("Bir kishi olmalarni 5000dan olib 3000dan sotar edi, bir muncha vaqt o'tgach u millionerga aylandi. Buning sababi nimada?",
            "u avval milliarder bo'lgan"))
        closedTestList.add(ClosedTestData("Qanday inson otni ham, filni ham kotarib yura olishga qodir?",
            "shaxmatchi"))
        closedTestList.add(ClosedTestData("Itning bo'yniga 3metr keladigan arqon bog'langan edi, ammo it to'gri yo'nalish bilan 5metr harakatlana oldi, u bunga qanday erishdi?",
            "arqonning ikkinchi uchi hech qayerga bog'lanmagan edi"))

        closedTestList.add(ClosedTestData("Yerdan turib 9 qavatli uydan balandroq sakrash mumkinmi?",
            "albatta mumkin, 9 qavatli uylar sakrashni bilishmaydi"))

        closedTestList.add(ClosedTestData("Stolning 4 burchagi bor uning 1burchagini kesib yuborsak nechta burchak unda qoladi?",
            "5ta"))
        closedTestList.add(ClosedTestData("erkak kishi o'zining bevasining singlisiga uylanishi mumkinmi?",
            "yo'q, chunki o'zi o'lgan bo'ladi"))

        closedTestList.add(ClosedTestData("Qaysi holatda 2ga qarab 10 deymiz?",
            "soat strelkasi 2da turganida"))
        closedTestList.add(ClosedTestData("Kim o'tirgan holda yuradi?", "shaxmatchi"))
        closedTestList.add(ClosedTestData("Qaysi hayvon ko'zi ochiq holda uxlaydi?", "baliq"))
        closedTestList.add(ClosedTestData("3ta aka-ukaning 2tadan opalari bor, oilada nechta farzand bor?",
            "5ta"))
        closedTestList.add(ClosedTestData("Qanday soat 1 sutkada 2 marta vaqtni to'g'ri ko'rsatadi?",
            "Singan soat"))
        closedTestList.add(ClosedTestData("Yerdan osonlikcha ko'tarish mumkin ammo uzoqqa otib bo'lmaydi. Bu nima?",
            "qush pati, 1 varoq buklanmagan qog'oz, va shu kabi yengil elementlar"))
    }
}