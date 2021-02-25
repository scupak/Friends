package com.easv.oe.friends.Model


class Friends {

    val mFriends = arrayOf<BEFriend>(
                         BEFriend("Jonas", "123", true ,"vej1"),
                         BEFriend("Anders", "1234", false ,"vej1"),
                         BEFriend("Nikolaj", "12345", true ,"vej1"),
                         BEFriend("Nadia", "12345678", true,"vej1"),
                         BEFriend("Michael", "23456789", true, "vej1"),
                         BEFriend("Kacper", "87654321", false, "vej1"),
                         BEFriend("Rocio", "12121212", true, "vej1"),
                         BEFriend("Alan", "12876543", false, "vej1"),
                         BEFriend("Rado", "14755432", true, "vej1"),
                         BEFriend("Cecilia", "21212121", true, "vej1"),
                         BEFriend("Alan", "12876543", false, "vej1"),
                         BEFriend("Christina", "12344321", false, "vej1"),
                         BEFriend("Anne", "12876543", false, "vej1"),
                         BEFriend("Kim", "12876543", true , "vej1")
    )

    fun getAll(): Array<BEFriend> = mFriends


    fun getAllNames(): Array<String>  =  mFriends.map { aFriend -> aFriend.name }.toTypedArray()



}