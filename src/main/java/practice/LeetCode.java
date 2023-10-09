package practice;

import com.beust.ah.A;
import com.sun.org.apache.xpath.internal.operations.Bool;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.json.JsonOutput;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.jar.Attributes;

public class LeetCode {

    public static void main(String[] args) {

//        reverseWords("God Ding");
//        System.out.println(reverseWords("Let's take LeetCode contest"));
//        String[] words = new String[]{"bella","label","roller"};
//        String[] words = new String[]{"cool","lock","cook"};

//        commonChars(words);
//        commonChars1(words);

//        String s = "10#11#12";
//        String s = "1326#";
//        freqAlphabets(s);
//        freqAlphabets1(s);

//        int[] a = {1,3,2,1};
//        getConcatenation(a);

//        int[] nums = {0,2,1,5,3,4};
//        int[] nums = {5,0,1,2,3,4};
//        buildArray(nums);

//        int[] nums = {1,3,-1,-3,5,3,6,7};
//        int k = 3;
//        int[] nums = {1};
//        int k = 1;
//        int[] nums = {1,-1};
//        int k = 1;
//        maxSlidingWindow(nums, k);

//        int nums[] = {2,5,1,3,4,7};
//        int n = 3;
//        int nums[] = {1,1,2,2};
//        int n = 2;
//        shuffle(nums, n);


//        ParkingSystemLeetCode parkingSystemLeetCode = new ParkingSystemLeetCode(0,0,2);
//        System.out.println(parkingSystemLeetCode.addCar(1));
//        System.out.println(parkingSystemLeetCode.addCar(2));
//        System.out.println(parkingSystemLeetCode.addCar(3));

//        int[] j = new int[]{1,2,3,1,1,3};
//        int[] j = new int[]{1,2,3};
//        numIdenticalPairs(j);

//        int[] j = new int[]{12,1,12};
//        int extraCandies = 10;
//        kidsWithCandies(j, extraCandies);

//        int[][] j =  {{1,2,3},{3,2,1}};
//        int[][] j =  {{1,5},{3,7},{3,5}};
//        maximumWealth(j);

//        interpret("G()(al)");
//        interpret("G()()()()(al)");

//        int[] nums = {7,7,7,7};
//        smallerNumbersThanCurrent(nums);

//        int[] nums = {1};
//        leftRightDifference(nums);

//        aa();

//        int[] nums = {3,3,3};
//        int target = 3;
//        searchRange(nums, target);

//        subString("abcabc");

//        int[] nums = {1};
//        int[] index = {0};
//        createTargetArray(nums, index);

//        int[] nums = {1,1,2,3};
//        decompressRLElist(nums);

//        balancedStringSplit("LLLLRRRR");

//        sumOfMultiples(15);

//        numberOfSteps(123);

//        truncateSentence("Hello how are you Contestant", 4);

//        String[] word1 = {"ab", "c"};
//        String[] word2 = {"a", "bc"};
//        arrayStringsAreEqual(word1, word2);

//        int[] nums={4,5,6,7,8,9};
//        arithmeticTriplets(nums, 2);

//        int[] gsize = {3,3,3,3,3,1,3};
//        groupThePeople(gsize);

//        int[] arr = {6,9,14,5,3,8,7,12,13,1};
//        sumOddLengthSubarrays(arr);

//    List<String> li = new ArrayList<>();
//        li.add("an");
//        li.add("apple");
////        li.add("charlie");
//        isAcronym(li, "a");

//        String[] wo = {"gin","zen","gig","msg"};
//        uniqueMorseRepresentations(wo);

//    String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
//    countConsistentStrings("cad", words);

//    int[] gain = {52,-91,72};
//    largestAltitude(gain);

//        int[] nums = {4,4,9,10,10,9,3,8,4,2,5,3,8,6,1,10,4,5,3,2,3,9,5,7,10,4,9,10,1,10,4};
//        maximizeSum(nums, 6);

//    maximum69Number(9999);

//        countAsterisks("yo|uar|e**|b|e***au|tifu|l");

//        int[][] re = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
//        kWeakestRows(re, 3);

//        removeOuterParentheses("(()())(())");
//        removeOuterParentheses("(()())(())(()(()))");

//        int[][] re = {{1,1,0},{1,0,1},{0,0,0}};
//        int[][] re = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        flipAndInvertImage(re);

//        int[] a = {1,3,4,3,2};
//        findDuplicate(a);

//        int[] a = {4,2,5,9,7,4,8};
//        System.out.println(maxProductDifference(a));

//        countPoints("B9R9G0R4G6R8R2R9G9");

//        int[] a = {1,2};
//        int[] b = {3,4};
//        findMedianSortedArrays(a,b);

//        replaceDigits("v0g6s4d");

//        String[] aa = {"aa","ab"};
//        maximumNumberOfStringPairs(aa);

//        String[] names = {"Mary","John","Emma"};
//        int[] heights = {180,165,170};
//        sortPeople(names, heights);

//        reversePrefix("abcdefd", 'z');

//        int[] nums = {1,2,3,4};
//        countPairs(nums, 1);

//        int[] seat = {3,20,17,2,12,15,17,4,15,20};
//        int[] students = {10,13,14,15,5,2,3,14,3,18};
//        minMovesToSeat(seat, students);

//        mergeAlternately("abcd","pq");

//        findDelayedArrivalTime(15,8);

//        int[][] a = {{1,1},{3,4},{-1,0}};
//        int[][] a = {{3,2},{-2,2}};
//        minTimeToVisitAllPoints(a);
//        String[] st = {"def","ghi"};
//        firstPalindrome(st);

//        commonFactors(25,30);
//        int[] a = {1,5,2,4,1};
//        minOperations(a);

//        int[][] a = {{5,8},{3,9},{5,12},{16,5}};
//        int[][] a = {{3,12},{3,9},{8,5}};
//        countGoodRectangles(a);

//        decodeAtIndex("leet2code3", 10);
//        maxDepth1("(1+(2*3)+((8)/4))+1");
//        maxDepth1("(1)+((2))+(((3)))");

//            int[] nums1 = {1,2,3};
//            int[] nums2 = {2,4,6};
//        int[] nums1 = {80,5,-20,33,26,29};
//        int[] nums2 = {-69,0,-36,52,-84,-34,-67,-100,80};
//            int[] nums1 = {1,2,3,3};
//            int[] nums2 = {1,1,2,2};
//            findDifference(nums1, nums2);

//        removeTrailingZeros("51230100");

//        System.out.println(isSameAfterReversals(0));

//        int[] f = {1,2,2,3};
//        isMonotonic(f);

//        int[] f = {13,25,83,77};
//        int[] f = {7,1,3,9};
//        separateDigits(f);

//        int[] f = {1,2,3,4};
//        int[] f = {3,5,0,3,4};
//        int[] f = {-2,1,2,-2,1,2};
//        int[] f = {-1,3,2,0};
//        find132pattern(f);

//        int[][] grid = {{1,2,4},{3,3,1}};
//        deleteGreatestValue(grid);

//        int[][] indices = {{0,1},{1,1}};
//        twoDarray(2,3,indices);

//        int[] nums = {3,2,4,4};
//        twoLargeNum(nums);
//        pri();
//        winnerOfGame("ABBBBBBBAAA");
//        generateTheString(32);

//        System.out.println(halvesAreAlike("textbook"));

//        int[] nums = {2,2,2};
//        majorityElement(nums);

//        int nums[] = {-3,4,3,2};
//        pivotArray(nums, 2);

//        Solution();

//        int[] price = {2,4,1};
//        int[] price = {1,2,1,2,1,3,5,1};
//        int[] price = {6,1,3,2,4,7};
//        int[] price = {7,1,5,3,6,4};
        int[] price = {1,2,4,2,5,7,2,4,9,0,9};
        maxProfitOld(price);
    }

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public static int maxProfitOld(int[] prices) {
        int maxDiff = 0;
        int index = 0;
        for(int i=0; i<prices.length-1;i++){
            System.out.println("prices[index] "+prices[index]+" index "+index+" prices[i+1] "+prices[i+1]);
            System.out.println("first if "+(prices[index] < prices[i+1]));

            if(prices[index] < prices[i+1] ){
                System.out.println("test "+(maxDiff < (prices[i+1]-prices[index])));

                if(maxDiff < (prices[i+1]-prices[index])) {
                    maxDiff = prices[i + 1] - prices[index];
                    System.out.println(" index " + index + " maxDiff " + maxDiff);
                }
            }
            else if(prices[index] > prices[i+1]){
                System.out.println("i is "+i);
                index = i;
                if(maxDiff < (prices[i+1] - prices[index])) {
                    maxDiff = prices[i + 1] - prices[index];
                    System.out.println(" else if index " + index + " maxDiff " + maxDiff);
                }
                else{
                    index++;
                }
            }
//            else{
//                System.out.println("in else");
//                index++;
//            }
            System.out.println("----");
        }
        System.out.println("result "+maxDiff);
        return maxDiff;
    }

    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        int purchaseVal = 0;
        int maxVal = 0;
        int maxValIndex = 0;
        for(int i=0; i<prices.length-1;i++){
            if(i == 0){
                purchaseVal = prices[i];
                maxVal = prices[i];
                maxValIndex = i;
                continue;
            }

            if(purchaseVal > prices[i]){
                purchaseVal = prices[i];
                if(maxValIndex < i){
                    maxValIndex = i;
                    maxVal = prices[i];
                }
            }

            if(maxVal - purchaseVal > maxDiff){
                maxDiff = maxVal - purchaseVal;
            }
        }
        System.out.println("result "+maxDiff);
        return maxDiff;
    }

    public static void Solution(){
        codec co = new codec();
        String ul = co.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println("---");
        System.out.println("with tiny "+ul );

        System.out.println(co.decode(ul));

    }

    //https://leetcode.com/problems/partition-array-according-to-given-pivot/
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int index = 0;
        for(int num : nums){
            if(num<pivot){
                result[index] = num;
                System.out.println(Arrays.toString(result));
                index++;
            }
        }
        for(int num : nums){
            if(num == pivot){
                result[index] = num;
                index++;
            }
        }
        for(int num : nums){
            if(num>pivot){
                result[index] = num;
                index++;
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    //https://leetcode.com/problems/majority-element-ii/
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        System.out.println(mp);

        int appear = nums.length/3;
        System.out.println("Appear "+appear);

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > appear){
                li.add(entry.getKey());
            }
        }
        System.out.println(li);

        return li;
    }

    //https://leetcode.com/problems/determine-if-string-halves-are-alike/
    public static boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();

        int count = 0;
        s = s.toLowerCase();

        int len = s.length()/2;
        for(int i=1;i<=s.length();i++){
            boolean b = ch[i-1] == 'a' || ch[i-1] == 'e' || ch[i-1] == 'i' || ch[i-1] == 'o' || ch[i-1] == 'u';

            if(i <= len) {
                if (b) {
                    count++;
                }
            }
            else{
                if (b) {
                    count--;
                }
            }
        }

        if(count == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //https://leetcode.com/problems/counting-words-with-a-given-prefix/
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }

    //https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
    public static String generateTheString(int n) {
        StringBuffer str= new StringBuffer("");
        if(n%2 == 0){
            str.append('a');
            for(int i=0;i<n-1;i++){
                str.append('b');
            }
        }
        else{
            for(int i=0;i<n;i++){
                str.append("");
            }
        }

        System.out.println(str);

        return str.toString();
    }

    //https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
    public static boolean winnerOfGame(String colors) {
        boolean flag = false;
        int l=0;
        int aindex = 0;
        int bindex = 0;

        boolean aFlag = true;
        boolean bFlag = true;
        while(l<colors.length()) {
            aFlag = game(l, colors, 'A');
            bFlag = game(l, colors, 'B');
            System.out.println("aFlag " + aFlag);
            System.out.println("bFlag " + bFlag);

            if (aFlag == true) {
                aindex++;
                System.out.println("aindex "+aindex);
            }
            if (bFlag == true) {
                bindex++;
                System.out.println("bindex "+bindex);
            }
            System.out.println("----");
            l++;
        }

        if(aindex>bindex){
            flag = true;
        }
        else{
            flag = false;
        }
        System.out.println("final output "+flag);
        return flag;
    }

    public static boolean game(int index, String colors, char player){
        for(int i=index; i<colors.length()-2; i+=2){
            int j=i+1;
            int k=j+1;
            System.out.println(colors.charAt(i) +" "+ colors.charAt(j) +" "+ colors.charAt(k) +" "+ player);
            if(colors.charAt(i) == player && colors.charAt(j) == player && colors.charAt(k) == player){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public static void pri(){
        String s1 = "java";
        int x = 99;
        int stringLength = s1.length();
        while (stringLength<15 ){
            s1 = s1+" ";
            System.out.println(s1+"-");
            stringLength = s1.length();
        }

        String num = String.valueOf(x);
        if(num.length()<3){
            while(num.length()<3){
                num = "0"+num;
            }
            System.out.println(s1+num);
        }
        else{
            System.out.println(s1+num);
        }
    }

    //find the 2 largest number in array
    public static void twoLargeNum(int[] nums){
        int firstNum = 0;
        int secondNum = 0;

        for(int i=0;i<nums.length;i++){

            if(firstNum<nums[i]){
                secondNum = firstNum;
                firstNum = nums[i];
            }

            System.out.println("firstNum "+firstNum+" secondNum "+secondNum);
            System.out.println("----");
        }

    }

    public static int twoDarray(int row, int column, int[][] indices){
        int[][] d = new int[row][column];
        System.out.println(Arrays.deepToString(d));

        for(int i=0;i<indices.length;i++) {
            int a = indices[i][0];
            int b = indices[i][1];

            for(int j=0;j<column;j++) {
                d[a][j]++;
            }

            for(int j=0; j<row; j++){
                d[j][b]++;
            }
        }
        int odd = 0;
        for(int i=0; i<d.length;i++){
            for(int j=0; j<d.length; j++){
                if(d[i][j] % 2 == 1){
                    odd++;
                }
            }
        }


        System.out.println(Arrays.deepToString(d));
        return odd;
    }

    //https://leetcode.com/problems/delete-greatest-value-in-each-row/
    public static int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }

        for(int i=0;i<grid[0].length;i++){
            int max = 0;
            for(int j=0;j<grid.length;j++){
                max = Math.max(max,grid[j][i]);
            }
            sum += max;
            System.out.println("sum "+sum);
            System.out.println("---");
        }
        System.out.println(sum);
        return sum;
    }

    //https://leetcode.com/problems/132-pattern/?envType=daily-question&envId=2023-09-30
    public static boolean find132pattern(int[] nums) {
        boolean flag = false;
        int max3 = Integer.MIN_VALUE;
        System.out.println("max3 "+max3);

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k < nums.length; k++) {
                    System.out.println("inside the second loop");
                    System.out.println("nums[i] = " + nums[i] + " nums[k] = " + nums[k] + " nums[j] = " + nums[j]);
                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
                        flag = true;
                        break;
                    }
                    System.out.println("---");
                }
                if (flag == true) {
                    break;
                }
            }
            if (flag == true) {
                break;
            }

        }
        System.out.println(flag);
        return flag;
    }

    //https://leetcode.com/problems/separate-the-digits-in-an-array/
    public static int[] separateDigits(int[] nums) {
        List<Integer> li = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                String st = String.valueOf(nums[i]);
                for(int j=0;j<st.length();j++){
                    li.add(Integer.parseInt(String.valueOf(st.charAt(j))));
                }
            }
            else{
                li.add(nums[i]);
            }
        }
        System.out.println(li);
        int[] in = new int[li.size()];
        for(int i=0;i<li.size();i++){
            in[i] = li.get(i);
        }
        System.out.println(Arrays.toString(in));

        return in;
    }

    public static boolean isMonotonic(int[] nums) {
        boolean flag = false;
        for(int i=0;i<nums.length-1;i++){
            System.out.println("nums[i] "+nums[i] +" nums[i + 1] "+nums[i + 1]);
            if(nums[i]<=nums[i+1]){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println("after first if "+flag);
        if(flag != true) {
            for (int i = nums.length-1; i>0 ; i--) {
                System.out.println("nums[i] "+nums[i] +" nums[i - 1] "+nums[i - 1]);
                if (nums[i] <= nums[i - 1]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("after sec if "+flag);

        System.out.println(flag);
        return flag;
    }

    //https://leetcode.com/problems/a-number-after-a-double-reversal/
    public static boolean isSameAfterReversals(int num) {
        if(num<9){
            return true;
        }

        String n = String.valueOf(num);
        int len = 0;
        for(int i=n.length()-1; i>=0; i--){
            if(n.charAt(i) != '0'){
                n = n.substring(0,n.length()-len);
                break;
            }
            len++;
        }
        System.out.println(n);
        int newNum = Integer.parseInt(n);
        if(newNum != num){
            return false;
        }

        return true;
    }

    //https://leetcode.com/problems/remove-trailing-zeros-from-a-string/description/
    public static String removeTrailingZeros(String num) {
        int count = 0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i) == '0'){
                count++;
            }
            else{
                return  num.substring(0,num.length()-count);
            }
        }
        return "";
    }

    //https://leetcode.com/problems/find-the-difference-of-two-arrays/
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(diff(nums1, nums2, nums1.length, nums2.length));
        System.out.println("first");
        li.add(diff(nums2, nums1, nums2.length, nums1.length));
        System.out.println(li);
        return li;
    }
    public static List<Integer> diff(int[] first, int[] second, int f, int s){
        List<Integer> li = new ArrayList<>();
//        int len = first.length<second.length ? first.length:second.length;

        for(int i=0;i<f;i++){
            boolean flag = false;
            for(int j=0;j<s;j++){
                if(first[i] == second[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                if(!li.contains(first[i])) {
                    li.add(first[i]);
                }
            }
        }

        return li;
    }

    public static int maxDepth1(String s) {

        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
                System.out.println("inside if count "+count);
            }
            if(s.charAt(i) == ')'){
                max = max>count ? max:count;
                System.out.println("inside if max "+max);
                count--;
                }
            }

        System.out.println("max = "+max);
        return max;
    }

    //https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses
    public static int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
                System.out.println("inside if count "+count);
            }
            if(s.charAt(i) == ')'){
                System.out.println("oooo");
                if(st.contains('(')){
                    max = max>count ? max:count;
                    System.out.println("inside if max "+max);
                    st.pop();
                    count--;
                }
            }
        }
        System.out.println("max = "+max);
        return max;
    }

    //https://leetcode.com/problems/decoded-string-at-index/
    public static String decodeAtIndex(String s, int k) {
        StringBuffer str = new StringBuffer("");
        StringBuffer init = new StringBuffer("");
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int len = 0;
            System.out.println(str.length());
            if(str.length()<k) {
                if ((int) ch[i] >= 97 && (int) ch[i] <= 122) {
                    str.append(ch[i]);
                    System.out.println("str if "+str);
                } else {
                    init.append(str);
                    len = Integer.parseInt(String.valueOf(ch[i]));
                    while (len - 1 > 0) {
                        str.append(init);
                        System.out.println("str else " + str);
                        len--;
                    }
                    init.delete(0, init.length());
                }
                System.out.println("----- "+str);
            }
        }

        char res = str.charAt(k-1);
        System.out.println(str);
        System.out.println("result "+res);
        return String.valueOf(res);
    }

    //https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
    public static int countGoodRectangles(int[][] rectangles) {
        int intMaxCount = 0;
        int intMaxNum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
                int min = Math.min(rectangles[i][0], rectangles[i][1]);
                if(mp.containsKey(min)){
                    mp.put(min, mp.get(min)+1);
                }
                else{
                    mp.put(min, 1);
                }
                if(min>=intMaxNum){
                    intMaxCount = mp.get(min);
                    intMaxNum = min;
                }
        }
        System.out.println("intMaxCount "+intMaxCount +" intMaxNum "+intMaxNum);
        System.out.println(mp);

        return intMaxCount;
    }

    public static int minOperations(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                int diff = Math.abs(nums[i]-nums[i+1]);
                count += diff+1;
                nums[i+1] = nums[i+1]+diff+1;
                System.out.println(Arrays.toString(nums));
                System.out.println("--");
            }
        }
        System.out.println("count "+count);
        return count;
    }

    public static int commonFactors(int a, int b) {
        int count = 0;
        int min = 0;
        min = a>b ? b:a;
        for(int i=1; i<=min; i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            StringBuffer str = new StringBuffer("");
            char[] ch = words[i].toCharArray();
            for(int j=ch.length-1; j>=0; j--){
                str.append(ch[j]);
            }
            if(str.toString().equals(words[i])){
                System.out.println(str);
                return str.toString();
            }
        }
        return "";
    }

    //https://leetcode.com/problems/minimum-time-visiting-all-points/
    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;

        for(int i=0;i<points.length-1; i++){
            count += Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        System.out.println("count = "+count);
        return count;
    }

    //https://leetcode.com/problems/calculate-delayed-arrival-time/description/
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    //https://leetcode.com/problems/merge-strings-alternately/
    public static String mergeAlternately(String word1, String word2) {
        int len = 0;
        if(word1.length()<word2.length()){
            len = word1.length();
        }
        else{
            len = word2.length();
        }
        StringBuffer str = new StringBuffer("");

        for(int i=0; i<len; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        if(word1.length()>len) {
            str.append(word1.substring(len));
        }
        else if (word2.length()>len){
            str.append(word2.substring(len));
        }
        System.out.println(str);
        return str.toString();
    }

    //https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        System.out.println(Arrays.toString(seats));
        System.out.println(Arrays.toString(students));
        Map<Integer, Integer> mp = new HashMap<>();
        int move = 0;
        for(int i=0; i<seats.length; i++){
            if(!mp.containsKey(seats[i])){
//                mp.put(seats[i], students[i]);
                move += Math.abs(seats[i]-students[i]);
            }
        }
        System.out.println("Move "+move);
        return move;
    }

    //https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++) {
                if (nums[i] > 0 && nums[j] > 0) {
                    System.out.println("nums[i] "+nums[i] + " nums[j] "+nums[j]);
                    if (nums[i] == nums[j]) {
                        System.out.println((i * j) % k+" i= "+i+" j= "+j);
                        if ((i * j) % k == 0) {
                            count++;
                            System.out.println("count = "+count);
                        }
                    }
                }
            }
            System.out.println("---");
        }
        System.out.println(count);
        return count;
    }

    //https://leetcode.com/problems/reverse-prefix-of-word/
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        System.out.println(index);
        if(index != -1) {
            StringBuffer sub = new StringBuffer(word.substring(0, index + 1));
            String remain = word.substring(index + 1, word.length());
            System.out.println("Remian = " + remain);
            System.out.println(sub.reverse() + remain);
            return sub.reverse()+remain;
        }
        else{
            return word;
        }

    }

    //https://leetcode.com/problems/sort-the-people/
    public static String[] sortPeople(String[] names, int[] heights) {
        String[] str = new String[heights.length];
        HashMap<Integer, String> mp = new HashMap<>();
        for(int i=0;i<heights.length; i++){
             mp.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int index = 0;
        for(int i= heights.length-1;i>=0;i--){
            str[index] = mp.get(heights[i]);
            index++;
        }
        System.out.println(Arrays.toString(str));

        return str;
    }

    //https://leetcode.com/problems/find-maximum-number-of-string-pairs/
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1;j<words.length; j++){
                String c = new StringBuffer(words[j]).reverse().toString();
                System.out.println("words[i] "+words[i]+" condition "+words[i].equals(c));
                if(words[i].equals(c)){
                    count++;
                    System.out.println("count "+count);
                    break;
                }
                System.out.println("----");
            }
        }
        System.out.println(count);
        return count;
    }

    //https://leetcode.com/problems/replace-all-digits-with-characters/
    public static String replaceDigits(String s) {
        StringBuffer str = new StringBuffer(s);
        for(int i=1;i<s.length();i+=2){
//            System.out.println("char "+s.charAt(i-1));
//            int ch = s.charAt(i-1);
//            System.out.println("ch "+ch);
//
//            System.out.println("char "+s.charAt(i));
//            int ch0 = s.charAt(i)-48;
//            System.out.println("ch0 "+ch0);

            char c = (char) (s.charAt(i-1)+s.charAt(i)-'0');
            System.out.println(c);
            str.setCharAt(i,c);
            System.out.println(str);
            System.out.println("---");
        }

        System.out.println(str);
        return str.toString();
    }

    public boolean aa1(String s, String t){
        if(s.length() == 0){
            return true;
        }
        int len = 0;
        boolean flag = false;;
        for(int i=0;i<s.length();i++){
            flag = false;
            for(int k=len; k<t.length(); k++){

                if(s.charAt(i) == t.charAt(k)){
                    flag = true;
                    len = k+1;
                    break;
                }
            }
            if(flag != true){
                break;
            }
        }

        if(flag){
            return flag;
        }
        else{
            flag = false;
            return flag;
        }
    }

    //https://leetcode.com/problems/median-of-two-sorted-arrays/?envType=daily-question&envId=2023-09-21
    public static double findMedianSortedArrays(int nums1[], int[] nums2) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums1.length; i++){
            li.add(i, nums1[i]);
        }

        int len = nums1.length;
        for(int i=0;i<nums2.length; i++){
            li.add(len, nums2[i]);
            len++;
        }
        Collections.sort(li);
        System.out.println(li);
        float ans;

        if(li.size() %2 != 0){
            ans = li.get(li.size()/2);
            System.out.println(ans);
            return ans;
        }
        else{
            int lenth = li.size()/2;
            System.out.println(li.get(lenth));
            System.out.println(li.get(lenth-1));
            ans = (li.get(lenth)+li.get(lenth-1))/2.0f;
            System.out.println("even "+ans);
            return ans;
        }

    }

    //https://leetcode.com/problems/rings-and-rods/
    public static int countPoints(String rings) {
        Map<Integer, String> mp = new HashMap<>();
        for(int i=0;i<rings.length(); i += 2){
            int parseInt = Integer.parseInt(String.valueOf(rings.charAt(i + 1)));
            if(mp.containsKey(parseInt)) {
                String value = mp.get(parseInt);
                mp.put(parseInt, rings.charAt(i)+value);
            }
            else{
                mp.put(parseInt, String.valueOf(rings.charAt(i)));
            }
        }
        System.out.println(mp);
        int r = 0, g = 0, b = 0, count = 0;
        for(Map.Entry<Integer, String> e : mp.entrySet()){
            System.out.println(e);
            if(e.getValue().length() >= 3){
                for(int i=0; i<e.getValue().length();i++ ) {
                    if (String.valueOf(e.getValue().charAt(i)).equals("R")) {
                        r++;
                        System.out.println("inside r " + r);
                    }
                    if(String.valueOf(e.getValue().charAt(i)).equals("G")){
                        g++;
                        System.out.println("inside g "+g);
                    }

                    if(String.valueOf(e.getValue().charAt(i)).equals("B")){
                        b++;
                        System.out.println("inside b "+b);
                    }
                }

                if(r >= 1 && g >= 1 && b >= 1){
                    count++;
                }
                r = 0;
                g = 0;
                b = 0;
                System.out.println("----");
            }
        }
        System.out.println(count);
        return count;
    }

    //https://leetcode.com/problems/count-good-triplets/description/
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(Math.abs(arr[i]-arr[j])<=a){
                        if(Math.abs(arr[j]-arr[k])<=b){
                            if(Math.abs(arr[i]-arr[k])<=c){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    //https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return  ((nums[nums.length-1] * nums[nums.length-2]- nums[0]*nums[1]) );

    }

    //https://leetcode.com/problems/find-the-duplicate-number/?envType=daily-question&envId=2023-09-19
    public static int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])){
                System.out.println(nums[i]);
                return nums[i];
            }
            else{
                st.add(nums[i]);
            }
        }

        return -1;
    }

    //https://leetcode.com/problems/flipping-an-image/
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image.length];
        for(int i=0; i<image.length; i++){
            int count = 0;
            for(int j=image[i].length-1; j>=0; j--){
                result[i][count] = image[i][j];
                count++;
            }
            System.out.println(Arrays.deepToString(result));
            for(int j=0;j<result[i].length; j++){
                if(result[i][j] == 0){
                    result[i][j] = 1;
                }
                else{
                    result[i][j] = 0;
                }
            }
            System.out.println("After Flip "+Arrays.deepToString(result));
        }
        return result;
    }
    
    //https://leetcode.com/problems/remove-outermost-parentheses/
    public static String removeOuterParentheses(String s) {
        StringBuffer str = new StringBuffer("");
        int count = 0;
        int beginIndex = 0, endIndex = 0;
        ArrayList<String> li = new ArrayList<>();
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else{
                count--;
            }
            endIndex = i;
            if(count == 0){
                li.add(s.substring(beginIndex, endIndex+1));
                beginIndex = endIndex+1;
            }
        }
        System.out.println(li);

        for(int i=0;i<li.size();i++){
            String st = li.get(i);
            System.out.println("st "+st);
            String sp = st.replaceFirst("\\(","");
            System.out.println(sp);
            String p = sp.substring(0, sp.length()-1);
            str.append(p);
        }
        System.out.println("result = "+str);
        return str.toString();
    }

    //https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/?envType=daily-question&envId=2023-09-18
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[mat.length];
        int[] finalRes = new int[k];

            for(int i=0;i<mat.length;i++){
                int count = 0;
                for(int j=0;j<mat[i].length;j++){
                    if(mat[i][j] == 1){
                        count++;
                    }
                }
                result[i] = count*1000+i;
            }
        Arrays.sort(result);
            for(int i=0;i<k;i++){
                finalRes[i] = result[i]%1000;
            }
        return result;
    }

    //https://leetcode.com/problems/count-asterisks/
    public static int countAsterisks(String s) {
        int count = 0;
        String[] str = s.split("\\|");
        System.out.println(Arrays.toString(str));
        for(int i=0; i<str.length; i+=2){
            for(int j=0; j<str[i].length(); j++){
                System.out.println(str[i] + " "+j);
                if(str[i].charAt(j) == '*'){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    //https://leetcode.com/problems/maximum-69-number/
    public static int maximum69Number (int num) {
        int max = num;
        String n = String.valueOf(num);
        StringBuilder str = new StringBuilder(n);
        int i=n.length()-1;
        System.out.println("str "+str+" i "+i);
        boolean flag;
        while(num>0){
            flag = false;
            int rem = num%10;
            System.out.println("rem "+rem+" i "+i);

            if(rem == 6){
                str.setCharAt(i, '9');
                System.out.println("str "+str);
                flag = true;
            }
            num = num/10;
            if(max<Integer.parseInt(str.toString())){
                max = Integer.parseInt(str.toString());
            }

            if(flag == true){
                str.setCharAt(i,'6');
            }
            i--;
            System.out.println(str);
            System.out.println("---");
        }
        System.out.println(max);
        return max;
    }

    //https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/
    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int i=0;i<nums.length; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        System.out.println("max "+max);

        for(int i=0;i<k;i++){
            sum += max;
            max++;
        }
        System.out.println(sum);
        return sum;
    }

    //https://leetcode.com/problems/find-the-highest-altitude
    public static int largestAltitude(int[] gain) {
        int[] res = new int[gain.length + 1];
        res[0] = 0;
        int ans = 0;
        for (int i = 0; i < gain.length; i++) {
            res[i + 1] = gain[i] + res[i];
            if(res[i+1]>=0 && ans<res[i+1]){
                ans = res[i + 1];
            }
            System.out.println(Arrays.toString(res));
        }
        System.out.println("----");
        System.out.println(Arrays.toString(res));
        System.out.println(ans);
        return ans;
    }

        //https://leetcode.com/problems/count-the-number-of-consistent-strings/
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i=0;i<words.length; i++){
            boolean flag = false;
            for(int j=0;j<words[i].length();j++) {
//                System.out.println(words[i]);
                if (allowed.contains(String.valueOf(words[i].charAt(j)))) {
//                    System.out.println(words[i].charAt(j));
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Integer, String> mp = new HashMap<>();
        int l=0;
        for(int i=97;i<123;i++){
            mp.put(i,str[l]);
            l++;
        }

        Set<String> resultSet = new HashSet<>();
        for(int i=0;i<words.length; i++){
            StringBuffer st = new StringBuffer("");
            for(int j=0; j<words[i].length(); j++){
                st.append(mp.get((int) words[i].charAt(j)));
            }
            resultSet.add(st.toString());
            System.out.println(resultSet.size());
        }
        return resultSet.size();
    }

    //https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
    public static boolean isAcronym(List<String> words, String s) {
        StringBuffer str = new StringBuffer("");
        boolean flag = false;
        for(int i=0;i<words.size();i++){
            str.append(words.get(i).charAt(0));
        }
        if(s.equals(str.toString())){
            flag = true;
        }
        System.out.println(str+" "+flag);
        return true;
    }

    //https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1; j<=arr.length; j += 2){
                for(int k=i; k<j; k++) {
                    sum += arr[k];
                    System.out.println(sum);
                }
            }
        }
        System.out.println("final = "+sum);
        return sum;
    }

    //https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/?envType=daily-question&envId=2023-09-11
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> resultLi = new ArrayList<>();
        Map<Integer, Integer> mp  = new HashMap<>();
        List<Integer> unique = new ArrayList<>();
        Map<Integer, Integer> indexMap  = new HashMap<>();

        int l = 0;
        for(int i: groupSizes){
            indexMap.put(l,i);
            l++;
            if(mp.containsKey(i)){
                int count = mp.get(i);
                mp.put(i, ++count);
            }
            else {
                unique.add(i);
                mp.put(i,1);
            }
        }
        System.out.println(mp);
        System.out.println(unique);
        System.out.println("indexMap " +indexMap);

        for(int i=0;i<mp.size();i++){

            int len = mp.get(unique.get(i));
            System.out.println(len+" len");
            int size;
            if(unique.get(i) == len){
                size = len;
            }else {
                size = len / 2;
            }

            if(size<1){
                size = 1;
            }
            System.out.println(size);
            List<Integer> li;
            while(len > 0) {
                li = new ArrayList<>();
                for (int j = 0; j < size; j++) {
                    li.add(unique.get(i));
                }
                len = len - size;
                System.out.println(li);
                resultLi.add(li);
            }

            System.out.println("----");
            System.out.println(resultLi);
        }

        return resultLi;
    }

    //https://leetcode.com/problems/number-of-arithmetic-triplets/
    public static int arithmeticTriplets(int[] nums, int diff) {
        int j;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i] == diff && nums[j]>nums[i]){
                    break;
                }
            }
            for(int k=j+1;k<nums.length;k++){
                if(nums[k]-nums[j] == diff && nums[k]>nums[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    //https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer str1 = new StringBuffer("");
        for(int i=0;i<word1.length;i++){
            str1.append(word1[i]);
        }

        StringBuffer str2 = new StringBuffer("");
        for(int i=0;i<word2.length;i++){
            str2.append(word2[i]);
        }
        System.out.println(str1);
        System.out.println(str2);
        if(String.valueOf(str1).equals(String.valueOf(str2))){
            return true;
        }
        else {
            return false;
        }

    }

    //https://leetcode.com/problems/truncate-sentence/
    public static String truncateSentence(String s, int k) {
        String[] word = s.split(" ");
        StringBuffer str = new StringBuffer("");
        for(int i=0;i<k;i++){
            str.append(word[i]+" ");

        }
        System.out.println(str);
        return str.toString().trim();
    }

    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public static int numberOfSteps(int num) {
        boolean flag = true;
        int count = 0;
        while(flag){
            if(num%2 == 0){
                num = num/2;
                count++;
            }
            else{
                num = num-1;
                count++;
            }
            if(num == 0){
                flag = false;
            }
        }
        System.out.println(count);
        return count;
    }

    //https://leetcode.com/problems/sum-multiples/
    public static int sumOfMultiples(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3 == 0){
                count += i;
            }
            else if(i%5 == 0){
                count += i;
            }
            else if(i%7 == 0){
                count += i;
            }
            System.out.println(i+" "+count);

        }

        System.out.println("-- "+count);
        return count;
    }

    //https://leetcode.com/problems/split-a-string-in-balanced-strings/
    public static int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;
        int finalCount = 0;

        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals("L")){
                lCount++;
                System.out.println("inside the if "+s.charAt(i)+" "+lCount);
            }
            else{
                rCount++;
                System.out.println("inside the else "+s.charAt(i)+" "+rCount);
            }
            if(rCount == lCount){
                finalCount++;
                rCount = 0;
                lCount = 0;
                System.out.println("inside the equal final "+finalCount);
            }
            System.out.println("--------");
        }
        System.out.println(finalCount   );
        return finalCount;
    }

    //https://leetcode.com/problems/decompress-run-length-encoded-list/
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0;j<freq;j++){
                li.add(val);
            }
            i++;
        }
        int[] result = new int[li.size()];
        for(int i=0;i<li.size();i++){
            result[i] = li.get(i);
        }

        return result;
    }

    //https://leetcode.com/problems/create-target-array-in-the-given-order/
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            li.add(index[i], nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            result[i] = li.get(i);
        }
        return result;
    }

    //All subString of an String
    public static void subString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1; j<=s.length(); j++){
                String subStr = s.substring(i,j);
                System.out.println(subStr);
            }
        }
    }

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-arra
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int count = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                if(count>=2){
                    result[count-count+1] = i;
                }
                else{
                    result[count] = i;
                }
                count++;
                flag = true;
            }
        }
        if(result[1] == 0){
            result[1] = result[0];
        }
        if(flag == false){
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }

        public static String lcp (String s, String t){
            int n = Math.min(s.length(), t.length());
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    System.out.println("00 == "+s.substring(0, i));
                    return s.substring(0, i);
                }
            }
            return s.substring(0, n);
        }

        public static void aa() {
            String str = "abcbcabcda";
            String lrs="";
            int n = str.length();

            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n; j++){
                    //Checks for the largest common factors in every substring
                    System.out.println("str.substring(i,n) "+str.substring(i,n));
                    System.out.println("str.substring(j,n) "+str.substring(j,n));

                    String x = lcp(str.substring(i,n),str.substring(j,n));
                    System.out.println("x = "+x);
                    //If the current prefix is greater than previous one
                    //then it takes the current one as longest repeating sequence
                    if(x.length() > lrs.length()) lrs=x;
                    System.out.println(lrs);
                    System.out.println("---------");
                }
            }
            System.out.println("Longest repeating sequence: "+lrs);
        }

    public static int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int count = nums.length;
        for(int i=0;i<nums.length;i++){
            if(i ==0){
                left[i] = 0;
            }
            else{
                left[i] = left[i-1] + nums[i-1];
            }
        }
        System.out.println(Arrays.toString(left));

        for(int i=nums.length-1; i>=0; i--){
            if(i == nums.length-1){
                right[i] = 0;
            }
            else{
                right[i] = right[i+1] + nums[i+1];
            }
        }
        System.out.println("right "+Arrays.toString(right));

        for(int i=0;i<nums.length;i++){
            int re = left[i] - right[i];
            if(re<0){
                re = (re-re)-re;
            }
            result[i] = re;
        }
        System.out.println("result "+Arrays.toString(result));
        return result;
    }

    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static String interpret(String command) {
        String result = "";

        for(int i=0;i<command.length();i++){
            String ch = String.valueOf(command.charAt(i));
            if(ch.equals("G")){
                result += "G";
            }
            else if(ch.equals("(")){
                if(String.valueOf(command.charAt(i+1)).equals(")")){
                    result += "o";
                }
                if(ch.equals("(") && String.valueOf(command.charAt(i+1)).equals("a")){
                    result += "al";
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static int maximumWealth(int[][] accounts) {
        int finalSum = 0;
        System.out.println(accounts.length);
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            int index = accounts[i].length;
            for(int j=0;j<index;j++){
                sum += accounts[i][j];
                System.out.println("sum = "+sum);
                if(finalSum < sum){
                    System.out.println("finalSum = "+finalSum);
                    finalSum = sum;
                }
                System.out.println("----");
            }
        }

        System.out.println(finalSum);
        return finalSum;
    }

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li = new ArrayList<>();
        int max = candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<=candies[i]){
                max = candies[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<candies.length;i++){
            if(max <= (candies[i]+extraCandies)){
                li.add(true);
            }
            else {
                li.add(false);
            }
        }
        System.out.println(li);
        return li;
    }

//https://leetcode.com/problems/number-of-good-pairs/
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j] && i<j){
                    count++;
                    System.out.println("count is increase "+count+"  Pair = "+nums[i]+", "+nums[j]+" index of "+i+", "+j);
                }
            }
        }
        return count;
    }

    //https://leetcode.com/problems/shuffle-the-array/description/
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j=0;
        int k = n;
        for(int i=0;i<k;i++){
            arr[j] = nums[i];
            j++;
            System.out.println("j = "+j);
            arr[j] = nums[n];
            n++;
            j++;
            System.out.println("i = "+i);
            System.out.println("j = "+j);
            System.out.println("n = "+n);
            System.out.println(Arrays.toString(arr));
            System.out.println("------");
        }
        return arr;
    }

//    https://leetcode.com/problems/sliding-window-maximum/
    public static int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        if(nums.length == 1){
            System.out.println(Arrays.toString(nums));
            return nums;
        }else {
            int len = nums.length - k+1;
            int[] result = new int[len];

            for (int i = 0; i < len; i++) {
                for (int j = i; j < k + i; j++) {
                    li.add(nums[j]);
                }
                System.out.println(li);
                result[i] = Collections.max(li);
                li.clear();
            }
            System.out.println(Arrays.toString(result));
            return result;
        }
    }

//    https://leetcode.com/problems/build-array-from-permutation/
    public static int[] buildArray(int[] nums) {
        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            arr[i] = nums[temp];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

//    https://leetcode.com/problems/concatenation-of-array/
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public static String freqAlphabets1(String s) {

        for(int i=10;i<=26;i++){
            s = s.replaceAll(i+"#", (char)('a'+(i-1))+"");
        }

    for(int i=0;i<=9;i++){
        s = s.replaceAll(String.valueOf(i), (char)('a'+(i-1))+"");
    }
        System.out.println(s);
        return s;
}

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
    public static String freqAlphabets(String s) {
        Map<String, String> mp = new HashMap<>();
        mp.put("1", "a");
        mp.put("2", "b");
        mp.put("3", "c");
        mp.put("4", "d");
        mp.put("5", "e");
        mp.put("6", "f");
        mp.put("7", "g");
        mp.put("8", "h");
        mp.put("9", "i");
        mp.put("10", "j");
        mp.put("11", "k");
        mp.put("12", "l");
        mp.put("13", "m");
        mp.put("14", "n");
        mp.put("15", "o");
        mp.put("16", "p");
        mp.put("17", "q");
        mp.put("18", "r");
        mp.put("19", "s");
        mp.put("20", "t");
        mp.put("21", "u");
        mp.put("22", "v");
        mp.put("23", "w");
        mp.put("24", "x");
        mp.put("25", "y");
        mp.put("26", "z");

        List<String> li = new ArrayList<>();
        String result = "";
        s = s.replaceAll("#","# ");
        String[] splitStr = s.split(" ");

        for(int i=0;i<splitStr.length;i++){
            String str = splitStr[i].trim();
            System.out.println(str);
            if(str.contains("#")){
                str = str.replaceAll("#","");
                if(str.length() == 2){
                    li.add(str);
                }
                else{
                    str = str.replaceAll("#","");
                    String subStr = str.substring(str.length()-2);
                    System.out.println("SubStr = "+subStr);

                    String remainStr = str.replace(subStr,"");
                    System.out.println("new remainStr "+remainStr);
                    for(int k=0;k<remainStr.length();k++){
                        li.add(String.valueOf(remainStr.charAt(k)));
                    }
                    li.add(subStr);
                }
            }
            else{
                for(int j=0;j<str.length();j++){
                    System.out.println(str.length());
                    li.add(String.valueOf(str.charAt(j)));
                }
            }
        }

        System.out.println("---------List "+li);

        for(int i=0;i<li.size();i++){
//            System.out.println(li.get(i));
//            System.out.println(mp.get(li.get(i)));
            result += mp.get(li.get(i));
        }
        System.out.println("--------result - "+result);
        return result;
    }

    // https://leetcode.com/problems/find-common-characters/
    public static List<String>  commonChars1(String[] words){
        List<String> li = new ArrayList<>();
        String str = words[0];
        if(words.length == 1) {
            for (int i = 0; i < str.length(); i++) {
                li.add(String.valueOf(str.charAt(i)));
            }
            return li;
        }

        for(int i=0;i<str.length();i++){
            String letter = String.valueOf(str.charAt(i));
//            System.out.println("letter = "+letter);
            int flag=1;
            for(int j=0;j<words.length;j++){
                if(words[j].contains(letter)){
                    System.out.println(words[j]+"    "+letter);
                    words[j] = words[j].replaceFirst(letter,"");
                }
                else{
                    flag = 0;
                    break;
                }
            }
            if(flag == 0){
                flag = 1;
            }
            else{
                li.add(letter);
            }
        }
        System.out.println(li);
        return li;
    }

    public static List<String> commonChars(String[] words) {
        List<String> li = new ArrayList<>();
        List<String> wdli1 = new ArrayList<>();
        List<String> wdli2 = new ArrayList<>();
        List<String> wdli3 = new ArrayList<>();
        int len = words.length;
        System.out.println(len);
        if(len>1){
            wdli1 = getListFromWord(words[0]);
            wdli2 = getListFromWord(words[1]);

            System.out.println(" wdli1 "+wdli1.size()+" wdli2 "+wdli2.size());

            for(int i=0;i<wdli1.size(); i++){
                for(int j=0;j<wdli2.size();j++){
                    System.out.println(i +" i "+ " j "+j);
                    if(wdli1.get(i).equals(wdli2.get(j))){
                        li.add(wdli1.get(i));
                        wdli2.remove(j);
                    }
                }
            }
            System.out.println(li);
            System.out.println("-------");
            wdli3 = getListFromWord(words[2]);
            int lenLi = li.size();
            List<String> newLi = new ArrayList<>();
            System.out.println(lenLi);
            for(int i=0; i<lenLi; i++) {
                for(int j=0; j<wdli3.size(); j++) {
                    if (li.get(i).equals(wdli3.get(j))) {
                        newLi.add(wdli3.get(j));
                        wdli3.remove(j);
                    }
                }
            }
            System.out.println(newLi);
        }
        return li;
    }

    private static List<String> getListFromWord(String wd){
        List<String> li = new ArrayList<>();
        for(int i=0;i<wd.length();i++){
            li.add(String.valueOf(wd.charAt(i)));
        }
        return li;
    }

    //https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public static String reverseWords(String s) {
        StringBuffer str = new StringBuffer("");

        String[] st = s.split(" ");
        for(int i=0;i<st.length;i++){
            StringBuffer pstr = new StringBuffer(st[i]);
            str.append(pstr.reverse());
            str.append(" ");
            System.out.println(str);
            System.out.println("------------");
        }
        String p = str.toString().trim();
        return p;
    }
}
