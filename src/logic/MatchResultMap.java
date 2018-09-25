package logic;

import javafx.css.Match;

import java.util.ArrayList;

public class MatchResultMap {
    private AriesAndAries ariesAndAries = new AriesAndAries();
    private AriesAndTaurus ariesAndTaurus = new AriesAndTaurus();
    private AriesAndGemini ariesAndGemini = new AriesAndGemini();
    private AriesAndCancer ariesAndCancer = new AriesAndCancer();
    private AriesAndLeo ariesAndLeo = new AriesAndLeo();
    private AriesAndVirgo ariesAndVirgo = new AriesAndVirgo();
    private AriesAndLibra ariesAndLibra = new AriesAndLibra();
    private AriesAndScorpio ariesAndScorpio = new AriesAndScorpio();
    private AriesAndSagittarius ariesAndSagittarius = new AriesAndSagittarius();
    private AriesAndCapricorn ariesAndCapricorn = new AriesAndCapricorn();
    private AriesAndAquarius ariesAndAquarius = new AriesAndAquarius();
    private AriesAndPisces ariesAndPisces = new AriesAndPisces();
    private TaurusAndTaurus taurusAndTaurus = new TaurusAndTaurus();
    private TaurusAndGemini taurusAndGemini = new TaurusAndGemini();
    private TaurusAndCancer taurusAndCancer = new TaurusAndCancer();
    private TaurusAndLeo taurusAndLeo = new TaurusAndLeo();
    private TaurusAndVirgo taurusAndVirgo = new TaurusAndVirgo();
    private TaurusAndLibra taurusAndLibra = new TaurusAndLibra();
    private TaurusAndScorpio taurusAndScorpio = new TaurusAndScorpio();
    private TaurusAndSagittarius taurusAndSagittarius = new TaurusAndSagittarius();
    private TaurusAndCapricorn taurusAndCapricorn = new TaurusAndCapricorn();
    private TaurusAndAquarius taurusAndAquarius = new TaurusAndAquarius();
    private TaurusAndPisces taurusAndPisces = new TaurusAndPisces();
    private GeminiAndGemini geminiAndGemini = new GeminiAndGemini();
    private GeminiAndCancer geminiAndCancer = new GeminiAndCancer();
    private GeminiAndLeo geminiAndLeo = new GeminiAndLeo();
    private GeminiAndVirgo geminiAndVirgo = new GeminiAndVirgo();
    private GeminiAndLibra geminiAndLibra = new GeminiAndLibra();
    private GeminiAndScorpio geminiAndScorpio = new GeminiAndScorpio();
    private GeminiAndSagittarius geminiAndSagittarius = new GeminiAndSagittarius();
    private GeminiAndCapricorn geminiAndCapricorn = new GeminiAndCapricorn();
    private GeminiAndAquarius geminiAndAquarius  = new GeminiAndAquarius();
    private GeminiAndPisces geminiAndPisces = new GeminiAndPisces();
    private CancerAndCancer cancerAndCancer = new CancerAndCancer();
    private CancerAndLeo cancerAndLeo = new CancerAndLeo();
    private CancerAndVirgo cancerAndVirgo = new CancerAndVirgo();
    private CancerAndLibra cancerAndLibra = new CancerAndLibra();
    private CancerAndScorpio cancerAndScorpio = new CancerAndScorpio();
    private CancerAndSagittarius cancerAndSagittarius = new CancerAndSagittarius();
    private CancerAndCapricorn cancerAndCapricorn = new CancerAndCapricorn();
    private CancerAndAquarius cancerAndAquarius = new CancerAndAquarius();
    private CancerAndPisces cancerAndPisces = new CancerAndPisces();
    private LeoAndLeo leoAndLeo = new LeoAndLeo();
    private LeoAndVirgo leoAndVirgo = new LeoAndVirgo();
    private LeoAndLibra leoAndLibra = new LeoAndLibra();
    private LeoAndScorpio leoAndScorpio = new LeoAndScorpio();
    private LeoAndSagittarius leoAndSagittarius = new LeoAndSagittarius();
    private LeoAndCapricorn leoAndCapricorn = new LeoAndCapricorn();
    private LeoAndAquarius leoAndAquarius = new LeoAndAquarius();
    private LeoAndPisces leoAndPisces = new LeoAndPisces();
    private VirgoAndVirgo virgoAndVirgo = new VirgoAndVirgo();
    private VirgoAndLibra virgoAndLibra = new VirgoAndLibra();
    private VirgoAndScorpio virgoAndScorpio = new VirgoAndScorpio();
    private VirgoAndSagittarius virgoAndSagittarius = new VirgoAndSagittarius();
    private VirgoAndCapricorn virgoAndCapricorn = new VirgoAndCapricorn();
    private VirgoAndAquarius virgoAndAquarius = new VirgoAndAquarius();
    private VirgoAndPisces virgoAndPisces = new VirgoAndPisces();
    private LibraAndLibra libraAndLibra = new LibraAndLibra();
    private LibraAndScorpio libraAndScorpio = new LibraAndScorpio();
    private LibraAndSagittarius libraAndSagittarius = new LibraAndSagittarius();
    private LibraAndCapricorn libraAndCapricorn = new LibraAndCapricorn();
    private LibraAndAquarius libraAndAquarius = new LibraAndAquarius();
    private LibraAndPisces libraAndPisces = new LibraAndPisces();
    private ScorpioAndScorpio scorpioAndScorpio = new ScorpioAndScorpio();
    private ScorpioAndSagittarius scorpioAndSagittarius =new ScorpioAndSagittarius();
    private ScorpioAndCapricorn scorpioAndCapricorn = new ScorpioAndCapricorn();
    private ScorpioAndAquarius scorpioAndAquarius = new ScorpioAndAquarius();
    private ScorpioAndPisces scorpioAndPisces = new ScorpioAndPisces();
    private CapricornAndCapricorn capricornAndCapricorn = new CapricornAndCapricorn();
    private CapricornAndAquarius capricornAndAquarius = new CapricornAndAquarius();
    private CapricornAndPisces capricornAndPisces = new CapricornAndPisces();
    private AquariusAndAquarius aquariusAndAquarius = new AquariusAndAquarius();
    private AquariusAndPisces aquariusAndPisces = new AquariusAndPisces();
    private PiscesAndPisces piscesAndPisces = new PiscesAndPisces();
    private ArrayList<MatchResult> matchResultArrayList = new ArrayList<>();
    public MatchResultMap() {
        matchResultArrayList.add(ariesAndAries);
        matchResultArrayList.add(aquariusAndAquarius);
        matchResultArrayList.add(aquariusAndPisces);
        matchResultArrayList.add(ariesAndAries);
        matchResultArrayList.add(ariesAndCapricorn);
        matchResultArrayList.add(ariesAndLeo);
        matchResultArrayList.add(ariesAndCancer);
        matchResultArrayList.add(ariesAndGemini);
        matchResultArrayList.add(ariesAndTaurus);
        matchResultArrayList.add(ariesAndVirgo);
        matchResultArrayList.add(ariesAndLibra);
        matchResultArrayList.add(ariesAndScorpio);
        matchResultArrayList.add(scorpioAndAquarius);
        matchResultArrayList.add(piscesAndPisces);
        matchResultArrayList.add(capricornAndPisces);
        matchResultArrayList.add(capricornAndAquarius);
        matchResultArrayList.add(scorpioAndPisces);
        matchResultArrayList.add(geminiAndGemini);
        matchResultArrayList.add(ariesAndSagittarius);
        matchResultArrayList.add(ariesAndAquarius);
        matchResultArrayList.add(taurusAndPisces);
        matchResultArrayList.add(ariesAndPisces);
        matchResultArrayList.add(taurusAndTaurus);
        matchResultArrayList.add(taurusAndGemini);
        matchResultArrayList.add(taurusAndCancer);
        matchResultArrayList.add(taurusAndLeo);
        matchResultArrayList.add(geminiAndCancer);
        matchResultArrayList.add(taurusAndVirgo);
        matchResultArrayList.add(taurusAndLibra);
        matchResultArrayList.add(taurusAndScorpio);
        matchResultArrayList.add(taurusAndSagittarius);
        matchResultArrayList.add(taurusAndCapricorn);
        matchResultArrayList.add(geminiAndLeo);
        matchResultArrayList.add(taurusAndAquarius);
        matchResultArrayList.add(capricornAndCapricorn);
        matchResultArrayList.add(scorpioAndCapricorn);
        matchResultArrayList.add(scorpioAndSagittarius);
        matchResultArrayList.add(scorpioAndScorpio);
        matchResultArrayList.add(libraAndPisces);
        matchResultArrayList.add(libraAndAquarius);
        matchResultArrayList.add(libraAndCapricorn);
        matchResultArrayList.add(libraAndSagittarius);
        matchResultArrayList.add(libraAndScorpio);
        matchResultArrayList.add(geminiAndVirgo);
        matchResultArrayList.add(geminiAndLibra);
        matchResultArrayList.add(geminiAndScorpio);
        matchResultArrayList.add(geminiAndSagittarius);
        matchResultArrayList.add(geminiAndCapricorn);
        matchResultArrayList.add(geminiAndAquarius);
        matchResultArrayList.add(geminiAndPisces);
        matchResultArrayList.add(libraAndLibra);
        matchResultArrayList.add(cancerAndCancer);
        matchResultArrayList.add(cancerAndLeo);
        matchResultArrayList.add(cancerAndVirgo);
        matchResultArrayList.add(cancerAndLibra);
        matchResultArrayList.add(virgoAndPisces);
        matchResultArrayList.add(cancerAndScorpio);
        matchResultArrayList.add(cancerAndSagittarius);
        matchResultArrayList.add(cancerAndCapricorn);
        matchResultArrayList.add(cancerAndAquarius);
        matchResultArrayList.add(virgoAndAquarius);
        matchResultArrayList.add(virgoAndCapricorn);
        matchResultArrayList.add(virgoAndSagittarius);
        matchResultArrayList.add(cancerAndPisces);
        matchResultArrayList.add(leoAndLeo);
        matchResultArrayList.add(leoAndVirgo);
        matchResultArrayList.add(leoAndLibra);
        matchResultArrayList.add(virgoAndScorpio);
        matchResultArrayList.add(virgoAndLibra);
        matchResultArrayList.add(leoAndScorpio);
        matchResultArrayList.add(leoAndSagittarius);
        matchResultArrayList.add(leoAndCapricorn);
        matchResultArrayList.add(leoAndAquarius);
        matchResultArrayList.add(leoAndPisces);
        matchResultArrayList.add(virgoAndVirgo);
    }
    public MatchResult getMatchResult(String nameLeft, String nameRight){
        for (MatchResult o : matchResultArrayList) {
           if ((o.getConstellationOne().matches(nameLeft)&&o.getConstellationTwo().matches(nameRight))
                   || (o.getConstellationTwo().matches(nameLeft)&&o.getConstellationOne().matches(nameRight))) {
               return o;
           }
        }
        return null;
    }



}

class AriesAndAries extends MatchResult{
    public AriesAndAries(){
        super(
                "白羊座",
                "白羊座",
                "两个同是白羊座的人，彼此的观念、想法、作法都大同小异，也很容易产生共鸣投缘的感觉；一旦来电，进展就会很快而且浓烈，两人都充满了青春活力，是属於“行动派”的火热情侣。 两个双生型星座的人，爆发出的能量极强，是一般组合的两倍；还有，您们的爱恋浓度亦很高，质量皆高人一等。",
                "两个同是白羊座的人，彼此的观念、想法、作法都大同小异，也很容易产生共鸣投缘的感觉；一旦来电，进展就会很快而且浓烈，两人都充满了青春活力，是属於“行动派”的火热情侣。 两个双生型星座的人，爆发出的能量极强，是一般组合的两倍；还有，您们的爱恋浓度亦很高，质量皆高人一等。",
                80,
                80
            );
    }
}
class AriesAndTaurus extends MatchResult{
    public AriesAndTaurus(){
        super(
                "白羊座",
                "公牛座",
                "金牛座的您和白羊座的组合，像是慢郎中碰到急惊风。金牛座的您总是慢吞吞的跟在白羊的後面，有点儿像是龟兔赛跑；虽然您总是默默地在一旁收拾白羊因跑得太快而丢三落四的散落物，但您倒也还是无怨无悔。 有时您俩也像是一对孩子，童心都很重，而且您还满依赖白羊座的哦...... 永远有白羊领著头而先有所行动，都不须牛儿去伤脑筋喽！",
                "您俩是属於“急惊风碰到慢郎中”的卡通式组合，热情如火、尝新求变的白羊座，遇上保守被动的金牛，总像拖著头大笨牛似的，显得不太相称，不过若是能以前锋和後卫的组合来互相搭配的话，倒也还不错。 尤其是当男牛碰到女羊凌厉的爱情攻势时，常会有慢半拍的情形，但是由於星座位置相邻，还是有一定的理解度；只要女羊能忍受，倒也不会造成太大的不合。",
                70,
                70
        );
    }
}

class AriesAndGemini extends MatchResult{
    public AriesAndGemini(){
        super(
                "白羊座",
                "双子座",
                "属风象双子座的您，和一个属於火象星座的白羊，同样都是阳性星座，位置和排列的角度都不错；个性和行为模式也都很相近，很容易互相欣赏和吸引。 羊儿求新求变、不拘泥小节，也不死守原则的特性，相当合双子的口味，彼此也能激发出新东西。不过双子要是在思考方面跳跃的过度快速，让羊儿在後辛苦追赶，易使他成为一座活火山，您要当心别“引火自焚”！",
                "火象白羊的您，和风象双子的组合，两人同样都是属於阳性星座，位置相近；个性和行为模式亦可互通。白羊的热情、积极和双子的机巧变化、反应快等特质，很容易相互吸引。 由於双子自己就会有翻脸像翻书的性格，所以在他面前，羊儿可以不用装模作样的隐藏自己的野心及抱负，他会懂得欣赏您的活跃与冒险个性。",
                90,
                90
        );
    }
}

class AriesAndCancer extends MatchResult{
    public AriesAndCancer(){
        super(
                "白羊座",
                "巨蟹座",
                "",
                "白羊座外向率真配上巨蟹的内向、情绪化，有些伤脑筋。蟹子大都敏感而缺乏安全感，遇到不顺心的事，直觉反应就是逃避，与凡事确定目标就往前冲的羊儿大不相同，很容易显得不协调。 由於个性、行为模式和思考逻辑的差距恰成对比，因此衍生出的问题... 基本上不是属於起点相同与否，而是立足点相异的关系。",
                50,
                50
                );
    }
}
class AriesAndLeo extends MatchResult{
    public AriesAndLeo() {
        super(
                "白羊座",
                "狮子座",
                "两个火象星座的人，在初见时，十对有九对会发出火花，有如磁铁般的相互吸引、一见锺情，同时进展快速而浓烈。您俩的性格和观念近似，是恩爱火热又耀眼的组合。狮子的坦白、直接与霸气很能够“克”住羊儿，羊儿大器的风格也很对狮子的胃口。您俩之间的相互吸引力，通常是天生且不费吹灰之力的，只要弄清楚彼此的感情，两人的热度将可保持续不坠。",
                "白羊与狮子同属火象星座，往往天生就会产生超强的吸引力，两人容易一见锺情，有如火上加油一般，进展快速而一路通顺无碍，是很恩爱又耀眼的组合。 羊儿与狮子大都身心开朗而外向，还很爱面子，对爱情的态度直来直往，姿态也颇高；尤其无法接受对方的“没眼光”～被人拒绝。幸好您俩的调调一样，两个都爱卖高，反而一般高了。",
                100,
                100
        );
    }
}

class AriesAndVirgo extends MatchResult{
    public AriesAndVirgo() {
        super(
                "白羊座",
                "处女座",
                "也许是上天别有用心，让纤细、带些神经质的处女座和粗线条的白羊座相遇，还让这两个没有交集极端类型配成对。 因此，当您为了羊儿竟然“什么事”都可以没感觉、没立场、没关系，反而突显自己小心眼、太挑剔，气得七窍生烟时，不妨想想老天的用意，为什么要把您们送作堆？一定是有原因的！您们之间很容易发生尖锐对立的情形，想要和睦共存，恐怕得靠一点奇迹了。",
                "豪放大气的白羊座和纤细又神经质的处女座是两个比较没有交集的类型。大部份的处女很难对冲得快、看来积极又强势的羊儿感兴趣，虽然羊儿可能会被处女座的细心、体贴所吸引，但羊儿却会搞不清楚：处女座为何总对『不重要』的细节斤斤计较？ 要想维持爱情的长久，是需要一点奇迹的。",
                40,
                40
        );
    }
}

class AriesAndLibra extends MatchResult{
    public AriesAndLibra() {
        super(
                "白羊座",
                "天秤座",
                "您与羊儿在星座排列上呈对立的180度，如同球的两个面，不相连也无交集，除了您俩同属阳性星座，个性较开朗、活泼外，其余都是完全相反。 您因反覆思量，有时显得没有原则，让勇猛羊儿认为您没有主张，在他的观念中，这样的人总是输家；而羊儿行事欠周详考虑与急躁的性格，对秤子而言，根本是粗鲁又没大脑的表现。若了解不够深入，自然产生互斥。",
                "羊儿与秤子在星座的排列上是呈现180度，是对立的两个星座；意即您们两人除了同属阳性（男性）星座之外，其余各方面都是完全相反。 勇猛白羊欣赏秤子的美感及品味，相对的又受不了秤子经常为求好而不惜工本的手笔；凡事总要反覆思量，显得没原则、没主张。而秤子也会对羊儿那种喜怒哀乐全摆在脸上、藏不了心事的坦白性格，视为鲁莽、不够聪明的表现。",
                60,
                60
        );
    }
}

class AriesAndScorpio extends MatchResult{
    public AriesAndScorpio(){
        super(
                "白羊座",
                "天蝎座",
                "您们俩一个是天王、一个是孩子王，基本上除了好强好胜之外，个性及行为都是完全相反，一阴一阳。蝎子外冷内热，所有的感觉、好胜心都埋在心底；羊儿凡事则表露在外，率直的像孩子，两个极端遇上～您要爱他，得先学会把话挑明了说！ 羊儿跟您相比，他较漫不经心，承受力也低，想教他配合您，有点难；您最好还是想清楚，要嘛～就配合他，要不然～就跟著感觉走吧！",
                "白羊和天蝎的组合，跟白羊与处女的组合一样，都需要一点奇迹。以星座的角度看来，您们的角度不吉，也距离太远；一个是孩子王，一个是天王，粉辛苦！ 不过，命运总是很爱捉弄人，羊儿很容易会被蝎子神秘魅惑的气质所吸引，反而会促使羊儿产生征服蝎子的战斗欲望。",
                40,
                40
        );
    }
}
class AriesAndSagittarius extends MatchResult{
    public AriesAndSagittarius() {
        super(
                "白羊座",
                "射手座",
                "两个火象星座遇上，犹如火上加了油，一见投缘之後，便互相积极的展开行动，您俩都有乾脆、俐落的个性，属於开朗热情的行动派。会是一对简明快捷的组合。 射手较无法保持一个状态，或局限在某一点太久，即使因为不得已或工作性质，得过著朝九晚五的生活，也能在娱乐、交友等方面，发挥星座的特性。而羊儿求新、求变、求刺激的个性和您很贴近，甚至速度更快，能相处的如鱼得水。不过，有时太热闹活泼的生活，缺少了心灵沟通，两者长时间不成正比的话，您们就会感到无聊了！",
                "两个同属火象星座的您们，在初相见时，便会有如磁铁般的互相吸引而一见锺情，进展快速而浓烈。由於性格相近，会是恩爱、耀眼的一对。 白羊冲劲十足、追求刺激的性格，与射手冒险犯难、喜新厌旧的个性，实在是有异曲同工之妙，具有同等级的精力与热情，不会有一方被吓跑。",
                100,
                100
        );
    }
}
class AriesAndCapricorn extends MatchResult{
    public AriesAndCapricorn() {
        super(
                "白羊座",
                "摩羯座",
                "摩羯的您是土象星座，羊儿则是火象星座，这两个星座的组合，基本上是无甚交集的。 老谋深算，对爱情总谋定而後动的您，爱上冲动又有些莽撞的羊儿了吗？恐怕十之八九是您抵挡不住勇猛羊儿的凌厉攻势吧？羊儿全身都散发著活力、自信的气息，无论您是否觉得他有勇无谋，在初识时都会被羊儿的积极与热情所挑动。不过，由於两人的星座个性都很强，照理论来说，要维系良好的感情，必需付出相当程度的努力～～",
                "摩羯的您是土象星座，羊儿则是火象星座，这两个星座的组合，基本上是无甚交集的。 老谋深算，对爱情总谋定而後动的您，爱上冲动又有些莽撞的羊儿了吗？恐怕十之八九是您抵挡不住勇猛羊儿的凌厉攻势吧？羊儿全身都散发著活力、自信的气息，无论您是否觉得他有勇无谋，在初识时都会被羊儿的积极与热情所挑动。不过，由於两人的星座个性都很强，照理论来说，要维系良好的感情，必需付出相当程度的努力～～",
                50,
                50
        );
    }
}

class AriesAndAquarius extends MatchResult{
    public AriesAndAquarius() {
        super(
                "白羊座",
                "水瓶座",
                "水瓶座属於风象星座，白羊座则是火象星座，风象和火象都属阳（男）性星座，所以很容易相通契合，互相吸引、互相欣赏，是多采多姿，耀眼亮丽的一对。 瓶子是个智慧、理性又未来的星座，和羊儿求新求变、活力充沛的特性，恰是很好的配合，若是搭档的话更会无往不利。",
                "羊儿与秤子在星座的排列上是呈现180度，是对立的两个星座；意即您们两人除了同属阳性（男性）星座之外，其余各方面都是完全相反。 勇猛白羊欣赏秤子的美感及品味，相对的又受不了秤子经常为求好而不惜工本的手笔；凡事总要反覆思量，显得没原则、没主张。而秤子也会对羊儿那种喜怒哀乐全摆在脸上、藏不了心事的坦白性格，视为鲁莽、不够聪明的表现。",
                60,
                60
        );
    }
}

class AriesAndPisces extends MatchResult {
    public AriesAndPisces() {
        super(
                "白羊座",
                "双鱼座",
                "一个是『 黄道之子』，代表初生的白羊座，一个是古老轮回结束的双鱼座；照理说应该是完全不搭的，但如果换一个角度来看：即结束是另一个新的开始。所以，这两个星座碰到一块儿，应该还不坏。 火象白羊与水象双鱼相遇，并非水火不容，反倒因受星座角度的影响，彼此均能得益。羊儿满能容忍鱼儿的缺点，感性鱼儿也会觉得从羊儿身上能学到很多。",
                "双鱼座是古老轮回的结束，白羊座却是开始，一老一小，好比祖孙的感觉，有人说结束是另一个阶段的开始，所以这两个星座在冥冥中好似有某些传承的相连性。“祖孙情”的组合，对鱼儿来说还不错，只要你能容忍羊儿的粗线条和我行我素。身为易感浪漫的星座，有时蛮伤脑筋的，禁不起追求者纠缠，尤其碰上攻势激烈、活力充沛、天真烂漫又心情透明与你截然不同的羊儿。",
                70,
                70
        );
    }
}

class TaurusAndTaurus extends MatchResult {
    public TaurusAndTaurus() {
        super(
                "金牛座",
                "金牛座",
                "两个同为金牛座的人，感情发展绝非一见锺情式，而是有如炭火一般，愈烧愈旺。酝酿过程也比其它星座组合都要来得久，但会是和谐温馨的一对。 没有其他星座比男牛更能吸引女牛的目光，您俩相同点很多，实际、忠实有耐心，对未来的憧憬同样总是行动比动作慢，占有欲也不分上下；表面温和、被动，骨子里却固执又倔强，比较缺乏积极性。",
                "两个同为金牛座的人，感情发展绝非一见锺情式，而是有如炭火一般，愈烧愈旺。酝酿过程也比其它星座组合都要来得久，但会是和谐温馨的一对。 没有其他星座比男牛更能吸引女牛的目光，您俩相同点很多，实际、忠实有耐心，对未来的憧憬同样总是行动比动作慢，占有欲也不分上下；表面温和、被动，骨子里却固执又倔强，比较缺乏积极性。",
                80,
                80
        );
    }
}

class TaurusAndGemini extends MatchResult {
    public TaurusAndGemini() {
        super(
                "金牛座",
                "双子座",
                "行动、脑筋都转的很快的双子，和沈稳踏实的金牛，基本上差异极大，但由於这两个星座的个性都比较温和，所以即使发生冲突也不会太难看。 不过，双子能说会道，擅於玩语言与文字游戏的特性，一般都会令牛儿望之却步；也许您觉得自己理性且变通力强，但牛儿若对您了解不够的话，却可能会认为您是个心口不一、两面光的伪善者哦",
                "沈稳踏实的金牛座和极富机变巧思的双子，虽然各方面的差异很大，但由於两个星座的个性都不是很强，再则双子座是经过金牛座的阶段衍生出的；牛儿对所爱的人有超强的包容力，双子又会希望有强壮的心理依靠，所以金牛及双子的组合，基本上还算是不错的！",
                70,
                70

        );
    }
}

class TaurusAndCancer extends MatchResult {
    public TaurusAndCancer() {
        super(
                "金牛座",
                "巨蟹座",
                "属水象星座的巨蟹，和一个属於土象星座的金牛，同样都是阴性星座，位置也相近，个性犹如水来土掩，容易互相吸引，是甜蜜恩爱的一对。 牛儿总是很专心，喜欢一个人用力守著一份爱，与需要时刻有安心恋情的蟹子不谋而合。在牛儿面前，蟹子不必戴面具，而牛儿固执的个性，在您看来，是种专一的表现",
                "土象金牛遇上水象巨蟹，两个不仅同属阴性星座，位置也很相近，所以在个性和观念上互通之处很多；虽然牛儿在感情处理方面总是慢半拍，但您只要一旦爱上就稳如磐石的忠诚性，恰恰正是缺乏安全感的蟹子所追求的最终目标。因此～～您俩的组合会是恩爱得令人羡慕的一对。",
                90,
                90
        );
    }
}

class TaurusAndLeo extends MatchResult {
    public TaurusAndLeo() {
        super(
                "金牛座",
                "狮子座",
                "狮子座的您与金牛座的星座位置呈九十度，天生便不协调。刚开始您可能会为牛儿沈稳、慢条斯理的在旁守候而感动莫名，牛儿则心仪您的豪情万千与明朗。 然而好景不常，狮子渐渐会对牛儿闷声不吭、却大男人（大女人）式的占有欲，气得冒烟；牛儿也会对您凡事自以为老大（女王），的作风、爱受众星拱月的态度，感到难以忍受，彼此裂痕一旦扩大，就会渐行渐远了。",
                "朴实内敛的牛儿和华丽大气的狮子座，在个性及气质、内在方面，有著明显的差异性。这样的感觉在刚开始时，也许是互相吸引的一种力量，但牛儿想要的是个实在的小女人或好男人，而狮子却要对方视他为皇帝或皇后，除了要您珍惜和爱慕之外，还得敬仰与罩得住他，不只是“尊重”而已哟！两人要想维持的长久，得卯足了劲儿才行。努力加油吧",
                50,
                50

        );
    }
}

class TaurusAndVirgo extends MatchResult {
    public TaurusAndVirgo() {
        super(
                "金牛座",
                "处女座",
                "两个同属土象星座的您们，蛮容易产生相知相融的感觉（您总能迅速地看到牛儿的优点）。在别人眼中的大笨牛，却总能吸引您的目光，能很快看出他隐藏的某项才华，而通常也会是令处女欣赏的。您俩是和谐知心、相信相依的组合。 不过，对於感情，处女与牛儿皆非主动示爱型，总要经过一段似有若无的酝酿期，才能进入牵手期。尤其是酝酿期本就超乎常人的牛儿，您得更细心与体贴地去感觉他的一举一动才行",
                "两个同属土象星座的您们，虽然不见得会一见锺情，进展神速，却能在稳定中求成长；『实际』对大部份恋人而言，绝不是浪漫的同义词，但对金牛和处女来说，却是平实而舒适的爱情态度。您们认为：只要能真心相守就是浪漫。 牛儿通常不修边幅，或总坚称自己的生活“乱中有序”；处女座的人即使外表没有洁癖，心理却严守是非分明；只要您们个性、观念沟通得当，处女对您在生活琐事的散漫，亦能当您是孩子般的包容",
                100,
                100
        );
    }
}

class TaurusAndLibra extends MatchResult {
    public TaurusAndLibra() {
        super(
                "金牛座",
                "天秤座",
                "秤子与牛儿依照星座上的排列看，并非成吉角，但两个星座有一个共同的守护星--金星，所以您们要比其它也是呈如此角度的星座组合，彼此的关系较和谐一些。 但是秤子与牛儿的频率不同，沟通良好与否，是您俩关系可否维持的主要关键！您爱社交生活、在团体中的活力令您觉得魅力十足；牛儿是闷骚型、占有欲强的家居型，仅这一点就够令您们受折磨了",
                "虽然金牛和天秤都有一个共同的守护星(神)--爱神维纳斯，掌管着爱、美与和谐；但除此之外，这两个星座可说是没有交集，要想维持长久的恋情，需要一点奇迹。 金牛是阴性星座，天秤则为阳性星座。您的独裁态度，反而会刺激对方越发用力去实践您难以猜测的目标。",
                40,
                40
        );
    }
}

class TaurusAndScorpio extends MatchResult{
    public TaurusAndScorpio() {
        super(
                "金牛座",
                "天蝎座",
                "蝎子与牛儿是呈180度对立的极端星座，同属於阴性星座，也都属於外冷内热的内向星座；占有欲强又热情如火，外表看起来温温的，可是一旦爱上，就火力十足！ 站在对岸互看的您们，彼此都强烈的吸引著对方，但也有些许紧张气息，因为您们两个人都是不容易让人一眼看清的硬角色...是爱是恨？很难说！记住：要点燃牛儿的爱火，您必须学会耐心及对他坦白。",
                "您们在星座的排列上是呈180度对立的两个星座，意即您们两人除了同属阴性星座，同样内向、感性之外；还一个『闷骚』，另一个『骚闷』，恰是相反的一对宝。 表面上两人沈稳，当面对侃侃而谈的健谈者时，都常表现出不太『明白』别人观点的样子；其实，牛儿是反应不够快，还没接收，蝎子则是自有观点，不为所动。两人的出发点并不同。",
                60,
                60
        );
    }
}

class TaurusAndSagittarius extends  MatchResult {
    public TaurusAndSagittarius() {
        super(
                "金牛座",
                "射手座",
                "个性阳刚的您，自由与自私在您身上揉合得很巧妙，与温和木讷、喜欢稳定自在的金牛，是火象星座对土象星座，思考逻辑全然不同；即使因互相吸引或是好奇而相聚，理论上要想长久牵手，是颇困难的。 若您真的爱上牛儿，请切记：绝对不要没有止境的“欺负”他，他对金钱有算计，但不会小气；他不一定精通吃喝玩乐，但只要他有能力，绝对会供您享受。千万别以为他对您的我行我素不吭声，就代表他会永远忍耐下去，一旦超过他的极限～～他绝对会走，也绝不再回头！",
                "像牛一般的金牛座，和天性自由开放的射手座，两个可说的上是风马牛不相及；非但无共通点，属性也相距甚远，想拉近都不太容易，要维系更需要极大的努力。 射手座的人通常好辩、爱热闹，令喜欢安静的您难以忍受，但为了怕射手嫌您沈闷，不懂生活情趣，还得要勉为其难，实在蛮惨的！",
                40,
                40

        );
    }
}

class TaurusAndCapricorn extends MatchResult {
    public TaurusAndCapricorn() {
        super(
                "金牛座",
                "摩羯座",
                "摩羯与金牛都属於土象星座，特徵是内向、实际、刻苦又耐劳，您们之间绝不是浪漫的传奇，而是有著“血浓於水”似的感情，并且细水长流。但首先得突破您与他被动式的爱情防护罩，才能踏出成功的第一步！最可能发生恋情的情况大都始於团体或工作伙伴、朋友、同学或一起参加活动。彼此的性格、思考模式与价值观都大同小异，只要考虑认真交往後，就会朝著共同目标默默打拚；摩羯与牛儿的恋情多属爱情长跑式，有的是一种柴米夫妻式的情感，外人看来也许乏味透顶，但个中甜蜜只有您们才懂！",
                "两个同属土象星座的您们，不会有惊天动地狂风暴雨般的恋情，往往是细水长流，有如磁铁般紧契合的满分组合。 金牛座的您很懂得欣赏刻苦耐劳又有礼的摩羯座，也对挑战难追的摩羯们有征服的兴趣；不过他们可是擅长戴面具的星座，开始的冷漠可能会让您的爱酝酿的更久，甚至裹足不前。",
                100,
                100
        );
    }
}

class TaurusAndAquarius extends MatchResult {
    public TaurusAndAquarius() {
        super(
                "金牛座",
                "水瓶座",
                "风象星座的水瓶座和土象星座的金牛座，前途实在不怎么看好... 虽然瓶子有时还是拗不过牛儿的耐心守候... 您俩之间总像有一条很难跨越的鸿沟，好比自黏贴纸和油质贴座一样，相连却不相容，是各自独立的一对。 不过呢，瓶子对於愈是奇怪的对象，好像就愈容易受吸引喔！其实平和温厚的牛儿能够令生性博爱的瓶子感到很有安定感。",
                "土象星座的金牛和风象星座的水瓶，基本上是两个不怎么相干的类型；您们之间即使是相互都有好感，也很难黏（连）在一起，总像有一条很难跨越的鸿沟，亦不知该怎么切入彼此陌生的世界。您们俩人相连但不相容，是各自独立的一对。 瓶子需要的对象一定要十分有耐性，由天王星支配的瓶子，心思如风飘缈难测，除了耐心之外，您还要懂得欣赏他的独特。",
                50,
                50

        );
    }
}

class TaurusAndPisces extends MatchResult {
    public TaurusAndPisces() {
        super(
                "金牛座",
                "双鱼座",
                "您们俩都属於阴性星座，所以在很多表现上都较注重内在感觉，由心灵出发；所以一旦你们通过初识的阶段，感情便在自然状况下稳健进行，是甜甜蜜蜜小天地的组合。 牛儿的深情让您十分安心，他的占有欲更令您有被重视的甜蜜～这并不是说鱼儿有被虐狂喔～只是鱼儿很害怕没有依靠、失去方向感，以牛儿那种较无侵略性的独占欲及踏实安定的气质，是较能令鱼儿有安全感。",
                "您们俩都是属於个性并非浓烈类型的阴性星座，互通之处很多；所以在很多表现上，您们都是由心出发，交往过程中也多是在温和的气氛中进行，双方的压力也不会很大。 您们通常在通过初识的阶段，感情便会在自然中进行著，您的坚韧和鱼儿的柔和，会使您们成为惺惺相惜、温馨甜蜜的组合。",
                90,
                90
        );
    }
}

class GeminiAndGemini extends MatchResult {
    public GeminiAndGemini() {
        super(
                "双子座",
                "双子座",
                "两个同是双子座的人，彼此的观念与行为模式都极类似，心意一点就通；可以将彼此精灵巧变的性格发挥得淋漓尽致，甚至相得益彰。会是情谊深厚、生活多彩多姿的组合。 不过，双子们也该面对另一项残酷的现实，因为太知己知彼的缘故，您俩的缺点也很容易放大；只要对方的尾巴摇一摇，就知道有什鬼心思，不也挺危险的吗",
                "两个同是双子座的人，彼此的观念与行为模式都极类似，心意一点就通；可以将彼此精灵巧变的性格发挥得淋漓尽致，甚至相得益彰。会是情谊深厚、生活多彩多姿的组合。 不过，双子们也该面对另一项残酷的现实，因为太知己知彼的缘故，您俩的缺点也很容易放大；只要对方的尾巴摇一摇，就知道有什鬼心思，不也挺危险的吗",
                80,
                80


        );
    }
}

class GeminiAndCancer extends MatchResult {
    public GeminiAndCancer() {
        super(
                "双子座",
                "巨蟹座",
                "水象巨蟹和风象双子，虽是两种不相干的类型，但因您们位置相近，且蟹子也是经由双子的演化而来，所以，您们之间还是存有微妙的情愫，不致於一看就相厌。 但若想与双子共浴爱河，蟹子可得将钳子收起来，即使要用，力道也得控制一下，别忘了双子可是善於变动的星座哦！",
                "外向多变的您和内向敏感的巨蟹座，虽然感觉上像是有著很大的差异，但由於距离很近-- 是位置相邻的两个星座，所以... 可说是属於“近水楼台”型的组合，使您们之间有著奇妙的感应。 蟹子的感性与耐性，能够调和您的知性与浮动，您见多识广又聪颖的特质，也会令对方心仪；彼此可以互相学习，蛮不错的！",
                70,
                70

        );
    }
}

class GeminiAndLeo extends MatchResult {
    public GeminiAndLeo() {
        super(
                "双子座",
                "狮子座",
                "华丽尊贵属火象星座的您，和处世圆融的双子座，都是阳性星座，位置相近、排列的角度也很好，会是开朗亮丽的一对。 虽然，面对精灵古怪的双子，有时会令狮子觉得捉摸不定，但双子却会因您的豪爽大气而自动缴械；若是您能表现的很大方，让他没有“伴君如伴虎”的压迫感，双子会很乐意留在您身边的",
                "风向双子的您和一个华丽贵气的狮子座，同样都是阳性星座，位置也相近，一般而言融通较易，是相互吸引又很相合的一对。 人缘不错、善变、处事圆融，且需要另一半的知性能罩得住他的双子座，还挺能尊重有王者气度的狮子，正好能满足狮子的领导欲，而狮子的豪迈通达也能包容双子不安定的习性；互相截长补短，可以搭配的很好！",
                90,
                90

        );
    }
}

class GeminiAndVirgo extends MatchResult {
    public GeminiAndVirgo() {
        super(
                "双子座",
                "处女座",
                "谨慎努力、一丝不苟地追求合理原则的处女，和善变且常虎头蛇尾的双子，是两种截然不同的类型；但爱情是很奥妙的，处女常会被常识丰富、反应灵敏的双子所吸引。 在深入交往之後，可怜的处女开始备受煎熬，因为他实在变化的太快，前一秒口沫横飞的畅谈某一理念，可能下一秒又换了种完全反面的说法；还甚至说得极有道理，让您无法反驳又难以心服！",
                "性格多变的双子和细致谨慎的处女，虽然守护星都是代表知性的水星，但一个是为成社交宠儿，一个是为了实用，是两种不同的典型。 在刚开始也许觉得会是彼此的特色，但想要细水长流，终究还是会有点吃力。处女是属於冷静、井然有序的思考族，而双子的您则属於跳跃思考型；仅就您欠缺实验、实行的精神这一点，就够令处女座抓狂了",
                50,
                50

        );
    }
}

class GeminiAndLibra extends MatchResult {
    public GeminiAndLibra() {
        super(
                "双子座",
                "天秤座",
                "秤子和双子都属於风象星座，所以自然会产生惺惺相惜的感觉、默契十足，虽不见得像火象星座般亮丽耀眼，但也是很外向的组合，变化多端、多采多姿，也很引人注目。 拥有两个人的智慧与活力的双子，最不能忍受的是无聊，也不爱被家庭琐事束缚，或许他挺会做家事，但家居生活绝不会是他的生活重心；幸好秤子也不是家居动物，相处起来会特别愉快、自在。",
                "两个同属风象星座的您们，在初见时便会有一见如故的感觉，互相敞开心扉。这对於习惯迅速欣赏对方、迅速放电的双子，可能像家常便饭；对星座个性温和、会自然对异性放电的秤子来说，也没啥大不了；不同的是，您们的波长一致，交会共振的机会极大。 双子和秤子虽不一定有如火如荼般的炽热恋情，但也不会像土象星座那平实平淡，而是介於这两者之间的融洽组合。",
                100,
                100
        );
    }
}

class GeminiAndScorpio extends MatchResult {
    public GeminiAndScorpio() {
        super(
                "双子座",
                "天蝎座",
                "蝎子的您犹如深沈的水（水象星座），双子则快捷如风（风象星座），即使风吹时水会波动，您俩基本上仍是两个不相干、也没啥交集的星座。您们是聪明反应快的组合，就像是智慧大对决！ 虽然，您常会被双子轻快灵敏的魅力所吸引，但接触之後，您会因为双子冷漠及自我的本质，而感到失望。双子会因为您的神秘性，而产生好奇心，但通常会因为您所发出的强烈热力，而吓得他逃之夭夭......",
                "活泼多变的双子和深沈尖锐的蝎子，是两个没有交集的组合，各方面的差距都大的恐怖，想要维持长久恋情，实在是需要一点奇迹。 然而，即使挑战性格不强的您，也会因为有颗像猫一般的好奇心，而如飞蛾扑火般的冲向天蝎座。因为蝎子强烈的感情、专情与耐力都是您所缺乏的，反而使您像中了魔咒的被蝎子的气质所深深吸引",
                40,
                40
        );
    }
}

class GeminiAndSagittarius extends MatchResult {
    public GeminiAndSagittarius() {
        super(
                "双子座",
                "射手座",
                "双子属於智慧型，不喜欢固定的既成关系、生活、知识，喜爱变化，也能掌握与操纵变化。像这么优质的对象，自然会使得也热爱活泼变化的射手万分心动。但您们两个星座恰如一个北极、一个南极，南辕北辙，在一起之後不是大好的互补，就是大坏的互斥。 您俩恋情结果的好坏，端看向心力的凝聚，如果缺乏共识，您们这两个不乏追求者，也爱追求人的小朋友，很难继续下去.",
                "您俩在星座的排列上是呈180度对立的两个星座。意即您们俩除了同属阳性星座、开朗外向之外；一个是知性又理性，一个兽性凭感官，各方面都恰恰相反。 因此，射手对您的吸引力不是大坏，就是大好；若是後者，那么双子不仅抵挡不住射手强大的吸力，可能还会受影响的模仿对方。",
                60,
                60
        );
    }
}

class GeminiAndCapricorn extends MatchResult {
    public GeminiAndCapricorn() {
        super(
                "双子座",
                "摩羯座",
                "土象星座的您和风象星座的双子，一阴一阳，本就是两个不同的极端，况且还是距离最远的顶点。但有猫一般好奇心的双子，即使认为您像外星人一样怪，也还是会想撩拨您一下；更何况，他们通常对爱情的态度是“不在乎天长地久，只要求曾经拥有”。而您对於爱情的看法不同，反而会对那种为恋爱而恋爱的人，感到痛心疾首；只是～您依然会忍不住被双子舌灿莲花的口才与旺盛活动力所吸引。 双子向来是以不稳定为稳定状态的星座，这是他们活跃的本钱；碰上相信自己的看法才是最正确的摩羯，恐怕只有“见风转舵”罗！",
                "双子配摩羯，和双子配天蝎一样，都是需要奇迹的组合，唯一不同之处在於，与摩羯的组合里，双子天生具有压倒性的优势。 活泼多变的双子和固执守旧的摩羯，共通点是都有强烈的自尊心，双子虽占优势，但您的个性却不如摩羯强，由於他的强是内在的，所以更加强您们之间的矛盾性。",
                40,
                40

        );
    }
}

class GeminiAndAquarius extends MatchResult {
    public GeminiAndAquarius() {
        super(
                "双子座",
                "水瓶座",
                "两个同是风象星座的人相遇，可以把这象性星座的特徵表现的淋漓尽致，是亦师亦友，爱情和友谊共存共荣，彼此信任、互相尊重的完美组合。 别的星座交到您们为友，通常都会不知如何是好，因为态势实在有点暧昧，感情表现总是像雾又像花；但瓶子与双子普遍都能在开放、自然的关系里相处，空间够大又能彼此分享内心的感受与想法，实在是相当不错！",
                "两个同属风象星座的您们，很容易会产生一种相知相惜的感觉，进而敞开心胸接纳对方，是开朗潇洒的组合。由於您俩开放又自然的关系，彼此都有独立空间可以喘口气，压力不易出现在您们之间。 不过，别忘了瓶子不但博爱还有革新精神，活泼外向的您，可随时得顾虑到瓶子的新鲜点已转向何方，免得您被“革”掉了也不晓得！",
                100,
                100
        );
    }
}

class GeminiAndPisces extends MatchResult {
    public GeminiAndPisces() {
        super(
                "双子座",
                "双鱼座",
                "双鱼的您是南鱼加北鱼的复杂性格，而双子座是东子和西女的双重性格，所以复杂加复杂，将使您们陷入一种极其微妙的复杂关系中。如果您连自己的想法都没办法掌握，要想抓住翻脸比翻书快的双子～实在很困难。 您俩的性格中都有分裂矛盾的因子在内，尤其是这些延伸出的多变性，会令您们相互吸引；但以感情为前题的鱼儿，会觉得双子较玩世不恭而易产生不确定感，而双子座的锐利言词也会使鱼儿难以招架。",
                "您们俩是不怎相干的两种类型，除了都很复杂、矛盾外，即使是有外在的吸引，也很难顺利的维持；个性和动机上的天生差异，使您们更难切入对方的陌生世界。 还有，双子的敏锐感应力和双鱼的敏感，都会使两人忍不住想另外找寻更稳定、厚实的怀抱去依靠。",
                50,
                50
        );
    }
}

class CancerAndCancer extends MatchResult {
    public CancerAndCancer() {
        super(
                "巨蟹座",
                "巨蟹座",
                "两个同为巨蟹座的人，无论是观念或行为模式均极为类似，是相互拥有、相互依赖的组合。 蟹子的敏感多情，使他们有不必开口，就能察觉别人心事的本领，但自己却满擅长“独吞”伤心的苦水；因此，两个蟹子的人爱上了，正好可以互相安慰，连问都不需要问了。",
                "两个同为巨蟹座的人，无论是观念或行为模式均极为类似，是相互拥有、相互依赖的组合。 蟹子的敏感多情，使他们有不必开口，就能察觉别人心事的本领，但自己却满擅长“独吞”伤心的苦水；因此，两个蟹子的人爱上了，正好可以互相安慰，连问都不需要问了。",
                80,
                80
        );
    }
}

class CancerAndLeo extends MatchResult {
    public CancerAndLeo() {
        super(
                "巨蟹座",
                "狮子座",
                "狮子和巨蟹的组合，好比太阳和月亮，虽然是两种完全不同的类型，一阳一阴、一刚一柔，只要爱的比重没错放，使阴阳得以调和、刚柔亦可并济，那绝对会是最佳拍档。 虽然您们基本的差异很大，但蟹子最需要的安全感和安定感，可以很容易在您身上发现，只要记得做个体贴、浪漫的的情人，蟹子一定会如小鸟依人般的依附著您。",
                "您们俩的组合，闪出一道灿烂的光芒耶！月亮巨蟹和太阳狮子，一阴一阳、一水一火，截然不同，却又可以相互辉映，是刚柔并济的代表。 狮子通常外表自傲，其实内心深处却是十分寂寞的，但因为藏在绚丽的外表之下，很难有人能察觉到；而蟹子母性、善感的性情，刚好可以适时帮助狮子卸下威严的武装，好好喘口气。",
                70,
                70
        );
    }
}

class CancerAndVirgo extends MatchResult {
    public CancerAndVirgo() {
        super(
                "巨蟹座",
                "处女座",
                "属土象星座的处女，和属水象星座的巨蟹，同样都是阴性星座，所以在基本上有些类似又不会太像，大方向相同、小地方相合，是温馨平和、优雅细致的一对。 处女和蟹子初遇，会有种奇妙的亲切感，虽然彼此不一定赞同对方的观点，却很能了解与体谅且相互鼓励，这一点对凡事要求合理的您，与天生缺乏自信及安全感的蟹子来说，已经很不容易了！",
                "即使只是小小的关心、亲切，也会令你非常感激的巨蟹座，他是个可令你心情放松的人。热爱大自然的你把家居打理得井井有条，又能给彼此欢愉的爱，但切忌步调太快、表现太强和太挑剔，否则对方便会退缩。",
                90,
                90
        );
    }
}

class CancerAndLibra extends MatchResult {
    public CancerAndLibra() {
        super(
                "巨蟹座",
                "天秤座",
                "巨蟹的情绪化和因追求和谐常产生内在冲突的天秤，乍看之下或者有些许类似，但实际立足点是截然不同的。由於您们又都不是个性强的主导星座，所以您们是都要努力调适的一对。 秤子和蟹子都爱好和平，秤子为了保持和平，甚至愿意说谎、粉饰太平；而蟹子则会实际牺牲自我，以强烈的母爱去维持和平，由此可知，秤子和蟹子这两个星座，即使有相同的方向，也难有相交集的一天。",
                "巨蟹的情绪化和因追求和谐常产生内在冲突的天秤，乍看之下或者有些许类似，但实际立足点是截然不同的。由於您们又都不是个性强的主导星座，所以您们是都要努力调适的一对。 秤子和蟹子都爱好和平，秤子为了保持和平，甚至愿意说谎、粉饰太平；而蟹子则会实际牺牲自我，以强烈的母爱去维持和平，由此可知，秤子和蟹子这两个星座，即使有相同的方向，也难有相交集的一天。",
                50,
                50
        );
    }
}

class CancerAndScorpio extends MatchResult {
    public CancerAndScorpio() {
        super(
                "巨蟹座",
                "天蝎座",
                "您俩都是水象星座，敏锐感性，个性、人生观都很类似，常会产生心有灵犀一点通的感觉；这样的感受，会使您们在开始时就彼此触电，很自然的交往。会是爱得上穷碧落下黄泉、非常速配的一对。 一般而言，蟹子是个很麻烦的星座，情绪变化快的会让人搞不清楚是发生了什麽款的情形；而蝎子对他的这些特性，却能一眼看穿，了解他所需要的安全感、或因自卑所转换出的自满。他也相当倚赖您的谋略，能安抚您多疑的个性，甚至可以为保护您而牺牲自己唷！",
                "同属水象星座的巨蟹和天蝎，在初见时便会产生投缘的感觉；相知相惜的默契，会随著进一步的交往而更见浓烈。蟹子母性温暖的气质搭配蝎子神秘的吸引力，会是魅力四射、珠联璧合的一对。 不过，蝎子在外表看来虽温和冷静，但奉劝蟹子可千万别勾起他的醋劲哦～～特别是您过去的罗曼史，蝎子若发作起来，那威力可是很大的！",
                100,
                100
        );
    }
}

class CancerAndSagittarius extends MatchResult {
    public CancerAndSagittarius() {
        super(
                "巨蟹座",
                "射手座",
                "巨蟹座和射手座是两个极端的典型。您属于家居型，而他则属户外型；您敏感，他神经大条；您闷，他放；看起来似乎各司其所或互补，但实际上是很难搭调的组合。也许在开始时，蟹子会被射手的大方乐天、愉快无心机给电到，但真正交往后，横行的螃蟹要想赶上跟箭跑的一样快的射手，实在是望尘莫及。",
                "巨蟹座和射手座是两个极端的典型。您属於家居型，而他则属户外型；您敏感，他神经大条；您闷，他放；看起来似乎各司其所或互补，但实际上是很难搭调的组合。 也许在开始时，蟹子会被射手的大方乐天、愉快无心机给电到，但真正交往後，横行的螃蟹要想赶上跟箭跑的一样快的射手，实在是望尘莫及。",
                40,
                40
        );
    }
}

class CancerAndCapricorn extends MatchResult {
    public CancerAndCapricorn() {
        super(
                "巨蟹座",
                "摩羯座",
                "虽然说土象星座和水象星座都是阴性星座，理论上应是能相亲相爱的一对组合，但是摩羯座和巨蟹座却是呈一百八十度对立的排列；由於是同质性星座，所以两星座的差异会蛮极端，不是大好就是大坏。而您俩却又互具吸引力，且还颇有缘份，蛮宿命的！ 摩羯会因蟹子认真的态度及善体人意的亲加力打动；也会被蟹子阴晴不定和极度无安全感的脾气打败。其实蟹子爱摩羯的坚韧稳定与如父兄般的照顾，却同样会受不了摩羯的“面无表情”；蟹子看不出您心里在想什么，又怎么可能会安心呢？",
                "蟹子与摩羯在星座的排列上是呈180度对立，除了同属阴性星座，都有内向、守旧的基本个性外，其余都是对立的。 其实母性强烈的蟹子和严父性格的摩羯，同样都很重视家庭及安定的生活，只是两人各以极端的特性来表现。抓紧这个共通点，对於您们关系的维系相当重要。",
                60,
                60
        );
    }
}

class CancerAndAquarius extends MatchResult {
    public CancerAndAquarius() {
        super(
                "巨蟹座",
                "水瓶座",
                "风象星座和水象星座本来就存有志不同道不合的极端差异，而瓶子和蟹子更是差异中的差异，缺乏共通性，老实说并不是很搭调，也较少具有成功的例子。 奉劝瓶子用冷静的优质智慧，好好思考两人是否怀有共同理想，若是有... 再极端的差异又算什么嘛！蟹子的柔情与深厚的母性爱，会带给瓶子无悔的支持及关爱，会让您们的感情久久长长的！",
                "蟹子与瓶子是两种截然不同的类型，也几乎找不著什么共通性，好比建立在沙上的城堡一般，外表看似瑰丽浪漫，终究易因缺乏根基而难以久固。 蟹子感性、瓶子理性，您希望专心保有所爱，他却博爱的有情有意；您讲情时（爱情应只对一个人特别好），他讲理（有爱情也不该忽略友情）；您讲理时（真爱应无条件付出），他又讲情（每个人都是完整个体，自私是人之常情）。这样怎么可能不伤脑筋咧......",
                40,
                40

        );
    }
}

class CancerAndPisces extends MatchResult {
    public CancerAndPisces() {
        super(
                "巨蟹座",
                "双鱼座",
                "您们同属水象星座，在个性及思考模式方面都很类似。蟹子重视安稳与实际的爱情，鱼儿要求全心全意的爱恋与照顾，双方都缺乏安全感；所以若您们的爱情进展开以後，能够成为一对如胶似漆的恩爱组合。 蟹子虽与您一样，“比较”容易爱上人，却不像您会一头栽进去，马上为对方掏心掏肺；他必须慢慢的观察一阵之後，再决定是否要用力爱您。鱼儿想通过这段试链期，得靠自己，不要搞不清楚地认为蟹子无意，就莫名其妙的跟别人“走”在一块儿了！",
                "同属水象星座的巨蟹和双鱼，在初见便会有一见倾心的感受，互相吸引而心意交融，是浪漫绵密、恩爱渝常的一对天生伴侣。 鱼儿多半是温良谦恭型的人，像个海绵般吸尽别人的委屈，也不忍向弱者说“不”。由於感受力强，也自然较容易陷入恋爱，这一点和蟹子是半斤八两；所以和鱼儿谈恋爱优点是他时刻能感受您的敏感、体贴您，缺点则是他也很容易坠入别人的情网，您得把他钳紧一些。",
                100,
                100
        );
    }
}

class LeoAndLeo extends MatchResult {
    public LeoAndLeo(){
        super(
                "狮子座",
                "狮子座",
                "两个同是狮子的人，很容易产生投缘共鸣的感觉，有如两个太阳般的光彩夺目，会是华丽气派、贵族式的一对，在人群中成为万众瞩目的焦点哦！ 两头狮子牵手，会是非常火热的组合，并且相得益彰。不过，好的特质爆出的火花，犹如火树银火；不好的特质一旦引爆，那可会一发不可收拾，互相伤害的威力相当惊人。",
                "两个同是狮子的人，很容易产生投缘共鸣的感觉，有如两个太阳般的光彩夺目，会是华丽气派、贵族式的一对，在人群中成为万众瞩目的焦点哦！ 两头狮子牵手，会是非常火热的组合，并且相得益彰。不过，好的特质爆出的火花，犹如火树银火；不好的特质一旦引爆，那可会一发不可收拾，互相伤害的威力相当惊人。",
                80,
                80
        );
    }
}

class LeoAndVirgo extends MatchResult {
    public LeoAndVirgo() {
        super(
                "狮子座",
                "处女座",
                "处女和狮子虽然是两个不同的类型，但由於星座位置紧邻，处女承袭了狮子座的延伸过程，这种效应使得这两个星座能产生某种微妙的和谐。只要别去针对两人的怪癖去挑剔；例如您讲求正义合理，狮子要面子、讲求派头，在基本的相处上是没啥大问题的。 不过，牵手的首要条件，还是要能拥有相同的见解与主义，这样才会相处的毫无负担。",
                "狮子和处女是两个相邻的星座，理论上而言处女座承袭了狮子的某些特性，但实际上却相反，您常是只纸狮子，外表大哥大，内心却脆弱经不起打击；处女座看来是秀气温和，其实自我要求与防卫力都很强。虽然如此，这种微妙的相邻关系也可保持某种平衡的。 处女座通常有洞察先机的特质，有时难免杞人忧天、神经兮兮，容易让乐天的狮子感到烦不胜烦。",
                70,
                70
        );
    }
}

class LeoAndLibra extends MatchResult {
    public LeoAndLibra() {
        super(
                "狮子座",
                "天秤座",
                "风象星座的您和火象的狮子相遇，犹如一个天生的明星碰上一个贵族，都很会“演戏”哦。秤子是狮子生活舞台上的最佳观众，狮子虽然对领衔主演的差事不遑多让，但他可要顶尖的绿叶来衬托才行；不喜欢争第一的秤子，正巧非常能胜任这个顶尖绿叶的工作。 两人都爱热闹、爱人群与团体，所以价值观与生活态度类似，只要您能安心做最佳幕僚，把您原本热爱的休闲活动与狮子分享，两人便能相得益彰的甜蜜无比的过日子罗！",
                "属於火象星座的狮子，和属於风象的天秤，同样都是阳性星座的一员，位置和排列均成吉角，是投缘、互相需要和依靠的一对。 狮子那爱排场与好呼朋引伴的个性，与秤子注重外表、社交手腕佳的特性，不谋而合；两人看对方都会觉得满顺眼的，会是很醒目的组合。",
                90,
                90


        );
    }
}

class LeoAndScorpio extends MatchResult {
    public LeoAndScorpio() {
        super(
                "狮子座",
                "天蝎座",
                "哇～！“一山不容二虎”耶！自视甚高的蝎子，是水象星座之王，与火象星座之王狮子，要想彼此能看得对眼，确实有点不容易。其实您若爱上狮子座，试著和他成为工作伙伴，进而培养感情，会是不错的一条捷径。 尤其您若懂得欣赏他的优点，不时的称赞他，就更有手到擒来的可能。只是无论一个外表多斯文，一个看来多海派，其实都是极为好胜好强，也都有点自以为是的“臭屁”；能不能互相配合及包容，实在是蛮难说的！",
                "您俩正是地王（狮子）斗天王（蝎子）的格局，或可解释为阳王（狮子）和阴王（蝎子）；星座个性和主导性都是最强的，彼此若能惺惺相惜，那威力可是所有星座组合中最强的。只不过，要小心有随时爆炸的危险。 狮子说话或作事，总惯於凡事挑明著来，这有时对性格内敛，习惯先静静观察再一击要害的蝎子而言，会认为狮子太浮夸做作，或自以为是，而狮子恐怕会认为蝎子的风格有些阴险。若是如此，恋爱怎么好谈？",
                50,
                50
        );
    }
}

class LeoAndSagittarius extends MatchResult {
    public LeoAndSagittarius() {
        super(
                "狮子座",
                "射手座",
                "您俩同属火象星座，很容易被对方的气质吸引，都爱玩耍与热闹；热情会很快地扩展开来，一拍即合，不会“闭俗”。会是一对外表光鲜、明朗的健康组合。 不过，您们都属於“只要我喜欢，有什么不可以”型，相投时，可以爱得死去活来，但要是一旦相背的话，不是吵得天翻地覆，就是一拍两散。尤其是阿莎力又海派的狮子，总喜欢凡事照自己意思，也强烈“希望”别人也能如此；这对我行我素的射手而言，恐怕会撇著说：『谁甩你啊！』",
                "两个同属火象星座的您们，很容易产生共鸣共振的感觉，尤其是碰到射手时，将会使您们的热度一下子升到最高点，是一见锺情式、健康开朗的组合。 您和射手的火样情怀，效果比白羊还好，虽然射手看来神经大条，有话直说；对您，射手却感同身受，还不时以乐观爽朗的个性抚慰著表面阿莎力，内心却颇孤寂的您，是狮子很需要的另一半。",
                100,
                100
        );
    }
}

class LeoAndCapricorn extends MatchResult {
    public LeoAndCapricorn() {
        super(
                "狮子座",
                "摩羯座",
                "摩羯是土象星座之王，也因为有谋略，能沈得住气而堪称万王之王；与火象星座之王的狮子座，天生是王不见王的局面。两星一静一动，都有强烈的企图心，个性皆很强，更要命的是两个星座的想法都很极端。一步一脚印的摩羯，不仅看不惯作风海派、好大喜功、天生强人架势的狮子；甚至对他们明朗天真的性格也很感冒。同样，狮子也会看您不顺眼，认为您的沈著是心机深沈，谨慎应对是小里小气的不称头。其实，狮子的乐观大方对於不擅社交、生活严肃的您，应该是颇具魅力；尤其对爱情，狮子座的人绝不会吝啬投入时间与金钱，尝试去了解他的好处，会让您感到幸福才是！",
                "霸气、阳刚、大格局的狮子，遇上忧郁严谨的摩羯，两人除了强烈企图心外，没有任何交集。且两人的星座个性都很强，一个明争，一个则暗斗，您们会是对相当异类的组合。 刚开始您可能会认为摩羯不说话、深思的模样及气质所吸引，觉得他酷毙了；可是渐渐您会发现，他的智慧怎么跟您的不一样？尤其是一些简单的事，为何会听不懂呢？",
                40,
                40
        );
    }
}

class LeoAndAquarius extends MatchResult {
    public LeoAndAquarius() {
        super(
                "狮子座",
                "水瓶座",
                "水瓶座所代表的风和狮子座代表的火，理论上是相通的，但是你们所占的排列位置却是180度相对，这是你们彼此感受强烈吸引力的原因，亦也是你们冲突的最大原因。 瓶子虽不属强悍型，却也是自我意识高涨，凡事分得很清楚的人，所以您遇上狮子，很难成为全力拥戴的小情人。",
                "水瓶有把爱情太理智化，以致于变的像友情，这会在狮子心中累积毒素。若狮子陪伴太多水瓶觉得束缚太过、平淡无味，相处太少狮子又感到孤单寂寞难耐，矛盾的心境让狮子不知所措。由于他是自尊心很强的狮子座，所以如果你在人前表现过于随便和不礼貌的话，也许会让他心生厌恶。应该由他来引导你才行。",
                60,
                60

        );
    }
}

class LeoAndPisces extends MatchResult {
    public LeoAndPisces() {
        super(
                "狮子座",
                "双鱼座",
                "对於您们两个星座而言，火水不容可说是最贴切不过的形容词了。除非您能认清楚他对您的宰制-- 他会尽心尽力的照顾您，但是很难体会您的易感情绪及挣扎。 说来有点宿命，十个双鱼有八个半会喜欢上狮子，狮子也很容易被“解语花”般的您所吸引。只是等一进入状况後，狮子会爱不了鱼儿拖泥带水的性格，您也无法忍受他的盛气凌人。嗳～～颇折磨人的！",
                "狮子和双鱼有著绝对的差距，比起您与瓶子因相异而互补的情形，您和鱼儿连“补”的可能性都小得看不见，而且有如两条平行线没有交集，想要拉近不太容易，甚至会连相互嫌恶的感觉就显露在表面上。 您若真的有意追求温柔的鱼儿，必得先理解他对您的和颜悦色全是表面硬充的，心里可能对您的粗鲁与自以为是根本就很不满。若是您无意去改变、调整自己，那还是趁早收兵吧！",
                40,
                40
        );
    }
}

class VirgoAndVirgo extends MatchResult {
    public VirgoAndVirgo() {
        super(
                "处女座",
                "处女座",
                "两个同为处女的人，虽然彼此都有一份亲切感，很能了解与欣赏彼此的“质感”；但由於都不够主动积极，进展会很慢，甚至不知如何继续发展，这实在很伤脑筋，总不能老是在心里分析对方的每一步才去应对吧！若是能突破这一关，会是安静怡谥的一对。 爱情总不能一直“谍对谍”、暧昧的猜来猜去，有时也得厚著脸皮去试探一下，才能有所突破！",
                "两个同为处女的人，虽然彼此都有一份亲切感，很能了解与欣赏彼此的“质感”；但由於都不够主动积极，进展会很慢，甚至不知如何继续发展，这实在很伤脑筋，总不能老是在心里分析对方的每一步才去应对吧！若是能突破这一关，会是安静怡谥的一对。 爱情总不能一直“谍对谍”、暧昧的猜来猜去，有时也得厚著脸皮去试探一下，才能有所突破！",
                80,
                80

        );
    }
}

class VirgoAndLibra extends MatchResult {
    public VirgoAndLibra() {
        super(
                "处女座",
                "天秤座",
                "风象星座又力求内外平衡和谐的秤子，怎会爱上处女呢？可能是您期待他优秀的分析能力、实事求是的处事态度帮您平衡吧。爱神让您爱到他，不会只为了要捉弄您，秤子是由处女演化而来，所以您们的潜在是有所相通的；两人都喜欢理性、和谐的气氛，也都有著文雅的品味，是崇尚开发智慧的爱美者。 不过，您得先弄明白纤细坚毅的处女，与您恰是两种不同的典型；否则，当您梦幻地希望他给您想要的意见时，却恐怖的发现他鞭辟入理的见解，句句逼得您～想要逃，偏偏注定要落脚！^_^" ,
                "纤细坚实的处女和追求平衡和谐的秤子，虽然也是两种典型，但却天生能相互了解，且有不少相通之处。不过您不主动开口示爱，只用行动表示关怀；秤子则是若即若离，态度似爱情又像友情，是令人很难看清实际状况的一对。 说起来也蛮让人同情的，因为八成连您自己也弄不清秤子是爱或不爱，很煎熬的。",
                70,
                70
        );
    }
}

class VirgoAndScorpio extends MatchResult {
    public VirgoAndScorpio() {
        super(
                "处女座",
                "天蝎座",
                "水象蝎子与土象处女，同属阴性星座，是属性适合的类型。不过，要想得到处女的爱，您必须要慢慢来才行。由於您俩看对方都还颇顺眼，只要有好的开始，耐著性子等待时机再表达，他会觉得您很尊重他而接受您。 您们都是心思细密，性格较内敛的星座，也是专情派；不同的是您属独占型的专情，外表看来没什么，嫉妒心却强得随时可喷火；而处女则是梦想型的纯情派，两个一强一弱、一正一负，正是联系您俩的最大力量，可以爱的很执著！",
                "专情星座的处女遇上深情星座的蝎子，两人都可相互依靠。两人都属於阴性星座，而蝎子在星座个性中有号称地王的强势个性，一强搭配一弱，属性又相随，将是紧密坚实的一对。 神秘的蝎子常表面温和有礼，但大多内敛深沈，情绪与计划都在肚子里转；这种特性对於喜欢有深度与智慧的处女而言，简直魅力十足！",
                90,
                90
        );
    }
}

class VirgoAndSagittarius extends MatchResult {
    public VirgoAndSagittarius() {
        super(
                "处女座",
                "射手座",
                "在日常生活中很多事都可以给它哈拉过去的射手，要和十二星座中最富批评能力与精神的处女相爱，事前一定一定要先认清楚个性上的差异。最好还能以长时间培养共同的嗜好，这才有牵手一生的可能。否则就会～～因了解而分手啦！ 热情且自然放电的射手和内敛细致的处女，在未正式交往前，都会对彼此有相当程度的欣赏；您钦佩处女的智慧、细心，他则会被您处事明快、热情开朗的性格所迷惑。",
                "严谨内向又温文的处女，遇上热情奔放的射手会有短暂的相交，但随即会因理念的差距而有相当大的疏离感，因缺乏一些维系的动力而感到很辛苦。尤其您若刚好是个不够乐观又缺乏幽默感的处女！ 说得残忍些，大部份处女开始注意到射手的存在，多是觉得小射手有孩子式的天真，不识人性险恶，想教导一番；结果没想到射手的天真，完全是因为爱好自由的强硬天性所致，看来对人毫无防备，其实骨子里可是主观又武断。",
                50,
                50
        );
    }
}

class VirgoAndCapricorn extends MatchResult{
    public VirgoAndCapricorn() {
        super(
                "处女座",
                "摩羯座",
                "同是土象星座，走实际路线的摩羯与处女，无论性格、思想都有很多共通点；两人的磁场一开始就接得上，纯真（至少在感情上）的您马上会被处女体贴有礼的举止吸引。虽然您们俩都不是大声谈爱型，却像有默契般地能先友後婚，通常能同心协力地向共组家庭的方向努力，会是一对幸福美满的组合。 但首先您必须得懂得安定处女座的神经，让他不要紧紧张张，认为做好一件事就得要盯紧每个环节而搞得神经兮兮。不然，您已被他“杂念”到快抓狂，又不巧真的不甚完美，还得听他说：你看，我早知道... 我早说过等等的话，会让您更受不了的！",
                "虽然您们俩都缺乏浪漫，却有著土象星座的共通点：沈稳、实际。这些特质使您们得以建筑起一座凝聚力厚实的金字塔，是为了目标努力奋斗的一对。不过，请记住：摩羯才是法老王。 无论多谦虚的处女，也免不了好分析与评论的习惯；而外表不管是多温和寡言的摩羯，骨子里都有些刚愎自用，所以，敏锐的处女最好还是先徵求过摩羯的意见之後再发言。",
                100,
                100
        );
    }
}

class VirgoAndAquarius extends MatchResult {
    public VirgoAndAquarius() {
        super(
                "处女座",
                "水瓶座",
                "知性、对事物总抱着分析研究态度的处女，与好奇、擅推理、属未来星座的瓶子，基本上是不搭轧的两种人。跟瓶子触电了吗？大概是上升星座或其它星座的排列不错，也可能是一时意乱情迷了！您也许会受瓶子的创造力所吸引，瓶子也会欣赏您的冰雪聪明，但相处之后，您恐怕会觉得他不切实际，他则认为您现实的没有创意、还老把他守得紧紧的！",
                "知性、对事物总抱著分析研究态度的处女，与好奇、擅推理、属未来星座的瓶子，基本上是不搭轧的两种人。跟瓶子触电了吗？大概是上升星座或其它星座的排列不错，也可能是一时意乱情迷了！ 您也许会受瓶子的创造力所吸引，瓶子也会欣赏您的冰雪聪明，但相处之後，您恐怕会觉得他不切实际，他则认为您现实的没有创意、还老把他守得紧紧的！",
                40,
                40
        );
    }
}

class VirgoAndPisces extends MatchResult {
    public VirgoAndPisces() {
        super(
                "处女座",
                "双鱼座",
                "虽然双鱼所代表的水象星座和处女座所代表的土象星座有如同源，都是阴性星座，但由於您们的星座排列正是对立的角度，因此也有著两极化的互动关系。 您们都有温柔纤细、敏感和爱梦想的天性，但是这两星座所表现的方式和逻辑却是完全相反的；这种差异往往可令彼此眼睛一亮，只是随著时间越久、交往越深，这种差异也会造成对立。唯一的改进方式便是相互影响，取得双方的平衡点，只有互补能发挥作用。",
                "对事认真、对人对己要求都高的处女，与直觉敏锐的双鱼，是两种完全相反的类型，但也因为如此，会产生一种很强的吸引力，而在真正交往之後将发现那又是另外一回事。结果好坏，要靠您们沟通的状况。 鱼儿的温柔浪漫，很容易令您心动，而鱼儿对您头头是道的见解，也会很崇拜；但要知道：鱼儿会向很多人示好，因为基本上他们是有点贪心，容易被煽惑，可能一个花前月下的气氛就会令他沈溺～～",
                60,
                60
        );
    }
}

class LibraAndLibra extends MatchResult {
    public LibraAndLibra() {
        super(
                "天秤座",
                "天秤座",
                "两个秤子凑在一起，就像是魅力和品味的大集合。彼此能了解对方要的是美丽、优雅的生活环境，优闲安适的生活品质，愉快的社交生活。 所以两个秤子相看，越看越顺眼，看著对方反反覆覆之间却又有种契合的节拍，使两人互相规律地摆动，可以配合的很好！",
                "两个秤子凑在一起，就像是魅力和品味的大集合。彼此能了解对方要的是美丽、优雅的生活环境，优闲安适的生活品质，愉快的社交生活。 所以两个秤子相看，越看越顺眼，看著对方反反覆覆之间却又有种契合的节拍，使两人互相规律地摆动，可以配合的很好！",
                80,
                80
        );
    }
}

class LibraAndScorpio extends MatchResult {
    public LibraAndScorpio() {
        super(
                "天秤座",
                "天蝎座",
                "蝎子是有神秘魅力的明星，秤子则天生是当明星的料；两人做夥，肯定能光芒四射。不过您们人生观与生活方式的差异挺大的，要想长远的发展下去，必须顺其自然、互相了解後才有希望。否则，一时的意乱情迷，结果可就惨烈：他被您激烈的情感吓跑，您因他豪放的交友方式而痛心...... 秤子对任何人都很好，交游广阔，不喜欢自闭的生活；您要做好心理准备，您的独占欲绝不能施展在他的身上哦！",
                "秤子是天生当明星的料，蝎子则是有神秘魅力的自然明星，您们相遇所散发出的星芒，无人可挡，铁定是万众瞩目的焦点！ 您俩不但是一冷一热，还表里不一；秤子外表热情好客，内心却冷漠不易动真情，蝎子看来与人保持距离，爱起来像火山熔浆；您对爱迟疑，他则是得不到所爱绝不罢休型，独占欲也很强，两人基本上的个性真不一样。",
                70,
                70

        );
    }
}

class LibraAndSagittarius extends MatchResult {
    public LibraAndSagittarius() {
        super(
                "天秤座",
                "射手座",
                "火象射手与风象天秤，都是阳性星座，在星座排列上也呈吉角，是蛮速配的一对组合。您具有随心所欲的天性，也不是不体贴伴侣，只是您一旦热衷某事，马上会对其它东东漠不关心，包括另一半在内。遇上深懂人际关系收与放哲学的秤子，刚好可以让您不必随时管他，又能彼此保持一定的距离；这种相处模式，会让您们很自在，正是互蒙其利、相得益彰。 不过射手可别乐昏了头，秤子跟您一样，交友、恋爱跟结婚是不同的两回事，所以可别太“散”，只要一不小心就可能让您们擦肩而过！",
                "风象星座的秤子和火象星座的射手，同属阳性星座，排列亦成吉角；同样喜欢享受及自由随性，是标准的一拍即合型。使您们的恋情充满活力和乐趣，即使一方只想玩玩，另一方也不会太认真。 可是现实生活可不光是玩，就可以过下去的，婚姻即使不是每个人的最终目的，至少也是大部份人想要的归宿；若秤子想与射手共度一生，还是要多发挥智慧。",
                90,
                90

        );
    }
}

class LibraAndCapricorn extends MatchResult {
    public LibraAndCapricorn(){
        super(
                "天秤座",
                "摩羯座",
                "摩羯所代表的土象和天秤所代表的风象，在星象组合上，土需要风带动，风却不需要土；而土也是在地震等外来强力时，才会移动。 基本上，风与土真是不怎协调，因此这种组合只是普通，不算及格也不太糟的一对。一见秤子，摩羯很可能就受到他优雅的态度和风采所迷惑；只是秤子却不一定能识得摩羯的内在美，甚至会觉得您那一副救国救民似的模样难以亲近。像这样的一对组合想拉在一起，确实挺伤神的！",
                "自由如风的秤子和深沉务实的摩羯，既不相似也不互补，基本上两人很难凑在一块儿，排列也非吉角。您俩会触电，八成是缘於彼此所没有的特质而相互吸引，却不一定能相互欣赏，光靠吸引不能像欣赏般能过一辈子。您喜欢摩羯稳重优雅的仪态与内敛的品味，他则对您自然得体周旋於社交场合，处理感情欲擒故纵，能把人耍得团团转而崇拜不已。但是别忘了这些特质若长期发挥在自己身上，感觉可是会不一样的！",
                50,
                50
         );
    }
}

class LibraAndAquarius extends MatchResult {
    public LibraAndAquarius() {
        super(
                "天秤座",
                "水瓶座",
                "秤子与瓶子是有点像又有点不同的组合，建议您们由朋友开始，清淡零负担的交往，就会使您俩迈向真永远！ 您讲求自我空间的完整，瓶子则认为每个人都是独立的个体；您讨厌不安与冲突，追求和谐人生，他则是博爱的理想主义，人无国界、世界大同。您们虽路线有异，大方向却是没差，所以，分享彼此的感觉与兴趣，是使您们殊途同归的良法。",
                "秤子与瓶子是有点像又有点不同的组合，建议您们由朋友开始，清淡零负担的交往，就会使您俩迈向真永远！ 您讲求自我空间的完整，瓶子则认为每个人都是独立的个体；您讨厌不安与冲突，追求和谐人生，他则是博爱的理想主义，人无国界、世界大同。您们虽路线有异，大方向却是没差，所以，分享彼此的感觉与兴趣，是使您们殊途同归的良法。",
                100,
                100
        );
    }
}

class LibraAndPisces extends MatchResult {
    public LibraAndPisces() {
        super(
                "天秤座",
                "双鱼座",
                "双鱼和秤子基本上都属於非安定的星座，再加上在星座的排列和相对的角度上都不是很理想，使得在先天上您们便有天南地北的差距。哎，两条鱼儿自个儿都拉扯不完了，还得上秤子秤来秤去，真够麻烦的咧！ 虽然您们都是柔情浪漫主义者，很容易互相吸引，但是鱼儿的难禁诱惑和秤子的反反覆覆、进进退退的复杂性格，均是考验两人的最大难关。",
                "别看您与鱼儿表面都很温和，其实您们是两个世界的人；您们很容易让人爱，也容易爱上人，所以秤子与鱼儿谈恋爱，充满了不安定感。 其实您们若是有心相爱，会是最具创意的伴侣之一，两人都有敏锐的审美观，观察力也是一流，亦具有艺术天份，想爱得长远，从这里开始奠基！",
                40,
                40
        );
    }
}

class ScorpioAndScorpio extends MatchResult {
    public ScorpioAndScorpio() {
        super(
                "天蝎座",
                "天蝎座",
                "蝎子是十二星座中最具神秘魅力的一个，也是深藏不露、有谋略的星座。两个蝎子在一起，常会互相吸引的难分难解，也会互相观察又相互戒护；因为特质相似，一旦爱上就像天雷勾动地火，问题是：得踏出成功的第一步，才不会因彼此的防而错失良缘。 最好的法子，即是由不经意的相遇，然後“顺便”开始交往；通常蝎子擅长安静地守候猎物，谋定而後动，所以两只蝎子若能先自朋友再发展成爱人，会让您们走的顺利些，免得在还搞不清状况时，就爱得想独霸对方。",
                "蝎子是十二星座中最具神秘魅力的一个，也是深藏不露、有谋略的星座。两个蝎子在一起，常会互相吸引的难分难解，也会互相观察又相互戒护；因为特质相似，一旦爱上就像天雷勾动地火，问题是：得踏出成功的第一步，才不会因彼此的防而错失良缘。 最好的法子，即是由不经意的相遇，然後“顺便”开始交往；通常蝎子擅长安静地守候猎物，谋定而後动，所以两只蝎子若能先自朋友再发展成爱人，会让您们走的顺利些，免得在还搞不清状况时，就爱得想独霸对方。",
                80,
                80
        );
    }
}

class ScorpioAndSagittarius extends MatchResult {
    public ScorpioAndSagittarius() {
        super(
                "天蝎座",
                "射手座",
                "蝎子属水象星座，射手为火象星座，基本看来不怎么搭轧。而且射手似乎怎么也搞不清蝎子的深谋远虑，还对许多事都很在乎；蝎子则疑惑射手为何可以为了自由逃脱责任，或是在自认为可以无限释放理想的小空间里，猛钻牛角尖？ 不过，由於射手在您之後，隔阂便不如其它同质性星座那么大，您也满容易被热情奔放的射手吸引，也会很快地被火热的射手撩动而占据。",
                "蝎子属水象星座，射手为火象星座，基本看来不怎麽搭轧。而且射手似乎怎麽也搞不清蝎子的深谋远虑，还对许多事都很在乎；蝎子则疑惑射手为何可以为了自由逃脱责任，或是在自认为可以无限释放理想的小空间里，猛钻牛角尖？ 不过，由於射手在您之後，隔阂便不如其它同质性星座那麽大，您也满容易被热情奔放的射手吸引，也会很快地被火热的射手撩动而占据。",
                70,
                70

        );
    }
}

class ScorpioAndCapricorn extends MatchResult {
    public ScorpioAndCapricorn() {
        super(
                "天蝎座",
                "摩羯座",
                "十二星座也有四大天王，分别是土象的万王之王--摩羯、火象的地王--狮子，与白羊座的--孩子王、水象的阴王--天蝎。这四大天王相遇时，难免火气都大一些；不过其中摩羯与蝎子的速配程度，远远超过其它两大天王的组合。 您们俩的共通点是都很专情、有企图心、个性绝非软弱无能型，且较为内敛；尤其习惯把事情闷藏在心底，蝎子更是特别厉害，因为他表面上可能平和得像一点儿事都没发生的样子！是合则两利，分则两害的组合哟！",
                "理论上，水象星座和土象星座很合，同为阴性星座，个性较内向，星座个性也很强，会是一对沈默、无声胜有声的思考型组合。 蝎子及摩羯都挺朴实，且不擅交际，亦不会做出太惹人注目、惊世骇俗的事--至少在表面上看不出来，野心都藏在肚子里。您们都觉得事情的成功不是用说的，必需要用做的，尤其讲出来还可能会见光死；在面对感情的态度方面，也是如此。彼此的电波通不通，就看您们的沟通及默契了！",
                90,
                90
        );
    }
}

class ScorpioAndAquarius extends MatchResult {
    public ScorpioAndAquarius() {
        super(
                "天蝎座",
                "水瓶座",
                "水瓶座的人和天蝎座的人，基本上是两个世界的人，虽然觉得彼此都有著难以捉摸的吸引力，但总觉得很勉强，因为在你们身上很难找到交集点。 千万要记著：蝎子可不好“处理”哦！他们虽然看来很讲理又头脑清楚，但蝎族在面对『负心』的人时，绝不会是弱者。",
                "蝎子代表的水象星座和瓶子的风象星座，实在不是个风生水起的组合。因为基本上您们是两条无交集的单行道，虽然不至於造成激烈的对立，却总在各方面都差异很大，显得不大对盘。 有时可能会在触电的那一刹那，让您觉得很爱慕，但交往之後，您会觉得那是爱情的致命伤；因为基调的不同，会让您不仅抓不住他，还认为他只会不切实际的空想。",
                50,
                50
        );
    }
}

class ScorpioAndPisces extends MatchResult {
    public ScorpioAndPisces() {
        super(
                "天蝎座",
                "双鱼座",
                "水象星座的人经常是为爱情而谈恋爱，很少掺杂著其它目的。双鱼与天蝎的人在这方面的表现更加突出，自然也比较容易接受彼此，而且必将是全心投入的一对。 只要鱼儿不要认为蝎子似乎有太多秘密藏在心底而游走，能耐著性子去发掘，其实您很容易感受到蝎子的自然魅力；另外，蝎子多半有强力抵抗压力的特质，这对消极、遇到压力就闷声逃开的鱼儿来说，实在太帅了！",
                "您和鱼儿同属水象星座，根本上投缘的比率十分高。两人都非常敏感，且直觉很强，蝎子通常有超凡入胜的神秘力量，而鱼儿也不含糊；所以磁场相近，电流也一接就通，会是使个眼色就能互通款曲的组合。 鱼儿柔媚、温驯的个性及天生丰富的幻想和无我精神，都是专情、独占欲强的蝎子想要的，能满足您视爱情为最高目标的原则。只要您能给他安全感及支持，使鱼儿消除猜疑心，只要您们想，要牵手一生并不难。",
                100,
                100
        );
    }
}

class CapricornAndCapricorn extends MatchResult {
    public CapricornAndCapricorn() {
        super(
                "摩羯座",
                "摩羯座",
                "摩羯和摩羯，相处的感觉就是格外的亲切。 你懂我，我也了解你。十分有默契。但是由于摩羯座的人都不太擅长表达内心的感情，有时也会让对方误解你。虽说你们两个本性相近，比较容易有共鸣，但是相对的互补的吸引力就少一些，两个人的恋爱不会搞得轰轰烈烈，但是却能如潺潺小溪，绵绵流长。。。",
                "摩羯和摩羯，相处的感觉就是格外的亲切。 你懂我，我也了解你。十分有默契。但是由于摩羯座的人都不太擅长表达内心的感情，有时也会让对方误解你。虽说你们两个本性相近，比较容易有共鸣，但是相对的互补的吸引力就少一些，两个人的恋爱不会搞得轰轰烈烈，但是却能如潺潺小溪，绵绵流长。。。",
                80,
                80

        );
    }
}

class CapricornAndAquarius extends MatchResult {
    public CapricornAndAquarius() {
        super(
                "摩羯座",
                "水瓶座",
                "一般人总认为风象星座和土象星座是不合的，但这也有程度比较上的不同，水瓶座和摩羯座是相邻的两个星座，也是这两象星座组合配对中比较好的一对。 但是要知道，摩羯跟您一样是不太交心的星座，并且不像您表面较有亲和力，不但外表有距离感，表里如一的摩羯心也不怎么好接近。",
                "土象星座遇上风象星座，通常他觉得无趣，您则觉得无力，不容易组合成功。幸好，摩羯与瓶子位置相邻，自然有些亲切感。不过，对人生目标确定、做事稳重的摩羯，总认为理想派的瓶子一心想打破传统，实在是太乌托邦；虽然想法高妙，令您崇拜眩目，可是您又清楚他的想法不太踏实。在瓶子来说，像您这款“用力”爱他，实在让他不知如何是好。他是如此的博爱，对每个人都一律平等的友好，要怎么给您“相同”的回报呢？这种“平等”的态度，绝对会是让您非常非常嫉妒的一点！",
                70,
                70
        );
    }
}

class CapricornAndPisces extends MatchResult {
    public CapricornAndPisces() {
        super(
                "摩羯座",
                "双鱼座",
                "双鱼先天是泪水多的水象星座，且又是个变动星座，感情较不易稳定；而土象的摩羯则是踏实务实的本位型星座。无论是生活或人格发展上，鱼儿和摩羯在基本上是相合的。但是也许要花上一段时间及考验，主要是因摩羯对爱情觉醒度不高，行动力又低；他可以用深情眼光在您背影守候，但浪漫对他而言则是轻浮的东西。若是能适应摩羯保守又传统的爱情方式，打开他的心扉，您们会成为一对互信、互爱、互谅的坚实组合。",
                "双鱼在十二星座里是个十分诱人的星座，他们天生体贴、温柔又细腻的特性，使人很容易就产生好感。摩羯对这类异性，通常会很中意；事实上，摩羯和鱼儿都属阴性星座，在星座个性上一强一弱、比重上又一弱一强，搭档起来挺速配的。 摩羯较重视实际利益，像老牛似的脚踏实地，一步一脚印；而鱼儿却时刻陶醉在幻想之中，十足属於嫩草型。按理说两人不怎么搭轧，可是您们这组可比作“老牛吃嫩草”的类型，却正巧是爱与被爱、互补有加的组合，尤其是男摩羯对女鱼，更是相辅相成的令人艳羡！",
                90,
                90

        );
    }
}

class AquariusAndAquarius extends MatchResult{
    public AquariusAndAquarius() {
        super(
                "水瓶座",
                "水瓶座",
                "两个同是水瓶座的相遇，会很讶异你们互通的程度，好像透过镜子看另一个自己一样，但你们的关系比较像相识多年的老朋友一样，淡如水又情意长。只是，相对的时间一久，可能会因疏忽而缺少一点“爱火”，由于您们是爱好“尝新解谜”的水瓶座，这点要特别注意！",
                "两个同是水瓶座的相遇，会很讶异你们互通的程度，好像透过镜子看另一个自己一样，但你们的关系比较像相识多年的老朋友一样，淡如水又情意长。只是，相对的时间一久，可能会因疏忽而缺少一点“爱火”，由于您们是爱好“尝新解谜”的水瓶座，这点要特别注意！",
                80,
                80

        );
    }
}

class AquariusAndPisces extends MatchResult {
    public AquariusAndPisces() {
        super(
                "水瓶座",
                "双鱼座",
                "双鱼和水瓶两人的配对行情常常是开高走平的，因为水瓶很喜欢尝试新的关系，又强调人独立个体，谁也不该为谁放弃理想及自我，而双鱼则是难敌诱惑。所以您们常常看来蛮不错的，最後却容易不了了之。但以水象星座和风象星座天生不怎搭轧来看，鱼儿和瓶子的组合，已经算是其中最好的了。 瓶子心胸宽大，不喜欢因为自己而改变对方的特质，在初期的确十分吸引人；但他的脑袋通常蛮奇特的，常有些想法会让您怀疑～是否听错了......",
                "双鱼和水瓶两人的配对行情常常是开高走平的，因为水瓶很喜欢尝试新的关系，又强调人独立个体，谁也不该为谁放弃理想及自我，而双鱼则是难敌诱惑。所以您们常常看来蛮不错的，最後却容易不了了之。但以水象星座和风象星座天生不怎么搭轧来看，鱼儿和瓶子的组合，已经算是其中最好的了。 瓶子心胸宽大，不喜欢因为自己而改变对方的特质，在初期的确十分吸引人；但他的脑袋通常蛮奇特的，常有些想法会让您怀疑～是否听错了......",
                70,
                70

        );
    }
}

class PiscesAndPisces extends MatchResult {
    public PiscesAndPisces() {
        super(
                "双鱼座",
                "双鱼座",
                "两个水象星座的人的相遇，是～水加水，非常“水”！尤其是两个双鱼座的人，喜怒哀乐都来自内在情绪的直线反应、感性又浪漫，很容易投缘，会是非常柔性的一对组合。 两条鱼儿的情绪变化会明确地反应在彼此身上，产生一种“你和我想的一样”的安定力量，相知的感觉十分美好。不过，双鱼是古老轮回的结束，而又沉沦在今世，所以情与欲的冲突就特别明显；在外人看来你们有如一对不食人间烟火的“神侠侣”，这对处在现实生活的竞争中而言，对你们会相当不利，还是现实一点的好。",
                "两个水象星座的人的相遇，是～水加水，非常“水”！尤其是两个双鱼座的人，喜怒哀乐都来自内在情绪的直线反应、感性又浪漫，很容易投缘，会是非常柔性的一对组合。 两条鱼儿的情绪变化会明确地反应在彼此身上，产生一种“你和我想的一样”的安定力量，相知的感觉十分美好。不过，双鱼是古老轮回的结束，而又沉沦在今世，所以情与欲的冲突就特别明显；在外人看来你们有如一对不食人间烟火的“神侠侣”，这对处在现实生活的竞争中而言，对你们会相当不利，还是现实一点的好。",
                80,
                80
        );
    }
}