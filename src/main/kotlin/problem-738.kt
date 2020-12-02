import kotlin.math.pow

/*
Given a non-negative integer N, find the largest number that is less than or equal to N with monotone increasing digits.

(Recall that an integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.)

Example 1:
Input: N = 10
Output: 9

Example 2:
Input: N = 1234
Output: 1234

Example 3:
Input: N = 332
Output: 299

Note: N is an integer in the range [0, 10^9].
 */

fun monotoneIncreasingDigits(N: Int): Int {
    val numbers = N.toString().toCharArray().map(Character::getNumericValue)
    var result = 0.0
    var violationIndex = Int.MAX_VALUE
    for ((index, number) in numbers.withIndex()) {
        if ((index + 1) < numbers.size && number > numbers[index + 1]) {
            var prev = index - 1
            var negativeCount = 0
            while (prev >=0 && numbers[prev] == number) {
                prev--
                negativeCount--
            }
            violationIndex = index + negativeCount
            break
        }
    }

    for ((index, number) in numbers.withIndex()) {
        result += when {
            index < violationIndex -> 10.toDouble().pow(numbers.size - 1 - index) * number
            index == violationIndex -> 10.toDouble().pow(numbers.size - 1 - index) * (number - 1)
            else -> 10.toDouble().pow(numbers.size - 1 - index) * 9
        }
    }

    return result.toInt()
}