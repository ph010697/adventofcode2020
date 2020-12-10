import java.math.BigInteger;

public class MainClass {
    public static void main(String[] args) {
        String[] inputLines = ("16\n" +
                "19\n" +
                "41\n" +
                "7\n" +
                "20\n" +
                "3\n" +
                "45\n" +
                "40\n" +
                "37\n" +
                "25\n" +
                "5\n" +
                "22\n" +
                "43\n" +
                "48\n" +
                "4\n" +
                "23\n" +
                "18\n" +
                "47\n" +
                "28\n" +
                "11\n" +
                "10\n" +
                "42\n" +
                "35\n" +
                "6\n" +
                "34\n" +
                "21\n" +
                "8\n" +
                "9\n" +
                "12\n" +
                "7\n" +
                "13\n" +
                "38\n" +
                "14\n" +
                "15\n" +
                "16\n" +
                "17\n" +
                "20\n" +
                "19\n" +
                "60\n" +
                "22\n" +
                "24\n" +
                "27\n" +
                "46\n" +
                "44\n" +
                "28\n" +
                "18\n" +
                "70\n" +
                "23\n" +
                "42\n" +
                "25\n" +
                "26\n" +
                "21\n" +
                "29\n" +
                "30\n" +
                "91\n" +
                "34\n" +
                "31\n" +
                "32\n" +
                "33\n" +
                "35\n" +
                "43\n" +
                "41\n" +
                "45\n" +
                "47\n" +
                "65\n" +
                "39\n" +
                "48\n" +
                "49\n" +
                "46\n" +
                "44\n" +
                "50\n" +
                "51\n" +
                "52\n" +
                "63\n" +
                "53\n" +
                "54\n" +
                "89\n" +
                "59\n" +
                "61\n" +
                "64\n" +
                "66\n" +
                "105\n" +
                "87\n" +
                "68\n" +
                "74\n" +
                "92\n" +
                "93\n" +
                "124\n" +
                "83\n" +
                "154\n" +
                "97\n" +
                "217\n" +
                "176\n" +
                "120\n" +
                "94\n" +
                "122\n" +
                "111\n" +
                "106\n" +
                "107\n" +
                "246\n" +
                "127\n" +
                "123\n" +
                "173\n" +
                "125\n" +
                "199\n" +
                "142\n" +
                "210\n" +
                "151\n" +
                "293\n" +
                "185\n" +
                "175\n" +
                "207\n" +
                "177\n" +
                "299\n" +
                "201\n" +
                "383\n" +
                "232\n" +
                "200\n" +
                "219\n" +
                "450\n" +
                "394\n" +
                "213\n" +
                "229\n" +
                "234\n" +
                "296\n" +
                "401\n" +
                "372\n" +
                "267\n" +
                "324\n" +
                "530\n" +
                "317\n" +
                "328\n" +
                "854\n" +
                "352\n" +
                "730\n" +
                "518\n" +
                "586\n" +
                "377\n" +
                "414\n" +
                "560\n" +
                "932\n" +
                "432\n" +
                "541\n" +
                "453\n" +
                "759\n" +
                "447\n" +
                "442\n" +
                "463\n" +
                "619\n" +
                "749\n" +
                "584\n" +
                "591\n" +
                "729\n" +
                "641\n" +
                "1049\n" +
                "645\n" +
                "947\n" +
                "766\n" +
                "784\n" +
                "994\n" +
                "877\n" +
                "1307\n" +
                "824\n" +
                "846\n" +
                "1661\n" +
                "874\n" +
                "1094\n" +
                "1374\n" +
                "889\n" +
                "905\n" +
                "1689\n" +
                "1026\n" +
                "1340\n" +
                "1175\n" +
                "1225\n" +
                "1229\n" +
                "1375\n" +
                "2049\n" +
                "2532\n" +
                "1411\n" +
                "2064\n" +
                "1640\n" +
                "1550\n" +
                "1608\n" +
                "1670\n" +
                "2196\n" +
                "1713\n" +
                "2221\n" +
                "2279\n" +
                "2255\n" +
                "2845\n" +
                "1794\n" +
                "1915\n" +
                "1931\n" +
                "4328\n" +
                "2201\n" +
                "2366\n" +
                "2400\n" +
                "2404\n" +
                "3051\n" +
                "2899\n" +
                "3045\n" +
                "3402\n" +
                "3968\n" +
                "2961\n" +
                "3158\n" +
                "3190\n" +
                "3220\n" +
                "5333\n" +
                "6241\n" +
                "3507\n" +
                "3914\n" +
                "5120\n" +
                "3709\n" +
                "4186\n" +
                "4194\n" +
                "3725\n" +
                "3846\n" +
                "7760\n" +
                "4567\n" +
                "5421\n" +
                "7524\n" +
                "8645\n" +
                "5365\n" +
                "6363\n" +
                "11492\n" +
                "6006\n" +
                "6697\n" +
                "6378\n" +
                "6119\n" +
                "6348\n" +
                "8641\n" +
                "11438\n" +
                "7216\n" +
                "10087\n" +
                "7232\n" +
                "7434\n" +
                "7555\n" +
                "10686\n" +
                "13797\n" +
                "9211\n" +
                "7571\n" +
                "11799\n" +
                "17642\n" +
                "13351\n" +
                "15861\n" +
                "11371\n" +
                "11484\n" +
                "11713\n" +
                "12125\n" +
                "12354\n" +
                "12384\n" +
                "23283\n" +
                "12467\n" +
                "15559\n" +
                "13564\n" +
                "14448\n" +
                "21336\n" +
                "21571\n" +
                "24509\n" +
                "14666\n" +
                "23755\n" +
                "15126\n" +
                "19284\n" +
                "25064\n" +
                "27358\n" +
                "18942\n" +
                "22855\n" +
                "28026\n" +
                "25918\n" +
                "23084\n" +
                "43793\n" +
                "24097\n" +
                "23838\n" +
                "46367\n" +
                "24738\n" +
                "24851\n" +
                "26915\n" +
                "26031\n" +
                "50015\n" +
                "28012\n" +
                "29114\n" +
                "52869\n" +
                "29792\n" +
                "47310\n" +
                "47935\n" +
                "38226\n" +
                "34068\n" +
                "44006\n" +
                "41797\n" +
                "42026\n" +
                "42780\n" +
                "46693\n" +
                "46922\n" +
                "48576\n" +
                "47181\n" +
                "74607\n" +
                "48835\n" +
                "48689\n" +
                "52946\n" +
                "89732\n" +
                "54043\n" +
                "54927\n" +
                "63860\n" +
                "116729\n" +
                "57126\n" +
                "76295\n" +
                "68018\n" +
                "71589\n" +
                "81006\n" +
                "206461\n" +
                "82644\n" +
                "85803\n" +
                "83823\n" +
                "88978\n" +
                "113615\n" +
                "95757\n" +
                "166027\n" +
                "143775\n" +
                "95870\n" +
                "102732\n" +
                "97524\n" +
                "103762\n" +
                "103616\n" +
                "126516\n" +
                "108970\n" +
                "135933\n" +
                "165273\n" +
                "120986\n" +
                "125144\n" +
                "184622\n" +
                "162098\n" +
                "139607\n" +
                "152595\n" +
                "163650\n" +
                "166467\n" +
                "264830\n" +
                "169626\n" +
                "221014\n" +
                "198602\n" +
                "384664\n" +
                "204840\n" +
                "193394\n" +
                "199486\n" +
                "493634\n" +
                "324229\n" +
                "201140\n" +
                "207378\n" +
                "229956\n" +
                "278596\n" +
                "234114\n" +
                "414408\n" +
                "246130\n" +
                "294770\n" +
                "264751\n" +
                "292202\n" +
                "301705\n" +
                "476824\n" +
                "420500\n" +
                "330117\n" +
                "428392\n" +
                "368228\n" +
                "493372\n" +
                "391996\n" +
                "392880\n" +
                "464237\n" +
                "400772\n" +
                "394534\n" +
                "441492\n" +
                "408518\n" +
                "431096\n" +
                "575606\n" +
                "437334\n" +
                "464070\n" +
                "480244\n" +
                "498865\n" +
                "716113\n" +
                "771594\n" +
                "918316\n" +
                "556953\n" +
                "593907\n" +
                "820388\n" +
                "825630\n" +
                "1346708\n" +
                "762762\n" +
                "1012940\n" +
                "760224\n" +
                "823976\n" +
                "784876\n" +
                "839614\n" +
                "803052\n" +
                "795306\n" +
                "878826\n" +
                "1244544\n" +
                "845852\n" +
                "868430\n" +
                "901404\n" +
                "1826952\n" +
                "944314\n" +
                "979109\n" +
                "1055818\n" +
                "1150860\n" +
                "1739620\n" +
                "1317177\n" +
                "1957222\n" +
                "1378783\n" +
                "1586738\n" +
                "2882770\n" +
                "1522986\n" +
                "2903915\n" +
                "1545100\n" +
                "1555530\n" +
                "1580182\n" +
                "2737598\n" +
                "2424390\n" +
                "1671482\n" +
                "1641158\n" +
                "1714282\n" +
                "1747256\n" +
                "1769834\n" +
                "1812744\n" +
                "2218581\n" +
                "1923423\n" +
                "3078516\n" +
                "3350016\n" +
                "2206678\n" +
                "2468037\n" +
                "3969490\n" +
                "2695960\n" +
                "2901769\n" +
                "4142004\n" +
                "7319506\n" +
                "3100630\n" +
                "3103168\n" +
                "3186258\n" +
                "3125282\n" +
                "3135712\n" +
                "3221340\n" +
                "3932863\n" +
                "3953934\n" +
                "3312640\n" +
                "4714513\n" +
                "3461538\n" +
                "5321749\n" +
                "3582578\n" +
                "3736167\n" +
                "4825192\n" +
                "4902638\n" +
                "4674715\n" +
                "5108447\n" +
                "5668216\n" +
                "8793498\n" +
                "6214409\n" +
                "5799128\n" +
                "6002399\n" +
                "9260666\n" +
                "8668447\n" +
                "6203798\n" +
                "9822960\n" +
                "6260994\n" +
                "6346622\n" +
                "6357052\n" +
                "6533980\n" +
                "6774178\n" +
                "9463937\n" +
                "16238115\n" +
                "8485216\n" +
                "11117047\n" +
                "11208695\n" +
                "7318745\n" +
                "15015069\n" +
                "11021337\n" +
                "12427192\n" +
                "9783162\n" +
                "11467344\n" +
                "11670615\n" +
                "12737778\n" +
                "11801527\n" +
                "12002926\n" +
                "12263393\n" +
                "12464792\n" +
                "12550420\n" +
                "12703674\n" +
                "16169582\n" +
                "24740704\n" +
                "12880602\n" +
                "12891032\n" +
                "19693911\n" +
                "14092923\n" +
                "15803961\n" +
                "18268378\n" +
                "17101907\n" +
                "18340082\n" +
                "18527440\n" +
                "24097807\n" +
                "20804499\n" +
                "29896884\n" +
                "21250506\n" +
                "22674194\n" +
                "25441452\n" +
                "23472142\n" +
                "23804453\n" +
                "35735535\n" +
                "37205496\n" +
                "36695485\n" +
                "26983955\n" +
                "25254094\n" +
                "25584276\n" +
                "34697022\n" +
                "34331401\n" +
                "25771634\n" +
                "28694993\n" +
                "42331893\n" +
                "31194830\n" +
                "32905868\n" +
                "35370285\n" +
                "55135900\n" +
                "36867522\n" +
                "39331939\n" +
                "46772001\n" +
                "66315894\n" +
                "43924700\n" +
                "46504600\n" +
                "47928288\n" +
                "47276595\n" +
                "48726236\n" +
                "49388729\n" +
                "50838370\n" +
                "80792222\n" +
                "51025728\n" +
                "52755589\n" +
                "51355910\n" +
                "72237807\n" +
                "86103940\n" +
                "54466627\n" +
                "56966464\n" +
                "59889823\n" +
                "83372122\n" +
                "70526769\n" +
                "68276153\n" +
                "103738465\n" +
                "76199461\n" +
                "83256639\n" +
                "85836539\n" +
                "100683877\n" +
                "90429300\n" +
                "116162507\n" +
                "95893329\n" +
                "95204883\n" +
                "98114965\n" +
                "100227099\n" +
                "100414457\n" +
                "123263535\n" +
                "108322374\n" +
                "102381638\n" +
                "104111499\n" +
                "200641556\n" +
                "168503252\n" +
                "111433091\n" +
                "114356450\n" +
                "171210646\n" +
                "138802922\n" +
                "144475614\n" +
                "170941226\n" +
                "151532792\n" +
                "159456100\n" +
                "162036000\n" +
                "169093178\n" +
                "176265839\n" +
                "185634183\n" +
                "250236013\n" +
                "191098212\n" +
                "196307786\n" +
                "195431982\n" +
                "266147499\n" +
                "248587113\n" +
                "202796095\n" +
                "267778474\n" +
                "206493137\n" +
                "322474018\n" +
                "215544590\n" +
                "225789541\n" +
                "253159372\n" +
                "283278536\n" +
                "303931714\n" +
                "340783400\n" +
                "290335714\n" +
                "375000690\n" +
                "474376748\n" +
                "310988892\n" +
                "468912719\n" +
                "388430278\n" +
                "453032108\n" +
                "372573625\n" +
                "376732395\n" +
                "518014487\n" +
                "386530194\n" +
                "398228077\n" +
                "401925119\n" +
                "472640636\n" +
                "418340685\n" +
                "409289232\n" +
                "520937846\n" +
                "459652509\n" +
                "478948913\n" +
                "536778433\n" +
                "865479107\n" +
                "678932404\n" +
                "587210250\n" +
                "594267428\n" +
                "715784090\n" +
                "466456641\n" +
                "1108148096\n" +
                "1105224737\n" +
                "1325131616\n" +
                "846182703\n" +
                "749306020\n" +
                "945405554\n" +
                "770801702\n" +
                "763262589\n" +
                "816568762\n" +
                "2040915706\n" +
                "800153196\n" +
                "946067665\n" +
                "827629917\n" +
                "868941741\n" +
                "875745873\n" +
                "926109150\n" +
                "1353347195\n" +
                "1003235074\n" +
                "1053666891\n" +
                "1442194993\n" +
                "1924716858\n" +
                "1060724069\n" +
                "1182240731\n" +
                "1646547575\n" +
                "1215762661\n" +
                "1520107722\n" +
                "1512568609\n" +
                "1534064291\n" +
                "1549459216\n" +
                "1773697582\n" +
                "1853820087\n" +
                "1696910852\n" +
                "1563415785\n" +
                "1692314635\n" +
                "1627783113\n" +
                "2455413030\n" +
                "1753739067\n" +
                "1744687614\n" +
                "1801855023\n" +
                "1878980947\n" +
                "1929344224\n" +
                "2185475805\n" +
                "2114390960\n" +
                "2242964800\n" +
                "4200100644\n" +
                "2276486730\n" +
                "4155467677\n" +
                "2398003392\n" +
                "2735870383\n" +
                "3330153621\n" +
                "3806705595\n" +
                "3204883244\n" +
                "5606640351\n" +
                "3241773851\n" +
                "4152323882\n" +
                "3191198898\n" +
                "3255730420\n" +
                "3308103399\n" +
                "3320097748\n" +
                "3372470727\n" +
                "4142691006\n" +
                "4993053921\n" +
                "3808325171\n" +
                "5718101140\n" +
                "6079081591\n" +
                "4114820029\n" +
                "4299866765\n" +
                "5319274204\n" +
                "4519451530\n" +
                "4674490122\n" +
                "5012357113\n" +
                "5133873775\n" +
                "5589202290\n" +
                "6043973782\n" +
                "8389604195\n" +
                "6396082142\n" +
                "6432972749\n" +
                "8926738099\n" +
                "6446929318\n" +
                "10753571713\n" +
                "6499302297\n" +
                "9026204539\n" +
                "6628201147\n" +
                "6692568475\n" +
                "7180795898\n" +
                "8634271559\n" +
                "7923145200\n" +
                "8108191936\n" +
                "8819318295\n" +
                "8414686794\n" +
                "8789310151\n" +
                "8974356887\n" +
                "9193941652\n" +
                "9531808643\n" +
                "9686847235\n" +
                "10146230888\n" +
                "10723076065\n" +
                "11633176072\n" +
                "15237915434\n" +
                "19556321272\n" +
                "12829054891\n" +
                "12932275046\n" +
                "13680098195\n" +
                "15236239469\n" +
                "15133573856\n" +
                "20409923300\n" +
                "15107255269\n" +
                "25313274267\n" +
                "14800760411\n" +
                "15103941098\n" +
                "16031337136\n" +
                "16337831994\n" +
                "17203996945\n" +
                "17793675182\n" +
                "17389043681\n" +
                "17763667038\n" +
                "18168298539\n" +
                "18725750295\n" +
                "26920852324\n" +
                "40551189701\n" +
                "20869306953\n" +
                "28837173017\n" +
                "27936310160\n" +
                "33698361844\n" +
                "25761329937\n" +
                "26509153086\n" +
                "31138592405\n" +
                "28480858606\n" +
                "29904701509\n" +
                "34593040626\n" +
                "46600840055\n" +
                "29908015680\n" +
                "30832097547\n" +
                "31135278234\n" +
                "31441773092\n" +
                "32369169130\n" +
                "33726875675\n" +
                "46226216698\n" +
                "35152710719\n" +
                "53878461014\n" +
                "35931965577\n" +
                "63603063353\n" +
                "52682182261\n" +
                "46630636890\n" +
                "47378460039\n" +
                "59071588394\n" +
                "52270483023\n" +
                "53697640097\n" +
                "54242188543\n" +
                "95003553971\n" +
                "54990011692\n" +
                "58385560115\n" +
                "59812717189\n" +
                "67067243811\n" +
                "86431784784\n" +
                "67373738669\n" +
                "113293460509\n" +
                "61967375781\n" +
                "95044836445\n" +
                "114061600086\n" +
                "66096044805\n" +
                "68879586394\n" +
                "71084676296\n" +
                "113697880701\n" +
                "82562602467\n" +
                "83310425616\n" +
                "94009096929\n" +
                "98901119913\n" +
                "99648943062\n" +
                "101076100136\n" +
                "106512671566\n" +
                "108687651789\n" +
                "107939828640\n" +
                "109232200235\n" +
                "200521768495\n" +
                "113375571807\n" +
                "118198277304\n" +
                "125908761994\n" +
                "128063420586\n" +
                "167172144941\n" +
                "136253325063\n" +
                "184386525752\n" +
                "130846962175\n" +
                "134975631199\n" +
                "137180721101\n" +
                "139964262690\n" +
                "270811224865\n" +
                "153647278763\n" +
                "165873028083\n" +
                "336775093558\n" +
                "177319522545\n" +
                "200725043198\n" +
                "198550062975\n" +
                "208336594851\n" +
                "207588771702\n" +
                "250556292908\n" +
                "216627480429\n" +
                "217172028875\n" +
                "222607772042\n" +
                "559382865600\n" +
                "249628896870\n" +
                "268027683276\n" +
                "253972182580\n" +
                "258910382761\n" +
                "265822593374\n" +
                "317283785235\n" +
                "329397025150\n" +
                "348300857541\n" +
                "272156352300\n" +
                "533850276650\n" +
                "293611541453\n" +
                "713030144363\n" +
                "330966801308\n" +
                "415501924953\n" +
                "449475874845\n" +
                "375869585520\n" +
                "424216252131\n" +
                "425508623726\n" +
                "415925366553\n" +
                "424760800577\n" +
                "433799509304\n" +
                "439235252471\n" +
                "439779800917\n" +
                "481518154803\n" +
                "521999865856\n" +
                "531066735061\n" +
                "512882565341\n" +
                "547583724033\n" +
                "524732976135\n" +
                "755183053439\n" +
                "754157825727\n" +
                "565767893753\n" +
                "1072316700168\n" +
                "1053066600917\n" +
                "624578342761\n" +
                "669481126973\n" +
                "706836386828\n" +
                "746468726261\n" +
                "1058377852065\n" +
                "800085837651\n" +
                "791794952073\n" +
                "840141618684\n" +
                "840686167130\n" +
                "1371047069022\n" +
                "1285224560788\n" +
                "1090500869888\n" +
                "1193393078198\n" +
                "921297955720\n" +
                "994400720144\n" +
                "1034882431197\n" +
                "1235249020726\n" +
                "1331414729589\n" +
                "1113351617786\n" +
                "1190346236514\n" +
                "1464719961445\n" +
                "1312236620014\n" +
                "1272604280581\n" +
                "1640772004781\n" +
                "1294059469734\n" +
                "1376317513801\n" +
                "1415949853234\n" +
                "1765214238893\n" +
                "1538263678334\n" +
                "1858463689716\n" +
                "1591880789724\n" +
                "1631936570757\n" +
                "2304861580129\n" +
                "2557828841369\n" +
                "1915698675864\n" +
                "2193902236301\n" +
                "2225228667711\n" +
                "2107752337930\n" +
                "2111644192234\n" +
                "2507853301307\n" +
                "2328941900931\n" +
                "3884170815108\n" +
                "2303697854300\n" +
                "2385955898367\n" +
                "2462950517095\n" +
                "2566663750315\n" +
                "2584840900595\n" +
                "2648921794382\n" +
                "3234781203517\n" +
                "4017892469124\n" +
                "2792267367035\n" +
                "3223817360481\n" +
                "3130144468058\n" +
                "5539642783646\n" +
                "3547635246621\n" +
                "3507579465588\n" +
                "3739688908687\n" +
                "4023451013794\n" +
                "4027342868098\n" +
                "4219396530164\n" +
                "4301654574231\n" +
                "6608291914389\n" +
                "5731670661788\n" +
                "6299846832623\n" +
                "4714897799298\n" +
                "4791892418026\n" +
                "6027048570552\n" +
                "5620737101884\n" +
                "4848906415462\n" +
                "5255217884130\n" +
                "5151504650910\n" +
                "5233762694977\n" +
                "10054391438650\n" +
                "5922411835093\n" +
                "9470047081714\n" +
                "6016084727516\n" +
                "6677779714679\n" +
                "6637723933646\n" +
                "7055214712209\n" +
                "7287324155308\n" +
                "10794903620896\n" +
                "16354238271273\n" +
                "8934294329462\n" +
                "9068302945626\n" +
                "8521051104395\n" +
                "11148753248085\n" +
                "9506790217324\n" +
                "17341715593958\n" +
                "12704828285231\n" +
                "9563804214760\n" +
                "11829284365589\n" +
                "10000411066372\n" +
                "10082669110439\n" +
                "17589354050021\n" +
                "10385267345887\n" +
                "11073916486003\n" +
                "11156174530070\n" +
                "18361240641311\n" +
                "11938496562609\n" +
                "12653808661162\n" +
                "12693864442195\n" +
                "13315503648325\n" +
                "15706026879272\n" +
                "18436077403393\n" +
                "16794114372632\n" +
                "26009368090520\n" +
                "30035580036153\n" +
                "18906318450282\n" +
                "18027841321719\n" +
                "18084855319155\n" +
                "20580706703327\n" +
                "19070594432084\n" +
                "28470122665042\n" +
                "19564215281132\n" +
                "19646473325199\n" +
                "27868030858635\n" +
                "38007713966510\n" +
                "20467936456326\n" +
                "34878969691787\n" +
                "21459183831890\n" +
                "23727725147165\n" +
                "31560127111444\n" +
                "54525443016986\n" +
                "24592305223771\n" +
                "43351083684478\n" +
                "51124342392576\n" +
                "29021530527597\n" +
                "58606694838952\n" +
                "34821955694351\n" +
                "35700432822914\n" +
                "45079962522604\n" +
                "49929306496932\n" +
                "36934159772001\n" +
                "37155449751239\n" +
                "58475650422836\n" +
                "38634809713216\n" +
                "38717067757283\n" +
                "41105657157089\n" +
                "60883174898404\n" +
                "40114409781525\n" +
                "41927120288216\n" +
                "44195661603491\n" +
                "45060241680097\n" +
                "45186908979055\n" +
                "56152432335215\n" +
                "48320030370936\n" +
                "53613835751368\n" +
                "59414260918122\n" +
                "78173039378829\n" +
                "82041530069741\n" +
                "79082570039455\n" +
                "63843486221948\n" +
                "70522388517265\n" +
                "74936365475876\n").split("\n");

        int preamble = 25;

        System.out.println(findIncorrectNumber(inputLines, preamble));
    }

    private static BigInteger findIncorrectNumber(String[] inputLines, int preamble) {
        for (int i = preamble; i < inputLines.length ; i++) {
            BigInteger currentNumber = BigInteger.valueOf(Long.parseLong(inputLines[i]));

            boolean currentNumberHasPairOut = false;
            for (int j = i-preamble; j < i; j++) {
                boolean currentNumberHasPair = false;

                for (int k = 0; k < i; k++) {
                    if(BigInteger.valueOf(Long.parseLong(inputLines[j])).equals(BigInteger.valueOf(Long.parseLong(inputLines[k]))))
                        continue;

                    if(BigInteger.valueOf(Long.parseLong(inputLines[j])).add(BigInteger.valueOf(Long.parseLong(inputLines[k]))).equals(currentNumber)) {
                        currentNumberHasPair = true;
                        break;
                    }
                }

                if(currentNumberHasPair) {
                    currentNumberHasPairOut=true;
                    break;
                }
            }
            if(!currentNumberHasPairOut)
                return currentNumber;

        }

        return BigInteger.valueOf(-1);
    }
}