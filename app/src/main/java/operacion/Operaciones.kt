package operacion


object Operaciones {
    fun isPrimeNumber(number: Int): Boolean {
        if (number <= 1) {
            return false
        }
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
}
