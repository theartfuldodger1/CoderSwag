package com.littlecitycreations.coderswag.Services

import com.littlecitycreations.coderswag.Model.Category
import com.littlecitycreations.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devsloges Graphic Beanie", "$18", "hat1"),
            Product("Devsloges Hat Black", "$20", "hat2"),
            Product("Devsloges Hat White", "$18", "hat3"),
            Product("Devsloges Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$28", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt4")
    )
}

