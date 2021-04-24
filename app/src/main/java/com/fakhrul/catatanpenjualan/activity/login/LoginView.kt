package com.fakhrul.catatanpenjualan.activity.login

import com.fakhrul.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}