package logic;

import utils.TimeCompare;

import java.util.ArrayList;

public class ConstellationMap {

    private Capricorn capricorn = new Capricorn();
    private Aries aries = new Aries();
    private Taurus taurus = new Taurus();
    private Cancer cancer = new Cancer();
    private Aquarius aquarius = new Aquarius();
    private Gemini gemini = new Gemini();
    private  Leo leo = new Leo();
    private Libra libra = new Libra();
    private  Pisces pisces = new Pisces();
    private Scorpio scorpio = new Scorpio();
    private Virgo virgo = new Virgo();
    private Sagittarius sagittarius = new Sagittarius();
    private ArrayList <Constellation> constellationArray = new ArrayList <Constellation>();

    public ConstellationMap () {
        constellationArray.add(this.capricorn);
        constellationArray.add(this.aries);
        constellationArray.add(this.taurus);
        constellationArray.add(this.cancer);
        constellationArray.add(this.aquarius);
        constellationArray.add(this.gemini);
        constellationArray.add(this.leo);
        constellationArray.add(this.libra);
        constellationArray.add(this.pisces);
        constellationArray.add(this.scorpio);
        constellationArray.add(this.virgo);
        constellationArray.add(this.sagittarius);
    }

    public Constellation getCorrectConstellation(String time) {
        for(Constellation o: constellationArray) {
            TimeCompare timeCompare = new TimeCompare(time, o.getConstellationStartTime(), o.getConstellationEndTime());
            if(timeCompare.TimeCompareResult() == 2){
                return constellationArray.get(0);
            }
            if(timeCompare.TimeCompareResult() == 1)
                return o;
        }
        return null;
    }

}





class Aries extends Constellation {
    public Aries() {
        super(
                "白羊座",
                "03-21",
                "04-20",
                "白羊男是天生的叛逆者，他喜欢向权威挑战，自以为生来就比别人高明。也许他的确比别人高明，可是大多数人并不欣赏他那么自卖自夸。由于他莽撞冒失，四处卖弄自己如何优异，所以不止一次摔得鼻青脸肿。由于他渴求领导别人，而且不肯甘于人后，所以当权势比他大的人教训他时，他的自尊心便深受伤害，他会一再求助于你，寻求安慰，汲取自信。",
                "白羊女受火星守护，通常上积极而坚强的，基本上不会是个小鸟依人的女子。与她在一起，你不会觉得她很柔弱，需要你的怜爱。如果你期待的是个柔美娇媚的女孩，就千万不要找白羊女。白羊女好胜、独立性强，她要的是绝对的自由！无拘无束的生活、自由浪漫的恋爱都是白羊女喜欢的."        );
    }
}
class Taurus extends Constellation {
    public Taurus() {
        super(
                "金牛座",
                "04-21",
                "05-20",
                "金牛男做事向来内急外不急，性格实际、勤勉。一直以一种稳重大方的面目示人。金牛男个性温和顺从，喜爱和平，崇尚和睦，性格沉稳，总是三思而后行。对人对事态度慎重，趋于保守，固执且一根筋，常会被人称作不懂变通的顽固派。对同事有深厚的友情，但由于对事情多计较，会遭到朋友的误解。",
                "金牛女在优裕的环境中长大，为人自然亲切，个性温柔，顺从，爱洁净，具有抵制虚伪和谎言的坚定不移的信念，并以此广泛地影响他人。无论做什么事都慢条斯理，向来信守约定。"        );
    }
}
class Gemini extends Constellation {
    public Gemini() {
        super(
                "双子座",
                "05-21",
                "06-21",
                "我们都不得不承认，他真的很可爱，脑子里装满了千奇百怪的新鲜点子，谈话中尽是幽默和机智。如果你在一个社交场合遇见他，你真的会很容易被他吸引，他总是妙语如珠的逗得大伙儿很开心。他的态度亲切自然，一点都不给人压迫感。从政治、人生，到黄色笑话，保证绝无冷场。跟他在一起真是有趣极了。",
                "由于她双重，甚至多重的个性，她所欣赏的和吸引的男性，可就是各种类型都有了！这么听起来，你的处境好像有点四面楚歌的样子！不过你应该能够了解，其它的男人也跟你一样很难抵抗她的魅力。凭良心说，双子座的女子实在很有趣，非常外向，话特别多。她可以像个小男生一样，陪你上山下海的疯狂玩乐；也可以正经八百的跟你聊天文地理！当然，她更会像个小公主一样跟你花前月下温柔缠绵。她是那么的充满着乐趣和变化！"        );
    }
}
class Cancer extends Constellation {
    public Cancer() {
        super(
                "巨蟹座",
                "06-22",
                "07-22",
                "巨蟹男有着温柔体贴的一面，也有雷厉风行的一面，他是女生所期待的白马王子却又难以驾驭。巨蟹男是贪婪的深井，他可以接受别人说他喜怒无常、埋怨，却从不认为自己贪婪。但是实际上，巨蟹男对自己真正想要的东西是宁愿失去钳子也不愿放弃的，他缓慢、持久地满足自己的渴望和需求，无论是财富还是爱情，只要变成了他的目标，几乎没有什么能让他停步的。",
                "巨蟹女，这是一个完美搭配。巨蟹座和女人性情相加完美体现出其中的韵味。 在月亮守护下，巨蟹女很有女性魅力，她们多为可爱柔软的娃娃脸，圆溜溜的大眼睛，肤色红润，胸部丰满得令人嫉妒，皮肤滑如凝脂，素面朝天就有化妆效果，看起来含情脉脉，性情温柔，不会让人感到压迫，只让人心中生出亲近之意来。巨蟹女的眼神很温柔，充满包容力，就像柔和的月光洒在人身上那么舒适。"
        );
    }
}
class Leo extends Constellation {
    public Leo() {
        super(
                "狮子座",
                "07-23",
                "08-22",
                "他的个性是如此鲜明，热爱表现。别看他看起来神气活现的，其实他内心是非常脆弱的，狮子男渴望美好的爱情、温婉的女子。他很容易感动，对浪漫的气氛完全没有抵抗力，烛光晚餐，优美的音乐，你深情地看着他，倾诉自己对他的钟情，那么他一下子便会成为你爱情的俘虏。",
                "狮子女总是能引起人们的关注，并轻易就让人一见倾心，她是少数集美貌与智慧于一身的人，所以她有资本骄傲、自信，就算是有些虚荣也可以理解。想要驯服她吗？那你最好是个成熟、坚强、聪明、心胸开阔、浪漫而且有创造力的人，如果你能让她敬重你，那你离得到她的芳心不远了。"

        );
    }
}
class Virgo extends Constellation {
    public Virgo() {
        super(
                "处女座",
                "08-23",
                "09-22",
                "这是一个典型的独身者的性格，不喜欢意外的事情。在激情所致的内心骚动面前，常常显得惶恐不定，他用持续不断的自我克制或批评精神来自卫。把遵守习俗作为他行动的准则，一成不变的生活是他理想的天堂。这是个既认真又有强烈责任心的人，一丝不苟地做好本职工作是他的座右铭。所以，可以充分地信赖他，依靠他。",
                "有一种内在魅力和不受“新潮”干扰的特有的浪漫气质。她的谦逊有时会发展到唯恐被人注意的程度，因此，她与生活总保持一定的距离。她愿意把自己的幸福置之度外，而为别人贡献出自己的全部精力。　十分注意细节，有时会到了成癖的地步。她非常注重自己的安全，不喜欢意外的事情。这是一个相当出色的家庭主妇，她懂得如何体贴、照顾自己的亲人，使他们心情愉快，身体健康。"        );
    }
}
class Libra extends Constellation {
    public Libra() {
        super(
                "天秤座",
                "09-23",
                "10-22",
                "天秤男个性随和，和他交往，人们总是忽略他是否长相帅气，而被他的举止大方和热情谈吐所吸引。更何况，他还是个恋爱专家，所以很容易找到恋人。恋爱之初，他会让情人觉得，爱情真是太美好了，但是随着感情的加深，想要有长足的发展，双方还是要付出很多努力的。",
                "天秤女很多情，她们缺乏安全感，很在意别人的看法，因此容易受人影响。她们有时候也十分势利眼，自私总是试图达到绝对平衡，给自己设定难以企及的目标，然后得出自己能力不足的结论。因此实际上，她们很没自信，常低估自己的能力。但是如果得到别人的赞美和鼓励，她们就会鼓起勇气，充满信心。"

        );
    }
}
class Scorpio extends Constellation {
    public Scorpio() {
        super(
                "天蝎座",
                "10-23",
                "11-22",
                "他的火气很大，易激动，报复心强，这点你可得要知道，不要在你无意中，与他开了个不合适的玩笑之后，你才发现他有个大脾气。他超级强的占有欲可真是叫人受不了，他的眼睛更是揉不进半粒砂子。别指示他应该要做什么，他可不受你随意的支配，从某种程度上来说，天蝎座的男人也有着十分任性孩子气的一面。",
                "怀疑”和“极端”是天蝎女生活中不可能会缺少的，她有着极端的占有欲，会想要知道对方的一举一动，好使自己放心。所以，跟天蝎女一块儿生活，最好不要留下任何不良记录，否则她就更有怀疑你的理由了。另外，千万不要心存戏弄，天蝎女的复仇心态，想必用不着再多作说明吧"
        );
    }
}
class Sagittarius extends Constellation {
    public Sagittarius() {
        super(
                "射手座",
                "11-23",
                "12-21",
                "射手男通常善于社交，为人实在。丰富的幽默感，积极认真的人生态度闪烁出热烈的光芒。他渴望真爱，但在情感上需要适度的空间，因此他往往和伴侣保持着柏拉图式的精神恋爱。",
                "射手座是认真且善良的，遇到爱情时，可能让人感觉太激进，热情和付出都来的很快，让对方一下子难以招架。可是，知道吗？射手座很想爱，却也很怕爱！尤其是射手女，刚开始她们只是慢慢的付出，谨慎的爱，很怕自己会受伤。可是在一天一天的相处下，射手座把带刺的防备丢掉，开始不顾一切的去爱他们所爱的人。"
        );
    }
}
class Capricorn extends Constellation {
    public Capricorn() {
        super(
                "摩羯座",
                "12-22",
                "01-19",
                "摩羯座男生特别细心有责任感，对待谁，都会问心无愧，仁至义尽。是摩羯座整个人生当中的核心信条，只有在做到了自己该做到的事情之后摩羯座才能够坦然的去批评别人，去申述理论，因此摩羯座一直都站在正义的一方和大义的立场上。",
                "一板一眼的，戴着厚厚的平底眼镜，梳着中规中矩的头发，就连自己的衣着，也尽量以不突出不惹人瞩目为目标，摩羯座的女生就是这样，貌似不起眼的外表，耐力惊人。摩羯座可以连续十年作同一件普通简单的事情，只是单一重复仍然感觉乐趣无穷，这样的事情，在别的星座女生看来，简直不敢想象，不过摩羯座却能完成，而且津津有味。"
        );
    }
}
class Aquarius extends Constellation {
    public Aquarius() {
        super(
                "水瓶座",
                "01-20",
                "02-18",
                "你爱自由和善变，但是你的梦想无限大。你不但有很多好朋友，而且也搏得年长者得疼爱。你理想高、不喜欢受到限制。聪明而机警的你喜爱挖苦人，加上对爱慕的人忽冷忽热的，捉摸不定，所以一时较难找到理想对象。你优异的推理能力及智慧造成了敏锐的眼光和流畅的辩论能力，是个具有向未知及黑暗挑战的奋战精神的人。你是个温柔的人，即使碰见了讨厌的人，也会对他微笑。因为有点喜新厌旧、没有定性，所以有时候遭人讨厌。不过你普通蛮爆笑、挺可爱的啦！",
                "1"
        );
    }
}
class Pisces extends Constellation {
    public Pisces() {
        super(
                "双鱼座",
                "02-19",
                "03-20",
                "你谦逊、有同情心、又有耐心。对心理、哲理方面有敏锐观察力。你的缺点是胆小、心志不坚跟忧虑过多。你天生便能全然接受一切现状和其他人的本来面目，而且你不会想去改变别人。你将自己内心最深处的感受潜藏于心，但是若能遇上志同道合的朋友，你也会对朋友倾诉自己的感受。对于世俗的一切，你常常会感到束手无策而拙于应付，但是你有一个非常丰富的内心世界。",
                "1"
        );
    }
}

