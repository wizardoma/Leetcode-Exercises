/**
 * @author Ibekason Alexander Onyebuchi
 */

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

link : https://leetcode.com/problems/two-sum/
 */


var twoSum = function (sums, target) {
    let result = [];
    for (let i = 0; i< sums.length; i++){
        let sum = sums[i];
        let hasGotSum = false;
        for (let j = 0; j<sums.length; j++){
            sum = sums[i];
            if(j!==i){
                sum += sums[j];
                if (sum === target){
                    hasGotSum = true;
                    result.push(i)
                    result.push(j)
                    break;
                }
            }
        }
        if(hasGotSum) break;
    }
    return result;

}

console.log(twoSum([2,7,11,15], 26))
// [0,1]