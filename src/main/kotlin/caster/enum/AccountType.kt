package caster.enum

enum class AccountType(val discountPercent: Int) {
    BRONZE(10),  //-10%
    SILVER(15),  //-15%
    GOLD(20),    //-20%
    PLATINUM(25) //-25%
}