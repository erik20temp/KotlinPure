package caster.enum

enum class AccountTypeCalculate {
    BRONZE {  //-10%
        override fun calculateDiscount(): Int{
            var percent = 0
            // ... do calculations
            return percent
        }
    },
    SILVER {  //-15%
        override fun calculateDiscount() = 15
    },
    GOLD {
        override fun calculateDiscount() = 20
    },
    PLATINUM {
        override fun calculateDiscount() = 25
    };

    abstract fun calculateDiscount(): Int

    companion object{
        fun getAccountTypeByName(name: String) = valueOf(name.uppercase())
    }
}