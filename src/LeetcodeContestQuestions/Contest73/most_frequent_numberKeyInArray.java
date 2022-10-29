package LeetcodeContestQuestions.Contest73;

import java.util.ArrayList;
import java.util.Arrays;

public class most_frequent_numberKeyInArray {
    public static void main(String[] args) {
        int[] arr = {1, 100, 200, 1, 100};
        int[] arr2 = {2, 2, 2, 2, 3};

        int[] arr3 = {2, 2, 2, 4, 2, 6, 2, 8, 2, 10, 2, 12, 2, 14, 2, 16, 2, 18, 2, 20, 2, 22, 2, 24, 2, 26, 2, 28, 2, 30, 2, 32, 2, 34, 2, 36, 2, 38, 2, 40, 2, 42, 2, 44, 2, 46, 2, 48, 2, 50, 2, 52, 2, 54, 2, 56, 2, 58, 2, 60, 2, 62, 2, 64, 2, 66, 2, 68, 2, 70, 2, 72, 2, 74, 2, 76, 2, 78, 2, 80, 2, 82, 2, 84, 2, 86, 2, 88, 2, 90, 2, 92, 2, 94, 2, 96, 2, 98, 2, 100, 2, 102, 2, 104, 2, 106, 2, 108, 2, 110, 2, 112, 2, 114, 2, 116, 2, 118, 2, 120, 2, 122, 2, 124, 2, 126, 2, 128, 2, 130, 2, 132, 2, 134, 2, 136, 2, 138, 2, 140, 2, 142, 2, 144, 2, 146, 2, 148, 2, 150, 2, 152, 2, 154, 2, 156, 2, 158, 2, 160, 2, 162, 2, 164, 2, 166, 2, 168, 2, 170, 2, 172, 2, 174, 2, 176, 2, 178, 2, 180, 2, 182, 2, 184, 2, 186, 2, 188, 2, 190, 2, 192, 2, 194, 2, 196, 2, 198, 2, 200, 2, 202, 2, 204, 2, 206, 2, 208, 2, 210, 2, 212, 2, 214, 2, 216, 2, 218, 2, 220, 2, 222, 2, 224, 2, 226, 2, 228, 2, 230, 2, 232, 2, 234, 2, 236, 2, 238, 2, 240, 2, 242, 2, 244, 2, 246, 2, 248, 2, 250, 2, 252, 2, 254, 2, 256, 2, 258, 2, 260, 2, 262, 2, 264, 2, 266, 2, 268, 2, 270, 2, 272, 2, 274, 2, 276, 2, 278, 2, 280, 2, 282, 2, 284, 2, 286, 2, 288, 2, 290, 2, 292, 2, 294, 2, 296, 2, 298, 2, 300, 2, 302, 2, 304, 2, 306, 2, 308, 2, 310, 2, 312, 2, 314, 2, 316, 2, 318, 2, 320, 2, 322, 2, 324, 2, 326, 2, 328, 2, 330, 2, 332, 2, 334, 2, 336, 2, 338, 2, 340, 2, 342, 2, 344, 2, 346, 2, 348, 2, 350, 2, 352, 2, 354, 2, 356, 2, 358, 2, 360, 2, 362, 2, 364, 2, 366, 2, 368, 2, 370, 2, 372, 2, 374, 2, 376, 2, 378, 2, 380, 2, 382, 2, 384, 2, 386, 2, 388, 2, 390, 2, 392, 2, 394, 2, 396, 2, 398, 2, 400, 2, 402, 2, 404, 2, 406, 2, 408, 2, 410, 2, 412, 2, 414, 2, 416, 2, 418, 2, 420, 2, 422, 2, 424, 2, 426, 2, 428, 2, 430, 2, 432, 2, 434, 2, 436, 2, 438, 2, 440, 2, 442, 2, 444, 2, 446, 2, 448, 2, 450, 2, 452, 2, 454, 2, 456, 2, 458, 2, 460, 2, 462, 2, 464, 2, 466, 2, 468, 2, 470, 2, 472, 2, 474, 2, 476, 2, 478, 2, 480, 2, 482, 2, 484, 2, 486, 2, 488, 2, 490, 2, 492, 2, 494, 2, 496, 2, 498, 2, 500, 2, 502, 2, 504, 2, 506, 2, 508, 2, 510, 2, 512, 2, 514, 2, 516, 2, 518, 2, 520, 2, 522, 2, 524, 2, 526, 2, 528, 2, 530, 2, 532, 2, 534, 2, 536, 2, 538, 2, 540, 2, 542, 2, 544, 2, 546, 2, 548, 2, 550, 2, 552, 2, 554, 2, 556, 2, 558, 2, 560, 2, 562, 2, 564, 2, 566, 2, 568, 2, 570, 2, 572, 2, 574, 2, 576, 2, 578, 2, 580, 2, 582, 2, 584, 2, 586, 2, 588, 2, 590, 2, 592, 2, 594, 2, 596, 2, 598, 2, 600, 2, 602, 2, 604, 2, 606, 2, 608, 2, 610, 2, 612, 2, 614, 2, 616, 2, 618, 2, 620, 2, 622, 2, 624, 2, 626, 2, 628, 2, 630, 2, 632, 2, 634, 2, 636, 2, 638, 2, 640, 2, 642, 2, 644, 2, 646, 2, 648, 2, 650, 2, 652, 2, 654, 2, 656, 2, 658, 2, 660, 2, 662, 2, 664, 2, 666, 2, 668, 2, 670, 2, 672, 2, 674, 2, 676, 2, 678, 2, 680, 2, 682, 2, 684, 2, 686, 2, 688, 2, 690, 2, 692, 2, 694, 2, 696, 2, 698, 2, 700, 2, 702, 2, 704, 2, 706, 2, 708, 2, 710, 2, 712, 2, 714, 2, 716, 2, 718, 2, 720, 2, 722, 2, 724, 2, 726, 2, 728, 2, 730, 2, 732, 2, 734, 2, 736, 2, 738, 2, 740, 2, 742, 2, 744, 2, 746, 2, 748, 2, 750, 2, 752, 2, 754, 2, 756, 2, 758, 2, 760, 2, 762, 2, 764, 2, 766, 2, 768, 2, 770, 2, 772, 2, 774, 2, 776, 2, 778, 2, 780, 2, 782, 2, 784, 2, 786, 2, 788, 2, 790, 2, 792, 2, 794, 2, 796, 2, 798, 2, 800, 2, 802, 2, 804, 2, 806, 2, 808, 2, 810, 2, 812, 2, 814, 2, 816, 2, 818, 2, 820, 2, 822, 2, 824, 2, 826, 2, 828, 2, 830, 2, 832, 2, 834, 2, 836, 2, 838, 2, 840, 2, 842, 2, 844, 2, 846, 2, 848, 2, 850, 2, 852, 2, 854, 2, 856, 2, 858, 2, 860, 2, 862, 2, 864, 2, 866, 2, 868, 2, 870, 2, 872, 2, 874, 2, 876, 2, 878, 2, 880, 2, 882, 2, 884, 2, 886, 2, 888, 2, 890, 2, 892, 2, 894, 2, 896, 2, 898, 2, 900, 2, 902, 2, 904, 2, 906, 2, 908, 2, 910, 2, 912, 2, 914, 2, 916, 2, 918, 2, 920, 2, 922, 2, 924, 2, 926, 2, 928, 2, 930, 2, 932, 2, 934, 2, 936, 2, 938, 2, 940, 2, 942, 2, 944, 2, 946, 2, 948, 2, 950, 2, 952, 2, 954, 2, 956, 2, 958, 2, 960, 2, 962, 2, 964, 2, 966, 2, 968, 2, 970, 2, 972, 2, 974, 2, 976, 2, 978, 2, 980, 2, 982, 2, 984, 2, 986, 2, 988, 2, 990, 2, 992, 2, 994, 2, 996, 2, 998, 2, 1000};
        int key = 2;
        number(arr3, key);
    }


    static void number(int[] arr, int key) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                ans.add(arr[i + 1]);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
//        return maxFreq(res);
        System.out.println(Arrays.toString(res));
        System.out.println(mostFrequent(res));
    }

    static int mostFrequent(int[] arr) {
        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count) {
            max_count = curr_count;
            res = arr[arr.length - 1];
        }
        return res;
    }

    static int maxFreq(int[] arr) {
        int res = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        return arr[res];
    }
}