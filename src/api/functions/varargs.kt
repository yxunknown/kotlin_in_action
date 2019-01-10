package api.functions

const val NO_MEANING = -1

fun min(vararg nums: Int): Int {
    // if user call this function with 0 parameter
    // this function will raise ArrayIndexOutOfBoundsException
    // need extra checking to ensure parameters is not empty
    //    if (nums.isEmpty()) {
    //        return NO_MEANING
    //    }
    var min = nums[0]
    for (num in nums) {
        if (num < min) {
            min = num
        }
    }
    return min
}

fun minBetter(num1: Int, vararg restNums: Int): Int {
    // called at least one parameter
    var min = num1
    for (num in restNums) {
        if (num < min) {
            min = num
        }
    }
    return min
}

