package caster.enum

fun main() {

    val accountTypeFromApi = "gold"
    val accountType = AccountType.valueOf(accountTypeFromApi.uppercase())
    println(accountType)
    print("Is this same type? ")
    println(accountType == AccountType.GOLD)

    println(AccountType.SILVER)
    println(AccountType.SILVER.discountPercent)

    for(type in AccountTypeCalculate.values()){
        println("$type discount:  ${type.calculateDiscount()}")
    }
    // this same in one line
    AccountTypeCalculate.values().forEach{ type -> println("$type discount:  ${type.calculateDiscount()}")}
    val accountTypeCalculate = AccountTypeCalculate.getAccountTypeByName("platinum")
    println(accountTypeCalculate)
}