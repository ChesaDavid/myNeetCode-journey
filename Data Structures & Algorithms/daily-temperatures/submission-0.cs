public class Solution {
    public int[] DailyTemperatures(int[] temperatures) {
        int n = temperatures.Length;
                int[] res = new int[n];
                        Stack<int> stack = new Stack<int>();

                                for (int i = 0; i < n; i++) {
                                            // Resolve all previous days colder than the current temperature
                                                        while (stack.Count > 0 && temperatures[i] > temperatures[stack.Peek()]) {
                                                                        int prevIdx = stack.Pop();
                                                                                        res[prevIdx] = i - prevIdx;
                                                                                                    }
                                                                                                                stack.Push(i);
                                                                                                                        }

                                                                                                                                return res;
    }
}
