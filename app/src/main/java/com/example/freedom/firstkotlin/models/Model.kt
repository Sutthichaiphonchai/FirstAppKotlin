package com.example.freedom.firstkotlin.models


data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf<Hobby>(
            Hobby("Swiming"),
            Hobby("Reading"),
            Hobby("Walking"),
            Hobby("Sleeping"),
            Hobby("Gaming"),
            Hobby("Programing"),
            Hobby("Talking"),
            Hobby("ผมว่ายน้ำนะ"),
            Hobby("อ่านหนังสือนี่แหละคือตัวตนของผม"),
            Hobby("เดินมองสาวนี่ทางผมเลย"),
            Hobby("นี่นอนหรือซ้อมตาย"),
            Hobby("ผมเลิกเล่นเเล้วจริงๆนะ"),
            Hobby("คืออะไรหรอครับ"),
            Hobby("พูด พูด พูด"),
            Hobby("Swiming"),
            Hobby("Reading"),
            Hobby("Walking"),
            Hobby("Sleeping"),
            Hobby("Gaming"),
            Hobby("Programing"),
            Hobby("Talking")
    )
}
