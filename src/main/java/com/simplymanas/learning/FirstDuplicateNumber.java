package com.simplymanas.learning;

import java.util.HashSet;

public class FirstDuplicateNumber {

   private static HashSet<Integer> mySet;
    //private HashSet<Integer> mySet1;

    private static int FirstDuplicate(int[] a) {
        mySet = new HashSet<>();

        for (int num: a) {
            if (mySet.contains(num))
            {
                return num;
            }
            else{
                mySet.add(num);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a=new int[]{92729, 47916, 14807, 61066, 25195, 65164,92729, 25478, 41785, 62766, 2946, 83513, 46409, 54384, 29043, 53748, 56790, 63956, 64343, 9537, 67318, 99102, 39514, 44741, 29690, 76372, 92912, 26299, 11988, 27492, 12189, 64584, 82645, 65287, 91792, 75480, 62122, 73058, 20654, 55411, 70200, 78244, 94151, 65346, 33018, 25229, 37655, 82774, 14166, 4084, 63135, 60606, 24337, 22666, 97104, 91226, 15928, 56027, 45300, 70424, 24303, 10385, 49827, 9781, 66919, 3634, 90142, 14121, 36620, 71148, 35522, 57493, 16287, 14458, 89190, 56029, 53541, 19946, 47196, 72540, 4417, 12088, 90729, 89430, 77489, 29940, 55708, 75319, 60765, 86625, 56781, 92769, 86004, 35074, 94774, 23131, 22769, 96447, 42050, 24039, 61268, 92440, 11179, 87419, 89096, 98689, 95741, 63390, 46120, 53686, 60977, 119, 18485, 40699, 96281, 21700, 87779, 15587, 2689, 81401, 29152, 10714, 78624, 94285, 59954, 83396, 74745, 65332, 2580, 41263, 93056, 85919, 61987, 58533, 96922, 55690, 44619, 85564, 21007, 42344, 11583, 91413, 37293, 48932, 47721, 20760, 31810, 14858, 4704, 92543, 53984, 96136, 18662, 32139, 14375, 46924, 13317, 71892, 24107, 67929, 31270, 35712, 67956, 21722, 45248, 1028, 96382, 16662, 37593, 68124, 53950, 13012, 59796, 2584, 44667, 36013, 58921, 14934, 5607, 69454, 94331, 76332, 5441, 91865, 61590, 92113, 31983, 72813, 52136, 75221, 90374, 1986, 52797, 18519, 80677, 22558, 72572, 14, 23144, 55583, 44107, 11211, 18387, 57077, 12294, 5333, 33280, 36175, 26267, 24014, 16745, 93442, 12616, 23050, 29885, 78847, 27932, 78143, 60077, 49326, 61375, 43732, 40188, 87363, 59508, 6886, 61614, 88140, 87972, 53158, 48600, 43879, 96028, 99483, 90438, 78036, 25920, 44776, 656, 64130, 22623, 28123, 31970, 36542, 94499, 80080, 51230, 70891, 62683, 12885, 84295, 50974, 96091, 67687, 73565, 28, 53013, 7163, 46575, 33688, 93634, 38374, 80275, 94480, 57721, 57987, 7941, 24668, 41853, 25269, 59839, 6238, 78572, 75604, 7633, 26451, 54921, 16956, 97343, 26913, 33585, 88513, 46284, 18560, 93719, 81542, 16705, 9105, 24291, 58591, 20792, 25856, 56327, 6904, 20368, 24766, 65551, 99005, 17019, 16361, 14475, 77620, 61690, 33874, 11893, 48433, 20442, 91105, 21452, 34464, 85670, 42033, 69859, 77726, 35263, 76795, 42506, 92194, 67263, 54735, 59341, 653, 52997, 62693, 14972, 73239, 77016, 58600, 62871, 66060, 39938, 8588, 79168, 44494, 6062, 59039, 907, 90889, 21276, 63359, 83583, 12712, 66175, 29211, 10777, 26455, 69149, 1217, 75851, 43217, 53472, 57039, 4209, 23828, 33483, 77294, 93941, 67197, 6543, 87990, 87590, 71296, 10052, 22868, 94359, 50591, 19625, 82204, 98213, 39331, 47964, 79634, 62483, 8516, 41990, 72140, 69915, 89556, 67127, 31406, 59233, 91653, 19548, 67131, 47643, 99679, 44919, 92488, 26962, 53220, 7722, 81330, 68619, 37343, 17325, 87328, 10949, 68097, 76321, 61539, 60989, 94501, 88624, 26179, 42217, 78272, 3003, 26574, 19114, 63076, 74807, 56632, 41811, 26689, 14564, 9691, 26762, 26486, 18096, 76310, 96018, 43458, 32674, 78584, 45223, 40966, 75135, 63186, 26859, 34452, 17453, 99367, 33932, 98302, 28259, 48397, 56221, 49909, 17420, 17613, 58754, 365, 54717, 34274, 13656, 20362, 51647, 99960, 12601, 76416, 21540, 59687, 71535, 29046, 21460, 80134, 92625, 66735, 7767, 52619, 63031, 57525, 72146, 47988, 23103, 78107, 63394, 80304, 21163, 3542, 18095, 61266, 67341, 2898, 89995, 78133, 33612, 49114, 72382, 58538, 55171, 6643, 97174, 50816, 25363, 72317, 95062, 4725, 63249, 39099, 20517, 46423, 28400, 38130, 79811, 3632, 62655, 20059, 11982, 98149, 75749, 3177, 43442, 36347, 69282, 65100, 97569, 67988, 58946, 73474, 92931, 50936, 49230, 56507, 30577, 62233, 62033, 43562, 32524, 53753, 5823, 2479, 7429, 60358, 22707, 49870, 90377, 88388, 62197, 59038, 11541, 21841, 50211, 74467, 31403, 14517, 94917, 45702, 60829, 93376, 75569, 68157, 16465, 46506, 84341, 47897, 61996, 48475, 31785, 68568, 95110, 4590, 82128, 12566, 89457, 77491, 88068, 22611, 12938, 63349, 57814, 52912, 99590, 94932, 11247, 36982, 23618, 54792, 98865, 12501, 35885, 4285, 38077, 41600, 81480, 32167, 85037, 36537, 30444, 60573, 99748, 24216, 48691, 6881, 53402, 15443, 41077, 68602, 65542, 32578, 6395, 24866, 17307, 3189, 85680, 29292, 35155, 48617, 34590, 54833, 92451, 70533, 78372, 33054, 55893, 41342, 90141, 40242, 53087, 7710, 5802, 36628, 71242, 51225, 94252, 50947, 25965, 1553, 97945, 76353, 53104, 41825, 6061, 8595, 65729, 18978, 17332, 76687, 62635, 4006, 45211, 98679, 55488, 25125, 26989, 91313, 72389, 31224, 49303, 41131, 5852, 54236, 4581, 90029, 94295, 26480, 61012, 28968, 23838, 12577, 65983, 84643, 15734, 53709, 92519, 74578, 19684, 56168, 79135, 31537, 48564, 42737, 26166, 43397, 2313, 16074, 69869, 44681, 92799, 38039, 68829, 55592, 87334, 15058, 39276, 8991, 86594, 17008, 96901, 79706, 33702, 62515, 53357, 83291, 62475, 38173, 9478, 59370, 392, 35412, 22692, 259, 73533, 1841, 97792, 64432, 45521, 93659, 34401, 26782, 4545, 3008, 8827, 28147, 5152, 2542, 1484, 27156, 48929, 13475, 64532, 47349, 74571, 90698, 11277, 1781, 95975, 89479, 36969, 38829, 67721, 47757, 37516, 33728, 24802, 48316, 25958, 61957, 6009, 9915, 23284, 54393, 66779, 76592, 54562, 58182, 42448, 72108, 4302, 93243, 13580, 61552, 98458, 50700, 18124, 46478, 47041, 6681, 16172, 64411, 42933, 65148, 66745, 84986, 59852, 27728, 57140, 58982, 80363, 33731, 73643, 77529, 78884, 34036, 35392, 28213, 50991, 89353, 78640, 93822, 25231, 96146, 89686, 61673, 69323, 8362, 261, 44846, 76209, 7013, 54238, 44533, 80794, 41350, 26752, 7904, 51578, 9504, 3282, 54584, 64034, 78721, 88843, 26313, 46338, 8799, 82113, 35779, 21527, 50861, 75050, 23180, 60242, 75262, 33289, 70232, 32610, 37127, 32527, 94709, 39487, 44763, 65637, 78237, 88705, 85193, 68966, 14056, 68982, 59764, 16284, 56244, 28255, 96633, 90708, 7802, 14904, 7439, 73201, 18680, 40506, 18197, 13503, 56272, 58197, 57545, 44362, 77759, 74652, 41766, 87544, 84700, 12486, 71471, 70746, 97634, 17040, 81018, 56973, 15982, 84500, 82402, 67774, 5859, 44805, 58323, 48576, 63279, 19807, 82278, 50860, 75284, 18953, 28742, 27393, 73117, 51487, 93966, 66005, 7987, 16177, 35861, 51136, 59240, 24084, 83836, 28807, 54355, 92335, 80010, 13343, 45945, 13576, 36700, 75279, 31717, 24271, 56001, 63164, 26838, 91459, 17124, 59666, 46452, 66747, 95427, 56299, 8353, 4119, 90256, 578, 3418, 18005, 27215, 18407, 68492, 32905, 12006, 92196, 52001, 95486, 10766, 9906, 33684, 48412, 49218, 60764, 64341, 70540, 2586, 32323, 27727, 61315, 8807, 87509, 45992, 3258, 43652, 52703, 69429, 48574, 63037, 77833, 36345, 76064, 69239, 90474, 95277, 53151, 21136, 65300, 79753, 93655, 43229, 49415, 19745, 39235, 48735, 28088, 91278, 3417, 92919, 17926, 83474, 25689, 85233, 92100, 58391, 27816, 83867, 97793, 16626, 40706, 24169, 99318, 57949, 84905, 53867, 89405, 7324, 1570, 59818, 44111, 30044, 69124, 30156, 97675, 31458, 16268, 20627, 91669, 15802, 10945, 30234, 99412, 67087, 73059, 19991, 11763, 56736, 97443, 89224, 48723, 77533, 6356, 95604, 39010, 61661, 61144, 67252, 11482, 63092, 60946, 41124, 36005, 40011, 72467, 98133, 17616, 26023, 50465, 62172, 33211, 82893, 11721, 94824, 21628, 25557, 15171, 9253, 76247, 58820, 69428, 71594, 99011, 85487, 48216, 12470, 19312, 20580, 27068, 70185, 57182, 5128, 64285, 43944, 51440, 24716, 81532, 33019, 45281, 19883, 19616, 67781, 72616, 48498, 89212, 37013, 90723, 4050, 90615, 89015, 6626, 7273, 38010, 25108, 32303, 29956, 26390, 67725, 67772, 34830, 27396, 10776, 29360, 36558, 60436, 52626, 22853, 15656, 9609, 20725, 67637, 8196, 47241, 71862, 7095, 12984, 30105, 89748, 66774, 77717, 56146, 60040, 29753, 76746, 95624, 59604, 48772, 95027, 74391, 80699, 53149, 40356, 6204, 99197, 23447, 57800, 69076, 38758, 9052, 62489, 73042, 84154, 21457, 13600, 63309, 69153, 39416, 12675, 95261, 36944, 34181, 20046, 25385, 10002, 84117, 42792, 97263, 65873, 45542, 12858, 48637, 89629, 64189, 53225, 71055, 30782, 5915, 32670, 51189, 21952, 49938, 24769, 52008, 5222, 79810, 98743, 60741, 1785, 81829, 7762, 99914, 2344, 23861, 70783, 30633, 78794, 57321, 21318, 33963, 63077, 86339, 75466, 31992, 94677, 89342, 87397, 84241, 58285, 12054, 85784, 40171, 89350, 29298, 67290, 3492, 69299, 8071, 95234, 60316, 73636, 40704, 19987, 98721, 16488, 47336, 56410, 55532, 5621, 78638, 19170, 35853, 28751, 32459, 54308, 80591, 3271, 71580, 53640, 58838, 5599, 32411, 84652, 83868, 37752, 75588, 5597, 95225, 44750, 48202, 68160, 62679, 14097, 89276, 85054, 35913, 85271, 78570, 24553, 9918, 49705, 71751, 80149, 81739, 44018, 68765, 81284, 38195, 92601, 28122, 81363, 2774, 78444, 44602, 85571, 16387, 50779, 33476, 29980, 51767, 46235, 16859, 72661, 80301, 19966, 58985, 69721, 72916, 79847, 64238, 83736, 58313, 70106, 81767, 94968, 54924, 44689, 60166, 39208, 69275, 27878, 21910, 88037, 46848, 62509, 21244, 47630, 89321, 39084, 27175, 60110, 59504, 68420, 81189, 95237, 82751, 38245, 52290, 44498, 862, 97593, 20395, 94448, 32318, 31886, 13376, 82266, 22961, 48847, 36689, 79389, 79510, 65514, 70499, 79972, 89434, 69353, 66842, 19422, 35006, 8683, 41717, 69609, 97052, 25405, 15421, 28411, 19133, 5869, 11873, 94016, 79368, 77143, 98505, 7499, 22390, 13703, 44697, 12227, 68838, 76513, 40618, 67596, 48456, 35454, 18823, 56671, 55991, 28521, 26165, 15239, 55299, 33365, 49384, 83049, 60804, 64715, 97380, 67273, 53096, 72199, 48069, 57751, 35786, 41130, 75661, 5162, 32292, 22919, 19071, 49171, 72013, 85862, 12277, 57206, 37599, 42197, 98215, 75313, 12779, 11855, 59425, 50354, 75941, 88105, 41572, 51155, 57781, 19722, 65883, 7185, 28211, 18268, 53495, 21040, 27227, 41182, 81056, 41159, 27275, 11290, 35884, 66363, 95185, 26723, 28683, 10805, 17477, 93231, 55224, 49246, 86801, 44559, 23347, 44903, 97004, 50523, 37820, 90356, 65491, 50288, 77507, 4859, 41361, 89850, 79713, 4101, 23854, 36089, 37695, 47894, 23181, 85130, 29387, 7832, 1287, 50175, 19014, 1858, 41513, 1914, 37048, 55231, 91850, 87608, 17425, 86534, 70474, 89268, 17674, 94518, 38009, 68192, 34869, 39791, 96906, 25157, 52659, 60035, 93293, 71368, 90713, 73109, 19659, 67610, 21964, 72960, 87481, 80195, 86226, 89593, 55132, 57667, 4924, 62208, 85844, 89659, 57377, 11143, 16320, 26382, 6433, 48514, 52600, 52144, 52969, 56526, 90571, 92173, 58333, 76916, 66187, 50575, 51954, 36667, 9815, 64077, 32998, 9482, 48384, 16504, 25760, 88935, 19403, 97890, 36413, 54644, 74515, 77032, 96844, 31156, 4644, 95417, 43721, 96305, 44797, 32231, 80196, 21323, 67986, 49714, 8407, 38280, 77850, 53420, 38445, 58621, 74991, 76557, 22349, 44860, 93943, 28929, 42972, 49756, 23766, 24760, 30944, 51405, 9334, 31831, 11457, 6088, 4250, 69557, 16049, 42322, 74482, 12005, 95494, 9400, 4599, 46597, 4945, 43123, 47779, 52865, 67412, 22355, 44748, 58374, 19280, 90668, 16793, 79997, 19258, 54628, 8607, 30145, 11810, 52162, 52455, 44512, 73488, 21605, 67973, 31191, 57458, 68728, 81978, 79107, 538, 3021, 65652, 495, 75852, 41800, 32379, 1387, 18504, 66486, 11246, 53141, 36177, 93069, 35046, 27485, 10007, 89488, 44800, 8087, 27679, 19417, 96524, 24390, 73962, 70670, 67538, 39783, 70191, 60441, 66931, 60612, 88442, 56969, 31640, 64039, 93882, 71219, 72189, 2966, 40569, 49460, 19370, 52687, 43263, 51412, 45437, 90386, 59461, 7515, 29996, 57320, 93362, 1439, 18800, 93885, 22613, 73371, 35626, 54776, 56064, 60835, 33646, 63680, 44878, 93131, 18842, 88835, 27022, 42105, 35654, 31426, 89879, 60578, 59557, 48494, 85027, 25324, 86557, 94075, 71407, 63032, 8461, 31251, 30276, 55434, 360, 44719, 37566, 31879, 749, 88248, 73926, 72335, 15653, 71654, 98252, 42126, 45586, 35747, 1561, 22737, 34882, 95988, 38798, 99839, 85232, 61176, 45431, 89369, 60576, 11740, 79480, 76249, 79978, 12166, 30553, 45355, 66576, 63714, 5694, 84826, 50750, 7181, 97491, 27347, 41146, 4747, 99650, 28202, 62244, 62156, 8491, 67516, 36075, 76291, 16569, 20173, 9718, 71542, 97512, 6262, 34303, 56402, 44885, 50830, 20530, 32979, 50409, 6304, 84354, 84543, 34231, 5209, 9260, 41038, 82464, 40900, 5665, 13440, 17479, 68180, 43916, 79787, 45772, 51175, 16760, 96703, 13598, 92061, 50814, 94893, 60779, 80229, 50902, 86506, 81512, 34037, 84321, 12133, 57143, 75899, 72469, 59676, 29213, 42500, 124, 22177, 82287, 66918, 30241, 44342, 80375, 57355, 88897, 55216, 15106, 99340, 65556, 55468, 32920, 12407, 24941, 71418, 76699, 59333, 34120, 47034, 39438, 95241, 19898, 73801, 44752, 61551, 15948, 72592, 59393, 11746, 99071, 90107, 5761, 64970, 71539, 84073, 38349, 37264, 39553, 54831, 27753, 98024, 72723, 12667, 67618, 42826, 32719, 89820, 39273, 51435, 34243, 89495, 40117, 92101, 22326, 29348, 61983, 77046, 67459, 51795, 26635, 22154, 13067, 20680, 69270, 23069, 31734, 14719, 67088, 76571, 21734, 32774, 2788, 31134, 95356, 47343, 15305, 99401, 2658, 24160, 73011, 74470, 36515, 32426, 80991, 10117, 5091, 35321, 55423, 5783, 14305, 7233, 3035, 71942, 48393, 39183, 76387, 24265, 13501, 38555, 45450, 98871, 98822, 83451, 28110, 48296, 32356, 911, 44245, 91030, 34378, 71906, 17116, 11563, 38817, 93203, 13975, 75063, 21692, 49215, 23051, 82481, 72099, 20242, 28256, 45476, 19174, 27724, 60727, 3144, 19811, 18940, 71819, 99604, 4170, 9013, 98850, 80926, 77024, 28829, 70950, 55211, 63184, 56515, 41613, 3706, 96493, 95566, 53865, 65221, 22324, 14490, 49961, 76970, 52185, 35897, 53933, 65586, 93214, 56415, 38393, 2441, 1311, 65387, 58858, 25944, 1271, 86926, 70862, 73939, 37567, 97936, 21795, 67355, 88058, 49082, 998, 74605, 2619, 72837, 55870, 92635, 24326, 77784, 82666, 65823, 35649, 16801, 36465, 57828, 24554, 22866, 84468, 28040, 29356, 11199, 80474, 88152, 37019, 31787, 27750, 48090, 10423, 1749, 44579, 85809, 44289, 20091, 80642, 6939, 60760, 6769, 74777, 83645, 80416, 47070, 91978, 50007, 14819, 71851, 41279, 18347, 88858, 88943, 39310, 50442, 14000, 37831, 6987, 34038, 35981, 88484, 22937, 19528, 16699, 55531, 31586, 74660, 52922, 41688, 96272, 20973, 51016, 36442, 48962, 11671, 20835, 78501, 33701, 56573, 33167, 35164, 19016, 90595, 12109, 68341, 64155, 34659, 22791, 45224, 2903, 67564, 83785, 29939, 62720, 12995, 98249, 79789, 59739, 42133, 76019, 88006, 59435, 32586, 13431, 94186, 83962, 97101, 83949, 79926, 89501, 33641, 30880, 78863, 46989, 31155, 92522, 51009, 85696, 31461, 98832, 36718, 47514, 69427, 16283, 76381, 31272, 16694, 25737, 78825, 46673, 19872, 64038, 77999, 37133, 75278, 47339, 91496, 95519, 43381, 11051, 20936, 67992, 40667, 37329, 96833, 76426, 2387, 32327, 47202, 7372, 94892, 43998, 88184, 38324, 5079, 83658, 83052, 56458, 70721, 5947, 51990, 97948, 54617, 77957, 64296, 4641, 13722, 20805, 21533, 26918, 79929, 10047, 20290, 33298, 87489, 95317, 29342, 50148, 98187, 94836, 10596, 81717, 12581, 61588, 16825, 58254, 2353, 63972, 29599, 18711, 72626, 94887, 43084, 34577, 90593, 79598, 61961, 1400, 11745, 23363, 89319, 93475, 23637, 70347, 2631, 44900, 92470, 78232, 44063, 69740, 53597, 6319, 24246, 60407, 83535, 92352, 11068, 62362, 11002, 50350, 69858, 65343, 46035, 65188, 19767, 33069, 80007, 57537, 84979, 75423, 69288, 18786, 60012, 3257, 6040, 38314, 73069, 29972, 53321, 52843, 81793, 55637, 2437, 55580, 95493, 94653, 36672, 64052, 33132, 12119, 47645, 78045, 77425, 19465, 1003, 58234, 86815, 15935, 6491, 42973, 20599, 48215, 68075, 98254, 85771, 73810, 79605, 35409, 53520, 30879, 39671, 38726, 6417, 29841, 62214, 6783, 95412, 67839, 92292, 97774, 1201, 74952, 55393, 35965, 85935, 11525, 28066, 19574, 79259, 36865, 42006, 83360, 28668, 7910, 7084, 43172, 69247, 70252, 40533, 30912, 52414, 39393, 37675, 79610, 14657, 21463, 94693, 30501, 15026, 23391, 78804, 60344, 36565, 61040, 4133, 56640, 39492, 75783, 1030, 13044, 14074, 80846, 43476, 49515, 65754, 13903, 44975, 8813, 2649, 89310, 76956, 21843, 63919, 71962, 10449, 22973, 9450, 39886, 89582, 45643, 8644, 35790, 11171, 65576, 53786, 89089, 36595, 24108, 22506, 6039, 70821, 35907, 59445, 37403, 22991, 56646, 34933, 9217, 94989, 34088, 19915, 26162, 92516, 7188, 31726, 99056, 94940, 43690, 24365, 707, 35922, 4306, 15836, 95635, 22682, 75245, 32988, 84962, 98693, 86587, 90449, 93284, 44654, 51308, 2736, 94454, 94039, 39399, 94933, 49015, 95402, 75634, 79574, 49202, 58774, 39878, 43291, 91574, 8829, 89330, 12446, 1115, 31532, 67416, 70528, 59173, 71926, 84681, 6082, 15427, 4811, 69701, 15707, 53153, 50306, 48093, 78017, 93213, 61662, 72868, 69575, 17671, 22849, 32891, 22245, 54836, 6157, 29916, 8374, 56955, 15077, 73893, 49772, 36740, 47290, 9983, 47562, 72564, 20096, 76099, 90464, 18158, 4789, 76906, 50144, 92875, 24304, 81885, 48788, 10779, 66870, 21217, 27425, 85392, 97538, 63611, 49599, 86105, 789, 50326, 50747, 29584, 92120, 44429, 65626, 85704, 47641, 45401, 26604, 52968, 39423, 4391, 40381, 69089, 97508, 2778, 97946, 60448, 59861, 25857, 56596, 80110, 45238, 43298, 29834, 90886, 67227, 35028, 41841, 11271, 11312, 18223, 9134, 74161, 15320, 96014, 38439, 92553, 40110, 48226, 78911, 99761, 10262, 54624, 75587, 69099, 87680, 14158, 58645, 45815, 8793, 69098, 59537, 27357, 28081, 50100, 51827, 31635, 4403, 85523, 34620, 21953, 88175, 30453, 93984, 75085, 92824, 81800, 92687, 42596, 9204, 19860, 74902, 20609, 32553, 26631, 97427, 35763, 89932, 52707, 48972, 69473, 14361, 95439, 83600, 9292, 8775, 37192, 52736, 10780, 3865, 17282, 35720, 5161, 8428, 11192, 37606, 86621, 52310, 36039, 65369, 23360, 16476, 93310, 13972, 63752, 86551, 85799, 5722, 88811, 51568, 77101, 78935, 40012, 3541, 1162, 29058, 52790, 92779, 58011, 88324, 92662, 238, 6943, 44324, 6032, 52216, 68747, 46393, 8977, 57198, 3290, 4046, 89653, 61196, 37890, 60805, 84749, 31651, 70601, 38111, 14864, 99388, 36999, 82044, 5354, 74996, 87982, 90796, 50323, 76896, 40410, 7929, 80033, 97181, 58258, 86779, 57290, 39203, 22660, 94668, 53600, 66529, 18315, 81479, 51734, 93241, 2972, 32858, 20254, 81668, 32702, 32562, 95515, 5300, 89356, 3966, 63788, 50661, 71847, 56065, 37042, 67096, 45911, 81353, 6845, 69790, 4092, 89452, 31591, 26460, 48280, 79487, 2153, 73985, 90639, 19955, 56137, 98340, 90944, 4796, 88961, 21300, 45154, 21415, 67542, 14574, 53289, 75527, 90636, 44959, 42361, 68613, 21191, 94862, 26833, 40592, 65510, 74331, 18856, 70748, 52288, 38046, 56300, 84772, 65389, 63125, 3428, 16701, 66336, 93473, 15212, 97703, 16795, 39924, 17754, 93109, 77699, 4016, 38182, 15142, 71323, 62203, 71658, 20440, 97892, 64007, 77746, 7694, 34610, 63129, 49474, 36693, 46206, 49153, 9522, 59794, 47619, 78291, 6235, 96595, 66157, 71138, 19418, 49943, 48909, 1780, 73860, 3005, 78626, 66511, 28364, 70641, 27618, 36277, 38760, 30795, 92422, 73487, 58558, 518, 74362, 70405, 5304, 94412, 97040, 20217, 19664, 55911, 63898, 11953, 25067, 90298, 71848, 22068, 96358, 4497, 14933, 47352, 12852, 29353, 89357, 40246, 43768, 2289, 47188, 4307, 43861, 29877, 39988, 58832, 48501, 42164, 14661, 40511, 24937, 41713, 69589, 18143, 524, 14474, 81069, 10452, 82604, 46581, 47604, 68126, 57312, 57481, 56879, 58460, 43531, 24289, 51396, 8860, 9225, 74527, 73237, 44375, 24771, 77756, 44215, 72227, 70859, 37647, 97903, 65099, 35289, 5902, 525, 23764, 24645, 57056, 48511, 33303, 85629, 80665, 33907, 48697, 71297, 37832, 21647, 37049, 29586, 43979, 75793, 19368, 97091, 92075, 99294, 86216, 5943, 29414, 9914, 67260, 54926, 48873, 21577, 3728, 37525, 71338, 73090, 42369, 59993, 6126, 80904, 58159, 977, 31019, 45826, 54976, 16559, 69133, 56230, 78342, 1325, 88326, 57836, 35662, 83559, 3903, 47909, 92375, 5193, 93312, 2492, 18582, 49496, 55578, 80349, 29010, 50529, 82033, 97955, 33605, 33081, 7900, 36461, 32031, 65302, 92406, 64631, 33819, 6400, 40959, 87349, 67007, 13655, 77844, 43, 16428, 17712, 7811, 99160, 85400, 5920, 99973, 91735, 99526, 41592, 64365, 25098, 37702, 74, 15687, 11313, 21523, 13147, 26964, 38588, 5103, 27320, 9693, 798, 41340, 90308, 7563, 4792, 41756, 58364, 26607, 4965, 11678, 74567, 8111, 58070, 35219, 40811, 76056, 24736, 90819, 6639, 22977, 21113, 70174, 41062, 94556, 90961, 79120, 29757, 51766, 16131, 59460, 96332, 97649, 51781, 75623, 7061, 80871, 52452, 83630, 75614, 52975, 19041, 41060, 69592, 62811, 84135, 77563, 94226, 64510, 68636, 68623, 2546, 7255, 61468, 88929, 83315, 39246, 43849, 90675, 28954, 71604, 297, 78383, 28978, 71347, 40737, 81381, 81683, 16221, 30614, 11759, 783, 11856, 59434, 72691, 60730, 29810, 84402, 53904, 26464, 14409, 66284, 33786, 60919, 91260, 9838, 14849, 1216, 14129, 56980, 7468, 30796, 38993, 31198, 88534, 18559, 81722, 73333, 67403, 66314, 53566, 86157, 40758, 12250, 91660, 23964, 17749, 82273, 87016, 94795, 48949, 46389, 54405, 26467, 60704, 56090, 35557, 60661, 6532, 57126, 68261, 24403, 75472, 82970, 70308, 6509, 80226, 87606, 77107, 25219, 36728, 49253, 15630, 21555, 5426, 33408, 99752, 25204, 99747, 30502, 45056, 83247, 91198, 11118, 6429, 88053, 10810, 58217, 43477, 93800, 8079, 88410, 34078, 47763, 20630, 85409, 22846, 12634, 49567, 23124, 83413, 15187, 12409, 79703, 6748, 35246, 95837, 26688, 97106, 89078, 38752, 74766, 30717, 98859, 45299, 60551, 92863, 90448, 6006, 9091, 59301, 31215, 20377, 1170, 7443, 96728, 53823, 76229, 53443, 82833, 56586, 13477, 70040, 80378, 50247, 13178, 19527, 4219, 56281, 17509, 58779, 70657, 24539, 20122, 89508, 75530, 2779, 34833, 26545, 30536, 49635, 43848, 30423, 16234, 39811, 52196, 30089, 58255, 84051, 60978, 77131, 74399, 69067, 73441, 28423, 40674, 13570, 16185, 18346, 23253, 48016, 9873, 69781, 77409, 88850, 9451, 55867, 51184, 94648, 7725, 68444, 85538, 70700, 1796, 83153, 99989, 15208, 88949, 89441, 56702, 67485, 80044, 77607, 425, 69092, 44490, 22816, 49060, 51756, 73563, 54247, 83999, 71201, 71964, 13020, 91080, 26058, 58871, 17474, 56565, 73909, 34525, 43175, 66102, 86078, 35724, 19897, 35429, 97322, 79262, 12159, 61797, 48641, 37468, 28227, 99432, 75640, 40156, 99013, 77683, 70597, 36491, 96531, 30694, 48770, 3687, 59369, 22744, 52000, 2251, 40750, 40500, 74669, 26278, 99404, 45957, 82918, 6125, 95541, 61791, 72437, 90282, 68749, 59729, 69120, 4338, 68929, 82397, 10480, 12844, 70240, 69389, 74260, 5407, 71694, 99191, 35186, 30808, 43031, 10929, 42398, 78666, 52510, 35538, 83651, 67531, 51646, 43804, 77783, 39189, 68093, 85219, 19947, 55955, 32788, 37637, 31784, 84673, 90367, 34528, 83078, 44680, 66948, 9660, 99352, 3927, 25670, 9054, 48372, 26690, 713, 95126, 16342, 86095, 59749, 54873, 60459, 42279, 5838, 96619, 86380, 28694, 27379, 62925, 86547, 75173, 33718, 7167, 22392, 14600, 84661, 4434, 87460, 18374, 59707, 12786, 75710, 21985, 53240, 93332, 41617, 41682, 58859, 90245, 77790, 51403, 76569, 83894, 90714, 56853, 2777, 31538, 67475, 96451, 85123, 65821, 45774, 280, 23522, 34467, 65535, 86911, 88251, 72844, 39346, 90219, 66480, 13458, 59235, 64417, 49090, 43482, 96196, 89011, 47476, 56996, 29339, 66339, 54840, 62863, 63253, 14917, 66445, 80353, 78839, 34995, 40208, 20818, 16118, 53335, 69022, 43686, 22170, 92829, 58414, 58682, 59420, 16764, 70684, 68445, 32340, 17954, 40017, 50968, 56483, 32500, 42617, 5668, 97082, 85747, 73581, 31584, 4540, 39810, 46068, 62815, 53011, 96636, 53914, 2243, 86346, 32220, 39359, 62656, 51971, 87855, 35439, 76189, 55861, 95922, 54777, 1238, 46167, 68326, 97327, 93811, 30474, 33676, 45291, 5396, 51546, 51659, 9214, 3757, 17586, 54613, 2072, 41795, 69660, 20907, 23624, 15530, 19304, 26805, 63733, 22530, 4933, 52974, 97344, 5808, 28760, 59559, 68599, 97869, 55480, 61943, 25882, 96821, 53024, 42976, 35692, 11314, 52155, 37507, 19555, 26813, 21696, 27710, 72210, 51657, 20863, 76152, 89256, 53540, 56880, 74221, 26474, 44695, 49577, 47709, 24879, 71935, 14333, 78919, 50583, 43627, 32405, 17912, 7787, 76986, 29522, 61532, 56426, 55464, 91153, 92699, 53125, 18518, 13233, 99069, 851, 66253, 60832, 75522, 32209, 36606, 95886, 6514, 55705, 89698, 73732, 98802, 96831, 25654, 90059, 2067, 68402, 90837, 28921, 74462, 47736, 43597, 27160, 50562, 2670, 94806, 86332, 93888, 13410, 10813, 70926, 46763, 98764, 68674, 74722, 56549, 39302, 42436, 6274, 47570, 90849, 27056, 70735, 85484, 1970, 96747, 59436, 52017, 66643, 70927, 91292, 35622, 94954, 36511, 37581, 55260, 934, 75628, 675, 72125, 15706, 78035, 26543, 52992, 61303, 35010, 86645, 5747, 14541, 35192, 39674, 79414, 46863, 44848, 85256, 10887, 84184, 64101, 1379, 35516, 78855, 29102, 86865, 14618, 35185, 83603, 99050, 44989, 38610, 89320, 66893, 32440, 86029, 7109, 65450, 24404, 22158, 75105, 48565, 27063, 90347, 57379, 48653, 917, 25424, 29565, 51021, 45414, 70198, 80355, 58475, 69296, 34189, 65536, 14415, 29011, 53236, 27318, 21764, 82417, 45375, 64712, 98853, 59397, 89403, 51131, 51254, 92709, 28328, 741, 12765, 8123, 94298, 13814, 52695, 8070, 64161, 35163, 32777, 95495, 75938, 49952, 80503, 29732, 5444, 26712, 98414, 47200, 35355, 77379, 43134, 60579, 6288, 34977, 27528, 18267, 29691, 87703, 83492, 10860, 71905, 71723, 74835, 61034, 87620, 13136, 14813, 85268, 43240, 65446, 34317, 36382, 25605, 63870, 60514, 94008, 44156, 26756, 66547, 29436, 28629, 81536, 88661, 22960, 30118, 24954, 98660, 44863, 53809, 32370, 97426, 56331, 36931, 56652, 85945, 86159, 32069, 79334, 53955, 70437, 82632, 5673, 42266, 66213, 42685, 23303, 12317, 65599, 24159, 7589, 53183, 49089, 38527, 25045, 278, 89572, 12421, 56200, 92547, 91089, 62259, 95997, 93786, 91549, 3969, 97842, 44246, 80103, 88697, 97102, 2738, 99332, 56261, 1381, 37512, 96099, 64832, 15203, 19141, 30766, 49896, 91137, 51135, 16474, 26835, 98537, 42648, 13358, 74337, 99781, 48818, 29015, 55635, 18126, 67209, 8790, 472, 92490, 53231, 84554, 89792, 68269, 37027, 42114, 28769, 71157, 11154, 7783, 69116, 3781, 41381, 97488, 81689, 68977, 21663, 80490, 40914, 54222, 50294, 67296, 87329, 84340, 25466, 40193, 73769, 7045, 63335, 78050, 94246, 810, 8555, 36638, 48521, 56911, 6396, 20218, 11779, 29132, 97885, 36037, 61606, 38891, 86124, 15757, 63451, 86925, 9889, 91890, 66757, 20439, 98952, 62801, 87636, 14713, 3157, 30260, 96412, 42883, 63099, 20529, 32003, 45565, 13137, 90954, 59271, 84656, 79836, 82788, 40229, 19668, 37564, 56912, 59323, 41910, 99172, 10627, 31042, 84436, 27026, 2484, 22376, 30369, 70434, 63561, 13006, 8385, 84240, 40002, 53460, 85415, 61433, 90414, 9621, 8493, 35012, 83581, 93826, 8517, 46131, 33117, 92340, 71781, 5850, 99001, 27435, 48852, 16295, 28680, 37925, 89526, 88189, 48785, 34456, 78125, 82465, 23047, 39877, 23615, 49272, 59374, 95247, 40384, 37860, 83957, 89210, 23569, 87214, 63471, 93487, 93, 55843, 61214, 33300, 30382, 56548, 14426, 51590, 99548, 40676, 23951, 99314, 53308, 18019, 77575, 2573, 57046, 67372, 32953, 42876, 79871, 48953, 93651, 26193, 21167, 30277, 89895, 99101, 3708, 50809, 12865, 60997, 98483, 10581, 77521, 88955, 25576, 95061, 34414, 61558, 89037, 58156, 99636, 1888, 11387, 25498, 84517, 19216, 55839, 90805, 12704, 88982, 79783, 6404, 26361, 54211, 74903, 78997, 24908, 96624, 99364, 45079, 36935, 71560, 29701, 15419, 16217, 79693, 49558, 52007, 77388, 61763, 24840, 21504, 69300, 70787, 46773, 51494, 62727, 65907, 53965, 79526, 37277, 7050, 74648, 11926, 42739, 61895, 28967, 31050, 47042, 36895, 76357, 31027, 45996, 74922, 99896, 31768, 13199, 22463, 30031, 14971, 47556, 16427, 58366, 41947, 33581, 94885, 27963, 46973, 89117, 56416, 5020, 53374, 35044, 82928, 80137, 15224, 87262, 27203, 92408, 95925, 44783, 25784, 77618, 49650, 17447, 20236, 11954, 96250, 58631, 71227, 94026, 68086, 21478, 73637, 80407, 91971, 52580, 69381, 79691, 66879, 21944, 87139, 75979, 67198, 40824, 18378, 94274, 1527, 75075, 84400, 59565, 14338, 17693, 36956, 10712, 59927, 43789, 71249, 10161, 78771, 71919, 12867, 51549, 17731, 35976, 50375, 88890, 97417, 8186, 75559, 62974, 86070, 66184, 13061, 94728, 95231, 98443, 96261, 7919, 10257, 60740, 54645, 10401, 19589, 95640, 90903, 9765, 18063, 91640, 9131, 83943, 30770, 1320, 76736, 98819, 4069, 73619, 72820, 44262, 39221, 35780, 42966, 85876, 1407, 24167, 95981, 49694, 58309, 18014, 84921, 59579, 21483, 70227, 69755, 64069, 56533, 77041, 59583, 2511, 34107, 66866, 71257, 66448, 5100, 12430, 3827, 29148, 83274, 60971, 4665, 54271, 17030, 23482, 49122, 91582, 46483, 85243, 86630, 66564, 30412, 17682, 8110, 98001, 54354, 27075, 85014, 92541, 59146, 23073, 46139, 45059, 78906, 49687, 33290, 24515, 81387, 20747, 30268, 98661, 27721, 16503, 66368, 7895, 98048, 56328, 62065, 93217, 33144, 70643, 84857, 26170, 75998, 71448, 85958, 37148, 75212, 80113, 55970, 11668, 40172, 82693, 66493, 14331, 66489, 48301, 73661, 69012, 34237, 13257, 24462, 2135, 64953, 2068, 49623, 57782, 45924, 78592, 41233, 56607, 92527, 27862, 21633, 4739, 37493, 72359, 80166, 70136, 22180, 4388, 36548, 66806, 89476, 7293, 82911, 33555, 5446, 88253, 88563, 37469, 95516, 37243, 90187, 13767, 84159, 39545, 41100, 46736, 66343, 29914, 67238, 28484, 39979, 73036, 45051, 19138, 44519, 20536, 58320, 77189, 19132, 30861, 25641, 99237, 96404, 28570, 47392, 5782, 58918, 82165, 6001, 57913, 93208, 41203, 96689, 20299, 99239, 23250, 35743, 41595, 27418, 88328, 10546, 86678, 91619, 61138, 58302, 40913, 96466, 91113, 12315, 47278, 71417, 31098, 43278, 30619, 37763, 35532, 4533, 66376, 31656, 21957, 94453, 68238, 85762, 41498, 93608, 31661, 2296, 28745, 84514, 88910, 74076, 50586, 80385, 53431, 86316, 53734, 53474, 50592, 46645, 14301, 95721, 22329, 96435, 33110, 90258, 63938, 61977, 41718, 53023, 87116, 91274, 82761, 33025, 8878, 48439, 48878, 1004, 60566, 26404, 35177, 7721, 74706, 30817, 97849, 79495, 180, 16980, 60587, 93872, 80049, 17023, 2931, 62216, 80449, 56302, 53135, 45785, 24995, 27143, 19577, 35568, 77686, 54449, 16872, 55834, 63779, 65411, 48324, 1938, 35498, 43161, 51980, 89086, 95874, 48256, 59225, 28178, 13885, 96996, 2449, 3862, 34960, 64551, 15276, 93150, 92944, 12004, 2124, 40879, 89244, 31288, 46738, 6041, 88378, 46898, 55667, 84581, 84360, 27034, 72141, 80293, 5361, 29882, 87637, 25091, 13218, 46307, 90488, 30069, 8399, 27350, 97218, 9994, 50584, 69713, 46554, 29345, 78451, 14544, 50329, 21677, 11976, 43251, 87271, 62544, 1459, 82475, 13476, 64552, 79571, 79038, 23968, 59867, 4131, 85212, 2121, 3812, 96042, 74833, 28939, 12018, 7978, 57495, 47533, 47544, 67749, 48181, 87476, 66962, 28898, 29115, 73908, 22360, 60970, 58789, 2628, 33807, 66335, 80140, 50859, 97164, 13794, 31915, 48255, 1837, 79967, 4371, 7157, 28958, 64325, 93870, 94585, 70291, 60681, 61278, 49591, 79876, 96391, 69287, 20039, 87234, 25939, 41864, 23607, 59734, 39333, 10924, 14957, 49426, 31997, 40218, 19985, 41894, 69366, 8519, 59975, 56203, 71611, 56920, 97770, 30353, 91112, 4370, 97870, 27901, 19189, 59372, 1240, 70535, 50892, 36927, 39735, 94011, 5795, 98363, 6053, 95419, 54061, 90383, 12157, 2156, 26150, 52823, 73719, 20621, 52697, 50279, 28036, 70367, 42269, 92890, 35390, 57618, 36883, 74754, 70389, 57076, 23605, 21882, 29704, 52322, 1569, 55858, 12086, 47488, 24536, 75635, 7328, 74447, 69863, 53367, 92256, 56002, 86479, 95850, 98883, 26593, 61913, 50828, 98466, 22195, 58726, 65813, 62376, 2852, 21115, 95564, 10297, 82333, 69684, 29529, 99185, 32924, 34089, 82253, 62276, 71061, 40399, 80135, 86108, 98098, 9332, 19819, 46952, 92800, 65994, 26461, 71863, 97540, 76681, 91725, 21587, 31377, 16849, 82956, 10572, 97545, 50769, 44412, 64679, 42924, 79422, 96240, 84286, 74577, 61129, 55604, 53789, 57287, 29962, 21784, 49245, 70749, 99049, 7038, 78023, 65201, 82577, 22089, 83158, 54388, 74303, 78418, 83136, 33800, 30685, 29086, 27771, 94801, 13478, 67603, 35926, 51526, 14220, 98520, 5273, 11133, 40912, 49367, 67638, 33443, 29920, 90247, 70303, 89172, 871, 27514, 83265, 40271, 57205, 57897, 29307, 32155, 62599, 72248, 9904, 19223, 82077, 23966, 57783, 26106, 92417, 91724, 18619, 87027, 58617, 31707, 13427, 29446, 82017, 55792, 4579, 92972, 36945, 62880, 97824, 81531, 3116, 44296, 73707, 29518, 79361, 53178, 12735, 76349, 47134, 95432, 42740, 38693, 48116, 97516, 25517, 25925, 97352, 17427, 65782, 85664, 37651, 16304, 92828, 646, 66811, 19769, 66987, 90410, 32711, 42721, 91032, 1416, 53505, 21584, 26234, 66652, 28385, 97794, 12623, 77246, 72421, 3859, 15507, 81606, 15235, 95987, 52100, 30127, 7272, 76271, 76423, 76763, 2598, 29826, 75111, 35107, 34129, 95041, 59657, 13811, 81837, 42381, 44983, 33331, 30564, 55747, 66986, 4461, 66405, 98603, 33746, 27571, 77174, 36220, 7332, 79095, 57943, 11515, 95007, 50407, 78115, 48125, 30673, 49815, 12460, 90046, 90401, 23021, 44130, 47551, 95681, 5881, 98151, 63969, 59957, 49547, 98572, 64247, 80796, 4808, 33600, 38528, 72486, 60471, 5418, 37662, 11553, 38979, 32463, 47850, 86612, 6305, 66609, 49966, 63615, 13417, 58683, 26580, 19466, 34397, 2829, 44186, 65152, 34964, 5606, 18853, 59480, 72321, 92435, 99336, 93117, 7026, 8112, 79818, 17515, 60189, 30584, 8582, 34990, 15858, 67813, 2391, 89477, 24891, 83654, 47424, 57145, 81775, 79619, 43955, 6896, 12797, 67307, 92752, 31117, 9885, 14148, 7369, 78544, 52584, 63646, 83342, 66600, 33066, 68871, 87107, 55986, 50163, 94776, 80098, 48257, 70310, 70980, 64057, 62272, 52320, 20937, 1018, 67349, 18330, 91876, 82046, 7829, 1878, 40821, 85483, 29004, 65225, 32688, 62596, 43785, 41732, 27240, 54087, 74102, 97563, 75167, 34992, 78407, 11016, 70993, 19036, 68335, 30910, 76306, 79595, 36506, 40244, 80903, 44605, 52946, 5479, 49398, 36608, 93105, 66822, 92399, 79115, 11591, 26110, 91760, 27914, 49563, 41126, 1085, 52872, 1294, 25218, 57256, 44378, 90706, 93628, 35666, 95570, 54558, 12217, 75826, 1270, 84275, 26710, 61599, 24123, 87293, 3304, 51536, 66077, 25658, 4969, 56975, 32270, 75126, 66538, 17551, 50321, 57081, 57825, 53148, 35653, 91947, 83598, 66671, 36272, 62559, 7723, 83349, 55607, 54375, 50156, 33074, 53345, 79698, 57896, 33607, 89966, 96409, 91828, 21058, 92702, 81965, 58176, 24975, 8480, 53204, 55972, 26043, 24309, 43282, 43435, 21958, 55535, 32569, 50344, 60397, 31408, 37428, 14209, 89023, 3243, 60607, 11625, 47093, 76542, 86746, 38974, 44941, 18521, 28413, 28426, 52725, 66041, 33388, 22857, 78531, 87815, 31470, 74067, 46059, 6622, 38561, 79246, 29546, 65178, 66892, 63449, 38430, 30464, 19484, 8603, 79450, 77420, 38695, 30165, 35690, 40999, 46412, 72745, 29669, 80829, 92813, 88038, 35047, 71549, 55404, 74343, 33268, 58311, 69334, 6418, 68521, 90459, 8259, 21634, 71117, 25077, 89110, 87991, 75927, 4744, 24741, 77130, 79109, 85068, 57438, 65615, 40416, 46038, 20559, 16647, 66515, 50543, 39716, 37740, 18968, 85823, 19086, 43886, 90958, 71984, 73693, 14174, 49927, 15615, 7148, 73508, 21706, 4445, 63350, 81917, 86963, 47248, 91398, 48332, 69379, 40019, 55741, 28276, 75714, 81652, 45330, 25649, 64329, 95158, 34942, 62193, 4910, 36781, 27214, 69276, 71354, 6869, 72151, 36250, 43651, 5820, 34884, 5515, 32672, 58404, 16196, 22726, 20505, 63497, 20366, 71646, 92739, 73475, 17504, 95076, 85103, 13406, 25228, 88205, 45261, 611, 99460, 31229, 55443, 88539, 82137, 13941, 54889, 86142, 43471, 38613, 96756, 71648, 99830, 55731, 95265, 22174, 66658, 18232, 40323, 30508, 13858, 42703, 11748, 29241, 2961, 61643, 68639, 81641, 6398, 54715, 50588, 52301, 63856, 43579, 97191};
        System.out.println( FirstDuplicate(a));

    }
}