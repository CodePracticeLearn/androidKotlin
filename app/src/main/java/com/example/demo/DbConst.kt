package com.example.demo

class DbConst {
    var id: Int = 0
    var expenseName: String? = null
    var expenseAmount: String? = null
    constructor(id: Int, expenseName: String, expenseAmount:String) {
        this.id = id
        this.expenseName = expenseName
        this.expenseAmount = expenseAmount
    }
    constructor(expenseName: String, expenseAmount: String) {
        this.expenseName = expenseName
        this.expenseAmount = expenseAmount
    }
}
