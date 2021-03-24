/**
 * @author Ibekason Alexander Onyebuchi
 */

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

see https://leetcode.com/problems/add-two-numbers/
 */

const addTwoNumbers = (l1, l2) => {

    let ll1 = []
    let ll2 = []
    for (let i = l1.length-1; i >=0; i--){
        ll1.push(l1[i]);
    }
    for (let i = l2.length-1; i >=0; i--){
        ll2.push(l2[i]);
    }
    let total1 = "", total2 = "";

    for (let i = 0 ; i <ll1.length; i++){
        total1 +=ll1[i];
    }
    for (let i = 0 ; i <ll2.length; i++){
        total2 +=ll2[i];
    }

    return (parseInt(total1) + parseInt(total2)).toString().split("").reverse().map(e => parseInt(e));

};

console.log(addTwoNumbers([9,9,9,9,9,9,9],[9,9,9,9]))
console.log(addTwoNumbers([0],[0]))