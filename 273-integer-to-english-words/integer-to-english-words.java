class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String[] bigNumbers = {"", "Thousand", "Million", "Billion"};
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (num > 0) {
            if (num % 1000 != 0) {
                result.insert(0, numberToWordsHelper(num % 1000) + bigNumbers[i] + " ");
            }
            num /= 1000;
            i++;
        }
        
        return result.toString().trim();
    }

    private String numberToWordsHelper(int num) {
        String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        StringBuilder sb = new StringBuilder();
        
        if (num >= 100) {
            sb.append(units[num / 100]).append(" Hundred ");
            num %= 100;
        }
        
        if (num >= 20) {
            sb.append(tens[num / 10]).append(" ");
            num %= 10;
        }
        
        if (num >= 10) {
            sb.append(teens[num - 10]).append(" ");
        } else if (num > 0) {
            sb.append(units[num]).append(" ");
        }
        
        return sb.toString();
    }
}
