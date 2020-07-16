package com.isyaratproject.signdictionary.Utilities

import com.isyaratproject.signdictionary.Model.Comment
import com.isyaratproject.signdictionary.Model.ImageSign
import com.isyaratproject.signdictionary.Model.Post
import java.net.URL

object ApiDataService {
    var ApiURL = URL("")
}

object ApiDictionaryDataService {
    var Api_Dictionary_Abjad_Bisindo = arrayListOf<ImageSign>()
    var Api_Dictionary_Abjad_Sibi = arrayListOf<ImageSign>()
    var Api_Dictionary_Angka_Bisindo = arrayListOf<ImageSign>()
    var Api_Dictionary_Angka_Sibi = arrayListOf<ImageSign>()

    fun getAPISearchedDictionary(categorySelected: String): List<ImageSign>{
        return when(categorySelected){
            "Abjad - Bisindo" -> ApiDictionaryDataService.Api_Dictionary_Abjad_Bisindo
            "Abjad - Sibi" -> ApiDictionaryDataService.Api_Dictionary_Abjad_Sibi
            "Angka - Bisindo" -> ApiDictionaryDataService.Api_Dictionary_Angka_Bisindo
            "Angka - Sibi" -> ApiDictionaryDataService.Api_Dictionary_Angka_Sibi
            else -> ApiDictionaryDataService.Api_Dictionary_Abjad_Bisindo
        }
    }
}

object ApiForumDataService {
    var Api_Forum_Abjad_Bisindo = arrayListOf<Post>()
    var Api_Forum_Abjad_Sibi = arrayListOf<Post>()
    var Api_Forum_Angka_Bisindo = arrayListOf<Post>()
    var Api_Forum_Angka_Sibi = arrayListOf<Post>()

    fun getAPISearchedForum(categorySelected: String): List<Post>{
        return when(categorySelected){
            "Abjad - Bisindo" -> ApiForumDataService.Api_Forum_Abjad_Bisindo
            "Abjad - Sibi" -> ApiForumDataService.Api_Forum_Abjad_Sibi
            "Angka - Bisindo" -> ApiForumDataService.Api_Forum_Angka_Bisindo
            "Angka - Sibi" -> ApiForumDataService.Api_Forum_Angka_Sibi
            else -> ApiForumDataService.Api_Forum_Abjad_Bisindo
        }
    }
}

object ApiCommentDataService {
    var Api_Comments = arrayListOf<Comment>()
}