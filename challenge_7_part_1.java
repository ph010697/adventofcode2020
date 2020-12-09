import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        String[] inputLines = ("dotted blue bags contain 3 wavy bronze bags, 5 clear tomato bags.\n" +
                "mirrored brown bags contain 1 pale teal bag, 3 muted gray bags, 3 dark bronze bags.\n" +
                "shiny violet bags contain 3 vibrant crimson bags.\n" +
                "dotted crimson bags contain 1 posh red bag, 3 dim olive bags.\n" +
                "dotted red bags contain 2 drab white bags, 2 bright cyan bags, 4 bright coral bags, 5 drab maroon bags.\n" +
                "muted beige bags contain 4 clear tomato bags, 1 dotted black bag.\n" +
                "dark lime bags contain 4 light lavender bags, 3 vibrant beige bags, 5 light brown bags.\n" +
                "posh yellow bags contain 4 wavy chartreuse bags, 3 dull white bags, 2 shiny tomato bags, 1 mirrored gray bag.\n" +
                "vibrant turquoise bags contain 5 wavy crimson bags, 5 dim maroon bags, 1 dotted silver bag.\n" +
                "drab brown bags contain 1 vibrant cyan bag.\n" +
                "bright crimson bags contain 2 drab purple bags, 2 faded beige bags, 4 dim turquoise bags.\n" +
                "clear gold bags contain 3 dotted tomato bags, 5 pale magenta bags, 3 clear gray bags.\n" +
                "bright lavender bags contain 1 vibrant silver bag, 5 dotted black bags, 1 dark aqua bag.\n" +
                "faded red bags contain 5 pale white bags.\n" +
                "shiny brown bags contain 2 shiny beige bags, 1 vibrant indigo bag.\n" +
                "dotted teal bags contain 4 clear yellow bags, 1 dim crimson bag, 5 dull teal bags.\n" +
                "wavy orange bags contain 3 wavy green bags, 1 dark chartreuse bag, 5 bright silver bags, 3 dim plum bags.\n" +
                "dull indigo bags contain 2 faded black bags, 2 faded red bags, 4 dim bronze bags.\n" +
                "pale blue bags contain 2 pale fuchsia bags, 5 mirrored bronze bags, 2 faded fuchsia bags.\n" +
                "light lime bags contain 4 pale lime bags, 5 plaid green bags, 3 clear turquoise bags, 3 plaid yellow bags.\n" +
                "faded turquoise bags contain 3 mirrored silver bags.\n" +
                "drab magenta bags contain 2 clear tomato bags.\n" +
                "light maroon bags contain 2 plaid coral bags.\n" +
                "muted orange bags contain 1 muted salmon bag, 3 bright indigo bags, 2 dull maroon bags, 3 muted olive bags.\n" +
                "clear maroon bags contain 5 clear tomato bags, 5 muted tomato bags, 1 wavy silver bag, 4 light brown bags.\n" +
                "dim tomato bags contain 4 dull green bags, 3 wavy bronze bags, 1 dim teal bag, 3 vibrant magenta bags.\n" +
                "muted purple bags contain 4 dim aqua bags.\n" +
                "vibrant coral bags contain 5 light tomato bags, 2 bright tomato bags, 3 muted black bags, 1 plaid indigo bag.\n" +
                "dotted orange bags contain 1 light tomato bag, 1 shiny aqua bag, 4 wavy gold bags.\n" +
                "dim beige bags contain 4 drab blue bags.\n" +
                "dotted black bags contain no other bags.\n" +
                "dark blue bags contain 1 dull crimson bag, 2 muted gray bags.\n" +
                "dim cyan bags contain 1 faded indigo bag, 1 dotted blue bag.\n" +
                "dull violet bags contain 5 wavy plum bags, 3 clear magenta bags.\n" +
                "bright violet bags contain 4 dotted teal bags, 2 pale lime bags.\n" +
                "striped tomato bags contain 2 dim salmon bags, 2 faded white bags, 3 drab violet bags.\n" +
                "plaid bronze bags contain 4 posh red bags.\n" +
                "wavy indigo bags contain 5 drab tomato bags, 3 mirrored olive bags, 3 muted tomato bags.\n" +
                "dull purple bags contain 2 striped orange bags, 5 pale green bags, 2 clear orange bags, 1 dotted violet bag.\n" +
                "striped yellow bags contain 1 posh yellow bag.\n" +
                "mirrored violet bags contain 5 light green bags.\n" +
                "dim blue bags contain 5 faded cyan bags.\n" +
                "posh brown bags contain 3 wavy blue bags.\n" +
                "striped gray bags contain 5 dim tan bags.\n" +
                "drab orange bags contain 1 plaid brown bag, 5 dull tomato bags.\n" +
                "wavy beige bags contain 1 shiny gold bag, 1 dark orange bag, 4 muted lavender bags.\n" +
                "drab beige bags contain 3 dull yellow bags.\n" +
                "dotted aqua bags contain 3 posh tomato bags, 3 dark green bags, 1 light olive bag.\n" +
                "striped black bags contain 5 dull maroon bags.\n" +
                "faded white bags contain 4 posh coral bags, 5 bright lime bags, 5 drab lavender bags, 4 shiny cyan bags.\n" +
                "dotted gold bags contain 4 drab bronze bags, 2 wavy fuchsia bags, 2 bright aqua bags, 2 vibrant brown bags.\n" +
                "muted teal bags contain 1 pale yellow bag, 4 pale beige bags, 1 vibrant olive bag.\n" +
                "dotted chartreuse bags contain 4 dotted fuchsia bags, 5 clear gold bags.\n" +
                "light black bags contain 4 posh coral bags, 3 striped orange bags, 3 dull brown bags.\n" +
                "clear black bags contain 2 vibrant white bags, 4 dull teal bags, 3 mirrored aqua bags, 1 mirrored gold bag.\n" +
                "faded coral bags contain 4 drab gold bags, 4 drab indigo bags, 1 mirrored gold bag, 3 dotted purple bags.\n" +
                "clear fuchsia bags contain 2 drab teal bags, 5 striped beige bags.\n" +
                "light gold bags contain 4 vibrant gray bags.\n" +
                "vibrant indigo bags contain 2 dull tomato bags, 4 plaid white bags.\n" +
                "faded olive bags contain 2 dim lime bags, 5 mirrored crimson bags.\n" +
                "striped purple bags contain 3 mirrored red bags, 3 vibrant yellow bags.\n" +
                "drab tomato bags contain 2 faded violet bags.\n" +
                "drab gray bags contain 3 drab purple bags, 1 shiny gray bag, 5 wavy aqua bags.\n" +
                "vibrant lavender bags contain 1 wavy purple bag, 5 striped gold bags, 4 dim coral bags.\n" +
                "dotted tan bags contain 5 pale fuchsia bags.\n" +
                "bright teal bags contain 1 vibrant yellow bag.\n" +
                "pale olive bags contain 3 striped white bags, 2 vibrant lavender bags, 1 dull orange bag.\n" +
                "shiny bronze bags contain 1 posh maroon bag, 4 plaid blue bags, 5 clear gold bags, 1 drab white bag.\n" +
                "dotted gray bags contain 3 muted olive bags, 3 bright indigo bags, 3 light turquoise bags, 1 muted salmon bag.\n" +
                "pale yellow bags contain 2 light blue bags, 2 pale beige bags.\n" +
                "posh purple bags contain 1 shiny blue bag, 4 striped yellow bags, 3 dim purple bags.\n" +
                "mirrored orange bags contain 4 dotted olive bags, 4 bright turquoise bags, 5 striped violet bags, 4 shiny coral bags.\n" +
                "vibrant black bags contain 3 vibrant olive bags, 5 plaid gold bags.\n" +
                "bright olive bags contain 4 dull teal bags, 2 pale plum bags, 2 dim white bags.\n" +
                "mirrored plum bags contain 3 striped gray bags.\n" +
                "dim brown bags contain 3 striped plum bags.\n" +
                "plaid beige bags contain 5 drab fuchsia bags, 2 dark beige bags, 4 mirrored turquoise bags, 1 mirrored crimson bag.\n" +
                "pale gold bags contain 1 drab fuchsia bag, 5 muted silver bags, 1 drab teal bag, 2 striped brown bags.\n" +
                "vibrant white bags contain 4 dim tan bags, 2 faded violet bags, 5 dim fuchsia bags, 5 muted olive bags.\n" +
                "posh coral bags contain 3 mirrored aqua bags, 1 drab tomato bag.\n" +
                "shiny lavender bags contain 1 plaid violet bag.\n" +
                "drab lavender bags contain 2 dotted coral bags, 2 shiny indigo bags.\n" +
                "drab cyan bags contain 1 dim blue bag, 2 muted silver bags, 5 dark aqua bags.\n" +
                "vibrant plum bags contain 3 shiny green bags, 4 dim white bags, 2 dark turquoise bags.\n" +
                "striped salmon bags contain 3 wavy blue bags.\n" +
                "clear aqua bags contain 3 vibrant aqua bags.\n" +
                "dark cyan bags contain 1 striped green bag.\n" +
                "striped aqua bags contain 5 clear gray bags, 2 clear violet bags, 1 shiny aqua bag, 5 mirrored turquoise bags.\n" +
                "dim silver bags contain 2 drab cyan bags, 3 shiny silver bags, 4 plaid beige bags.\n" +
                "shiny olive bags contain 4 striped green bags, 1 wavy magenta bag, 3 dim teal bags, 5 drab beige bags.\n" +
                "posh salmon bags contain 2 clear turquoise bags.\n" +
                "pale bronze bags contain 2 dull maroon bags.\n" +
                "striped violet bags contain 3 mirrored purple bags, 4 dark orange bags, 2 drab olive bags.\n" +
                "mirrored red bags contain 1 drab black bag, 1 posh blue bag.\n" +
                "clear plum bags contain 4 bright yellow bags, 4 dotted gray bags, 5 plaid aqua bags, 2 light coral bags.\n" +
                "wavy green bags contain 3 mirrored aqua bags, 2 muted black bags, 1 dim blue bag, 5 mirrored turquoise bags.\n" +
                "dull silver bags contain 3 posh lavender bags, 4 vibrant indigo bags.\n" +
                "bright lime bags contain 3 mirrored salmon bags, 3 wavy plum bags, 2 clear tomato bags, 4 mirrored turquoise bags.\n" +
                "muted lime bags contain 3 dark white bags.\n" +
                "plaid fuchsia bags contain 1 light tomato bag, 5 clear maroon bags, 2 bright violet bags.\n" +
                "bright white bags contain 4 dotted green bags, 2 drab brown bags, 2 dotted teal bags, 5 striped cyan bags.\n" +
                "dark tan bags contain 3 muted tan bags.\n" +
                "light crimson bags contain 2 muted olive bags, 5 light tan bags, 5 wavy orange bags.\n" +
                "mirrored chartreuse bags contain 5 plaid chartreuse bags, 4 light aqua bags.\n" +
                "muted blue bags contain 3 shiny purple bags, 3 dotted yellow bags, 5 dull cyan bags, 4 clear gray bags.\n" +
                "mirrored white bags contain 4 shiny yellow bags, 1 wavy silver bag, 1 wavy bronze bag.\n" +
                "dim crimson bags contain 2 drab bronze bags, 3 clear violet bags, 3 shiny indigo bags, 1 vibrant white bag.\n" +
                "plaid gold bags contain 3 drab black bags, 5 clear orange bags, 3 muted cyan bags, 4 dim blue bags.\n" +
                "drab purple bags contain 5 bright cyan bags, 2 dull silver bags.\n" +
                "vibrant magenta bags contain 2 wavy plum bags, 3 pale indigo bags, 1 light turquoise bag, 1 vibrant gold bag.\n" +
                "clear olive bags contain 4 posh gray bags, 3 dark black bags, 1 dark aqua bag.\n" +
                "dotted indigo bags contain 3 vibrant cyan bags, 3 pale fuchsia bags.\n" +
                "wavy aqua bags contain 5 clear bronze bags, 2 clear lavender bags, 1 pale crimson bag.\n" +
                "mirrored tan bags contain 1 dim white bag, 2 dim magenta bags.\n" +
                "dotted lavender bags contain 5 striped tomato bags.\n" +
                "plaid chartreuse bags contain 2 light plum bags, 5 drab chartreuse bags.\n" +
                "light turquoise bags contain 4 plaid white bags, 1 mirrored purple bag.\n" +
                "pale purple bags contain 1 light tomato bag.\n" +
                "posh tomato bags contain 3 bright lime bags.\n" +
                "dark turquoise bags contain 1 clear orange bag, 5 shiny aqua bags, 1 muted coral bag.\n" +
                "muted gold bags contain 2 light salmon bags.\n" +
                "vibrant green bags contain 4 dull tomato bags, 1 drab lavender bag, 2 drab white bags, 4 pale brown bags.\n" +
                "shiny turquoise bags contain 5 muted coral bags, 2 dotted black bags, 2 wavy brown bags.\n" +
                "dotted lime bags contain 5 faded cyan bags.\n" +
                "posh cyan bags contain 4 dull tan bags, 4 wavy plum bags.\n" +
                "muted lavender bags contain 3 muted salmon bags, 5 bright indigo bags, 2 clear bronze bags, 4 striped gold bags.\n" +
                "shiny teal bags contain 2 drab olive bags, 5 pale red bags, 3 dotted red bags, 3 plaid indigo bags.\n" +
                "dull gold bags contain 3 wavy beige bags, 4 dotted tomato bags, 4 posh lavender bags, 1 muted cyan bag.\n" +
                "faded maroon bags contain 5 clear lavender bags, 3 clear teal bags, 5 clear orange bags, 1 bright cyan bag.\n" +
                "light blue bags contain 5 posh red bags, 5 plaid white bags, 4 dark orange bags, 3 striped silver bags.\n" +
                "dark aqua bags contain 4 dark orange bags.\n" +
                "clear violet bags contain no other bags.\n" +
                "dim chartreuse bags contain 3 posh lavender bags, 4 dim tan bags, 4 dotted tomato bags.\n" +
                "posh silver bags contain 5 striped black bags, 1 pale green bag, 4 bright coral bags, 1 plaid olive bag.\n" +
                "plaid purple bags contain 1 shiny coral bag, 1 plaid blue bag, 3 clear brown bags, 4 posh tan bags.\n" +
                "drab salmon bags contain 1 shiny purple bag, 3 muted black bags, 2 faded gold bags.\n" +
                "vibrant bronze bags contain 2 dim lime bags.\n" +
                "dotted salmon bags contain 5 muted black bags, 1 light yellow bag, 2 plaid white bags.\n" +
                "dull aqua bags contain 5 clear black bags, 1 pale gold bag, 2 light turquoise bags, 3 striped tomato bags.\n" +
                "posh magenta bags contain 5 plaid black bags, 1 vibrant coral bag, 2 dim black bags.\n" +
                "drab gold bags contain 3 dim turquoise bags, 1 dotted beige bag, 4 dim olive bags.\n" +
                "posh gray bags contain 4 dotted turquoise bags, 5 plaid gray bags, 5 clear yellow bags.\n" +
                "bright coral bags contain 4 light turquoise bags, 2 shiny gold bags.\n" +
                "dark lavender bags contain 4 faded blue bags.\n" +
                "light teal bags contain 2 posh silver bags, 2 drab maroon bags, 3 dim orange bags.\n" +
                "pale black bags contain 1 striped red bag, 2 plaid lavender bags, 4 dim chartreuse bags, 2 faded black bags.\n" +
                "wavy fuchsia bags contain 3 faded gray bags, 1 muted silver bag, 1 striped plum bag.\n" +
                "wavy lavender bags contain 3 pale magenta bags, 1 clear tan bag.\n" +
                "dotted fuchsia bags contain 5 mirrored purple bags, 3 dotted yellow bags, 3 dark beige bags.\n" +
                "wavy crimson bags contain 3 pale beige bags, 1 vibrant orange bag.\n" +
                "striped plum bags contain 4 wavy bronze bags, 4 muted beige bags, 4 shiny yellow bags.\n" +
                "dull blue bags contain 5 clear tomato bags, 3 shiny indigo bags, 5 dotted cyan bags.\n" +
                "dull red bags contain 3 dim bronze bags, 1 dotted blue bag.\n" +
                "striped teal bags contain 5 pale fuchsia bags, 2 dull silver bags.\n" +
                "dark olive bags contain 2 dotted red bags, 1 dull blue bag.\n" +
                "mirrored coral bags contain 2 clear violet bags, 5 posh tan bags, 1 dim indigo bag, 3 faded cyan bags.\n" +
                "dark maroon bags contain 3 dull coral bags.\n" +
                "dull maroon bags contain 4 dim indigo bags.\n" +
                "vibrant olive bags contain 1 muted olive bag, 5 striped plum bags.\n" +
                "bright beige bags contain 3 muted beige bags, 2 shiny turquoise bags, 1 shiny violet bag, 1 vibrant lime bag.\n" +
                "clear brown bags contain 2 pale teal bags, 3 dull yellow bags, 4 pale red bags, 3 faded violet bags.\n" +
                "vibrant crimson bags contain 4 muted silver bags, 1 shiny yellow bag.\n" +
                "drab indigo bags contain 2 shiny tan bags.\n" +
                "vibrant maroon bags contain 4 vibrant lime bags, 2 clear gold bags.\n" +
                "dark brown bags contain 5 striped brown bags, 3 muted coral bags, 3 dim coral bags.\n" +
                "light red bags contain 5 light blue bags.\n" +
                "posh olive bags contain 4 dim lime bags, 3 mirrored tomato bags, 3 light green bags, 1 dark black bag.\n" +
                "dotted violet bags contain 3 dull orange bags, 4 posh lime bags, 2 dark chartreuse bags, 4 pale tomato bags.\n" +
                "mirrored salmon bags contain 1 pale teal bag.\n" +
                "dull teal bags contain 3 shiny bronze bags, 2 drab tomato bags.\n" +
                "faded silver bags contain 2 clear bronze bags.\n" +
                "vibrant orange bags contain 4 muted salmon bags.\n" +
                "drab black bags contain 2 dull cyan bags, 2 faded violet bags, 2 clear gold bags, 3 clear bronze bags.\n" +
                "posh green bags contain 4 dotted gray bags.\n" +
                "clear orange bags contain 2 muted silver bags, 4 dark orange bags.\n" +
                "mirrored beige bags contain 4 drab crimson bags, 2 muted coral bags.\n" +
                "faded cyan bags contain 3 dim fuchsia bags, 4 clear gray bags.\n" +
                "shiny gray bags contain 3 shiny brown bags.\n" +
                "bright cyan bags contain 5 pale teal bags, 3 wavy beige bags, 2 dotted black bags.\n" +
                "dim gray bags contain 1 wavy purple bag, 4 dotted magenta bags.\n" +
                "clear cyan bags contain 3 plaid violet bags, 3 shiny aqua bags, 3 pale bronze bags, 5 dim black bags.\n" +
                "dotted tomato bags contain 2 dull yellow bags, 1 dark turquoise bag.\n" +
                "faded salmon bags contain 1 posh blue bag, 5 dotted red bags.\n" +
                "faded plum bags contain 3 wavy aqua bags, 3 dim turquoise bags, 1 drab red bag, 4 dark chartreuse bags.\n" +
                "mirrored bronze bags contain 5 shiny turquoise bags, 1 striped purple bag.\n" +
                "dull fuchsia bags contain 4 drab maroon bags, 3 shiny indigo bags, 3 faded cyan bags, 2 striped gray bags.\n" +
                "wavy salmon bags contain 3 striped indigo bags, 1 dim fuchsia bag.\n" +
                "shiny beige bags contain 4 vibrant silver bags, 4 pale crimson bags.\n" +
                "wavy silver bags contain 4 dim red bags, 5 wavy aqua bags.\n" +
                "posh maroon bags contain 1 muted lavender bag.\n" +
                "dim turquoise bags contain 2 muted silver bags.\n" +
                "dotted silver bags contain 4 striped aqua bags, 4 mirrored olive bags, 2 dim lime bags, 3 striped teal bags.\n" +
                "drab white bags contain 2 muted silver bags, 4 posh tan bags, 5 posh red bags, 2 shiny aqua bags.\n" +
                "clear coral bags contain 1 posh plum bag.\n" +
                "light silver bags contain 1 dark orange bag, 4 pale red bags, 3 shiny tan bags, 1 dim indigo bag.\n" +
                "mirrored lime bags contain 2 clear orange bags, 2 drab lavender bags.\n" +
                "clear red bags contain 3 plaid blue bags, 3 light cyan bags.\n" +
                "clear silver bags contain 2 dark white bags, 4 dim chartreuse bags, 1 posh aqua bag, 3 striped maroon bags.\n" +
                "wavy maroon bags contain 2 dotted fuchsia bags, 1 pale beige bag, 5 dull orange bags.\n" +
                "striped silver bags contain 4 muted silver bags, 2 posh tan bags, 4 drab maroon bags, 2 dull tomato bags.\n" +
                "faded black bags contain 3 wavy fuchsia bags.\n" +
                "wavy magenta bags contain 2 vibrant yellow bags, 1 dull coral bag.\n" +
                "mirrored olive bags contain 5 dark chartreuse bags, 4 shiny bronze bags, 3 faded bronze bags.\n" +
                "striped beige bags contain 1 striped brown bag, 5 faded blue bags, 1 muted olive bag.\n" +
                "wavy tan bags contain 1 striped red bag, 2 clear maroon bags.\n" +
                "shiny maroon bags contain 5 striped red bags, 1 bright bronze bag.\n" +
                "light lavender bags contain 1 dull green bag.\n" +
                "dull bronze bags contain 5 pale silver bags, 2 dull brown bags, 5 shiny cyan bags.\n" +
                "pale aqua bags contain 5 pale chartreuse bags.\n" +
                "posh crimson bags contain 1 wavy purple bag, 1 pale plum bag, 2 mirrored red bags, 3 clear tomato bags.\n" +
                "posh chartreuse bags contain 2 plaid gray bags, 3 dotted purple bags, 1 posh plum bag.\n" +
                "dark fuchsia bags contain 1 muted white bag.\n" +
                "bright gold bags contain 1 striped brown bag.\n" +
                "dark violet bags contain 5 shiny purple bags, 5 plaid black bags.\n" +
                "striped lime bags contain 2 bright brown bags, 3 dull olive bags.\n" +
                "plaid tan bags contain 4 clear aqua bags, 3 striped green bags, 3 dark chartreuse bags, 1 posh indigo bag.\n" +
                "dotted magenta bags contain 1 plaid coral bag, 3 muted coral bags.\n" +
                "faded crimson bags contain 1 mirrored yellow bag, 3 dim indigo bags, 3 bright indigo bags, 2 mirrored crimson bags.\n" +
                "bright brown bags contain 5 plaid coral bags.\n" +
                "striped turquoise bags contain 4 wavy aqua bags.\n" +
                "dark purple bags contain 2 striped red bags.\n" +
                "dull magenta bags contain 4 plaid black bags, 5 dark purple bags.\n" +
                "light bronze bags contain 2 clear aqua bags, 4 posh black bags.\n" +
                "vibrant red bags contain 3 mirrored aqua bags, 5 muted chartreuse bags.\n" +
                "dull chartreuse bags contain 5 clear lavender bags, 2 drab indigo bags, 5 light turquoise bags, 5 mirrored red bags.\n" +
                "vibrant silver bags contain 2 muted olive bags, 5 striped violet bags, 2 dim fuchsia bags, 4 light silver bags.\n" +
                "drab fuchsia bags contain 1 dark beige bag.\n" +
                "dull crimson bags contain 2 posh red bags, 1 mirrored crimson bag.\n" +
                "dotted bronze bags contain 3 dotted fuchsia bags, 4 drab maroon bags, 4 faded gold bags, 5 striped brown bags.\n" +
                "clear yellow bags contain 4 mirrored aqua bags, 3 bright cyan bags.\n" +
                "wavy blue bags contain 5 mirrored silver bags, 1 dim chartreuse bag, 1 dull tomato bag, 2 plaid white bags.\n" +
                "faded yellow bags contain 1 wavy orange bag.\n" +
                "posh violet bags contain 4 mirrored turquoise bags.\n" +
                "bright orange bags contain 5 shiny plum bags.\n" +
                "posh turquoise bags contain 3 posh gold bags.\n" +
                "dull gray bags contain 5 muted lime bags, 3 bright beige bags.\n" +
                "drab blue bags contain 3 dim blue bags, 1 clear brown bag, 5 pale teal bags, 5 dotted tomato bags.\n" +
                "shiny aqua bags contain 2 dull yellow bags, 3 faded cyan bags, 5 mirrored turquoise bags, 1 striped silver bag.\n" +
                "dark bronze bags contain 2 striped teal bags.\n" +
                "plaid tomato bags contain 1 dim turquoise bag, 2 dim crimson bags.\n" +
                "shiny tan bags contain 3 dark orange bags, 5 clear bronze bags, 4 striped gold bags, 2 clear violet bags.\n" +
                "clear gray bags contain no other bags.\n" +
                "dotted beige bags contain 5 dim white bags, 5 wavy green bags, 3 dotted tomato bags.\n" +
                "posh beige bags contain 1 striped beige bag, 2 posh blue bags, 1 muted cyan bag, 1 light silver bag.\n" +
                "vibrant purple bags contain 2 drab blue bags, 2 vibrant yellow bags, 4 faded violet bags, 1 clear lavender bag.\n" +
                "wavy brown bags contain 3 clear violet bags.\n" +
                "wavy yellow bags contain 1 vibrant fuchsia bag, 5 dark turquoise bags.\n" +
                "dim white bags contain 2 pale cyan bags, 3 clear brown bags.\n" +
                "bright turquoise bags contain 5 pale salmon bags.\n" +
                "dim aqua bags contain 3 pale turquoise bags.\n" +
                "pale chartreuse bags contain 5 striped bronze bags, 2 drab beige bags, 1 dull black bag, 3 wavy teal bags.\n" +
                "dull orange bags contain 3 pale beige bags.\n" +
                "dark indigo bags contain 5 dim bronze bags, 5 drab teal bags, 5 dark silver bags, 3 striped indigo bags.\n" +
                "muted yellow bags contain 1 plaid red bag, 4 dotted black bags, 4 dark fuchsia bags, 2 faded crimson bags.\n" +
                "plaid red bags contain 1 dark orange bag, 4 dull olive bags, 1 clear gold bag.\n" +
                "light tomato bags contain 1 dotted magenta bag, 5 posh fuchsia bags.\n" +
                "clear bronze bags contain no other bags.\n" +
                "muted coral bags contain 4 plaid violet bags, 2 mirrored purple bags, 5 drab maroon bags, 4 clear gray bags.\n" +
                "dim indigo bags contain 5 faded violet bags.\n" +
                "dark plum bags contain 5 plaid black bags.\n" +
                "light salmon bags contain 3 plaid aqua bags, 3 bright brown bags, 2 striped purple bags.\n" +
                "muted magenta bags contain 3 mirrored turquoise bags, 1 bright coral bag, 5 faded fuchsia bags.\n" +
                "pale turquoise bags contain 4 drab blue bags, 2 dotted purple bags.\n" +
                "wavy chartreuse bags contain 5 dim blue bags.\n" +
                "dull cyan bags contain 4 plaid coral bags, 4 mirrored purple bags, 4 pale fuchsia bags.\n" +
                "plaid cyan bags contain 5 faded beige bags.\n" +
                "dotted plum bags contain 5 faded violet bags, 4 wavy purple bags, 1 shiny lavender bag, 2 pale magenta bags.\n" +
                "faded tomato bags contain 2 light red bags.\n" +
                "plaid silver bags contain 3 light blue bags, 1 posh beige bag.\n" +
                "mirrored green bags contain 1 plaid purple bag, 2 light beige bags, 4 dotted tomato bags.\n" +
                "wavy lime bags contain 5 dotted salmon bags, 2 striped cyan bags, 2 pale white bags.\n" +
                "drab turquoise bags contain 5 shiny chartreuse bags, 2 wavy violet bags, 3 dotted yellow bags, 2 shiny cyan bags.\n" +
                "striped crimson bags contain 2 dark coral bags, 2 clear chartreuse bags, 3 dim magenta bags, 2 plaid fuchsia bags.\n" +
                "shiny green bags contain 3 plaid coral bags, 2 striped aqua bags.\n" +
                "faded teal bags contain 1 light maroon bag, 2 muted plum bags.\n" +
                "light violet bags contain 5 wavy tomato bags, 3 dark green bags, 2 vibrant plum bags.\n" +
                "pale red bags contain 1 plaid white bag, 3 clear bronze bags, 5 clear violet bags.\n" +
                "muted indigo bags contain 2 dotted red bags, 1 dotted tomato bag, 4 mirrored tomato bags, 1 mirrored white bag.\n" +
                "muted fuchsia bags contain 4 mirrored lime bags, 2 dotted teal bags.\n" +
                "shiny gold bags contain 3 striped gold bags, 2 faded violet bags, 3 shiny tan bags, 3 dark turquoise bags.\n" +
                "dark green bags contain 5 drab maroon bags, 2 wavy violet bags.\n" +
                "vibrant gold bags contain 5 dark beige bags, 3 dotted black bags, 5 posh aqua bags.\n" +
                "mirrored cyan bags contain 4 muted chartreuse bags.\n" +
                "drab violet bags contain 4 dull tomato bags, 4 wavy crimson bags, 3 posh crimson bags, 3 mirrored silver bags.\n" +
                "dark crimson bags contain 3 striped cyan bags, 4 vibrant cyan bags.\n" +
                "mirrored tomato bags contain 5 dotted green bags.\n" +
                "dotted brown bags contain 1 pale coral bag, 3 pale plum bags, 1 striped red bag, 2 clear brown bags.\n" +
                "muted black bags contain 2 clear black bags, 1 dark turquoise bag.\n" +
                "faded brown bags contain 5 shiny bronze bags, 2 shiny plum bags, 4 dotted olive bags.\n" +
                "bright silver bags contain 2 light tan bags, 5 posh teal bags.\n" +
                "vibrant fuchsia bags contain 3 wavy beige bags, 2 vibrant violet bags.\n" +
                "light tan bags contain 2 mirrored purple bags, 5 muted orange bags, 4 dark turquoise bags.\n" +
                "vibrant tomato bags contain 4 light brown bags.\n" +
                "light yellow bags contain 4 striped silver bags, 5 clear gray bags.\n" +
                "shiny plum bags contain 3 dotted purple bags, 2 dim tan bags, 1 drab white bag, 4 mirrored salmon bags.\n" +
                "vibrant chartreuse bags contain 1 muted cyan bag, 3 striped tan bags, 4 dotted lavender bags, 5 drab red bags.\n" +
                "mirrored turquoise bags contain 2 dull yellow bags, 3 mirrored purple bags.\n" +
                "shiny salmon bags contain 2 pale bronze bags, 3 vibrant tomato bags, 4 mirrored silver bags, 5 pale cyan bags.\n" +
                "vibrant lime bags contain 1 dim gold bag, 2 shiny indigo bags.\n" +
                "plaid plum bags contain 3 drab crimson bags.\n" +
                "wavy purple bags contain 1 muted beige bag, 5 dark violet bags.\n" +
                "striped lavender bags contain 1 vibrant maroon bag.\n" +
                "faded purple bags contain 2 clear violet bags, 4 dim lime bags.\n" +
                "posh tan bags contain 5 dull tomato bags, 1 plaid white bag, 2 clear bronze bags.\n" +
                "bright green bags contain 3 pale red bags, 1 vibrant chartreuse bag.\n" +
                "bright yellow bags contain 5 posh lime bags, 1 plaid gray bag, 4 clear tan bags, 1 light yellow bag.\n" +
                "plaid yellow bags contain 5 mirrored aqua bags.\n" +
                "plaid indigo bags contain 2 plaid white bags, 3 muted black bags, 4 dark chartreuse bags, 4 plaid aqua bags.\n" +
                "faded violet bags contain 1 plaid violet bag, 3 striped gold bags, 2 clear violet bags, 2 pale red bags.\n" +
                "faded fuchsia bags contain 1 striped lime bag, 2 dark blue bags.\n" +
                "dim lavender bags contain 5 mirrored fuchsia bags.\n" +
                "clear turquoise bags contain 5 pale maroon bags, 1 shiny brown bag, 2 muted blue bags.\n" +
                "wavy bronze bags contain 5 posh lavender bags, 3 dull orange bags, 1 pale crimson bag, 4 drab tomato bags.\n" +
                "bright tan bags contain 1 dull cyan bag, 5 mirrored white bags, 4 clear salmon bags.\n" +
                "posh teal bags contain 2 faded olive bags.\n" +
                "wavy olive bags contain 4 shiny violet bags, 5 faded tomato bags.\n" +
                "bright blue bags contain 5 dull lime bags, 4 light tomato bags, 5 dim fuchsia bags.\n" +
                "pale maroon bags contain 1 dull silver bag, 1 wavy blue bag, 1 pale magenta bag.\n" +
                "dull lavender bags contain 2 drab gray bags, 1 muted brown bag, 2 dark lavender bags, 3 bright magenta bags.\n" +
                "wavy white bags contain 1 plaid red bag.\n" +
                "shiny orange bags contain 1 vibrant beige bag, 1 muted orange bag, 3 striped yellow bags.\n" +
                "mirrored fuchsia bags contain 2 wavy indigo bags.\n" +
                "striped fuchsia bags contain 3 wavy fuchsia bags.\n" +
                "posh aqua bags contain 5 clear bronze bags, 1 pale crimson bag, 1 vibrant silver bag, 5 pale fuchsia bags.\n" +
                "clear salmon bags contain 1 plaid beige bag, 3 vibrant plum bags, 2 striped silver bags, 2 faded beige bags.\n" +
                "striped orange bags contain 1 muted white bag.\n" +
                "drab tan bags contain 3 striped red bags, 3 light beige bags.\n" +
                "mirrored gold bags contain 1 faded violet bag, 4 mirrored turquoise bags.\n" +
                "muted olive bags contain 4 light yellow bags, 3 light turquoise bags, 5 clear violet bags, 2 vibrant indigo bags.\n" +
                "pale violet bags contain 3 posh turquoise bags.\n" +
                "pale tomato bags contain 3 clear orange bags, 3 bright cyan bags, 5 faded gold bags.\n" +
                "striped red bags contain 5 dotted chartreuse bags, 3 wavy tomato bags, 3 dull gold bags, 1 wavy beige bag.\n" +
                "dull plum bags contain 3 posh bronze bags, 2 dim maroon bags, 3 bright black bags.\n" +
                "light purple bags contain 1 muted orange bag.\n" +
                "bright gray bags contain 3 vibrant olive bags, 4 clear turquoise bags.\n" +
                "pale crimson bags contain 4 muted salmon bags, 5 bright brown bags, 1 pale beige bag.\n" +
                "pale lime bags contain 5 pale cyan bags.\n" +
                "drab red bags contain 1 muted olive bag.\n" +
                "pale salmon bags contain 3 faded chartreuse bags.\n" +
                "faded magenta bags contain 4 posh black bags, 4 drab aqua bags.\n" +
                "dotted yellow bags contain 1 plaid black bag.\n" +
                "dim coral bags contain 1 mirrored silver bag.\n" +
                "wavy plum bags contain 2 mirrored turquoise bags.\n" +
                "muted red bags contain 4 shiny bronze bags.\n" +
                "dull yellow bags contain no other bags.\n" +
                "dotted maroon bags contain 1 dull yellow bag, 5 bright gray bags, 3 shiny violet bags, 1 faded gray bag.\n" +
                "dark silver bags contain 2 clear gray bags, 2 drab white bags, 2 dark turquoise bags, 3 pale indigo bags.\n" +
                "dull olive bags contain 1 dull white bag, 5 light turquoise bags.\n" +
                "dim lime bags contain 1 dull tomato bag, 1 striped gold bag, 1 plaid violet bag.\n" +
                "posh lime bags contain 2 dark beige bags, 3 dim coral bags, 1 wavy blue bag, 5 clear tomato bags.\n" +
                "dark beige bags contain 1 plaid coral bag, 4 drab bronze bags, 1 vibrant cyan bag.\n" +
                "dark yellow bags contain 1 faded olive bag, 3 shiny lavender bags, 2 plaid silver bags, 2 pale red bags.\n" +
                "bright bronze bags contain 5 posh crimson bags.\n" +
                "shiny lime bags contain 3 vibrant olive bags, 5 clear gold bags, 5 striped indigo bags.\n" +
                "dotted green bags contain 1 vibrant silver bag, 3 dotted blue bags, 5 clear brown bags.\n" +
                "mirrored black bags contain 1 pale crimson bag, 1 dark lavender bag, 4 dark gray bags, 1 light orange bag.\n" +
                "plaid blue bags contain 5 clear bronze bags, 3 clear gray bags.\n" +
                "pale indigo bags contain 1 muted olive bag, 4 shiny gold bags.\n" +
                "plaid salmon bags contain 3 posh red bags, 3 vibrant blue bags, 3 plaid gold bags, 2 dull brown bags.\n" +
                "drab green bags contain 5 mirrored purple bags, 4 dull maroon bags, 1 posh beige bag, 2 mirrored red bags.\n" +
                "pale gray bags contain 4 dark indigo bags.\n" +
                "posh fuchsia bags contain 1 shiny tan bag, 3 clear tomato bags.\n" +
                "dim maroon bags contain 2 drab crimson bags.\n" +
                "plaid crimson bags contain 1 dotted white bag, 4 faded chartreuse bags, 4 dim maroon bags.\n" +
                "dark white bags contain 5 mirrored aqua bags, 4 wavy orange bags, 3 clear lavender bags.\n" +
                "posh plum bags contain 5 bright lime bags.\n" +
                "pale tan bags contain 3 plaid orange bags, 5 muted cyan bags.\n" +
                "light indigo bags contain 4 clear blue bags, 1 wavy salmon bag.\n" +
                "dark magenta bags contain 1 muted maroon bag, 5 plaid violet bags.\n" +
                "posh indigo bags contain 1 posh teal bag.\n" +
                "striped white bags contain 4 posh teal bags.\n" +
                "dull white bags contain 1 plaid violet bag, 1 drab plum bag.\n" +
                "faded green bags contain 3 shiny chartreuse bags, 5 pale turquoise bags, 1 plaid gray bag, 1 dotted black bag.\n" +
                "faded chartreuse bags contain 1 striped silver bag, 5 drab white bags, 4 dotted green bags.\n" +
                "vibrant beige bags contain 2 dull turquoise bags.\n" +
                "faded tan bags contain 5 posh indigo bags.\n" +
                "dark orange bags contain no other bags.\n" +
                "striped coral bags contain 4 dark crimson bags, 5 vibrant crimson bags, 2 shiny aqua bags, 5 wavy coral bags.\n" +
                "dim plum bags contain 3 faded blue bags, 5 faded gold bags.\n" +
                "dim red bags contain 2 dotted olive bags, 5 light silver bags, 5 mirrored crimson bags.\n" +
                "pale teal bags contain 2 pale magenta bags, 1 drab olive bag.\n" +
                "dull turquoise bags contain 5 drab purple bags, 4 pale tomato bags.\n" +
                "dark red bags contain 4 light yellow bags, 2 dotted tomato bags, 3 dotted coral bags, 5 faded olive bags.\n" +
                "mirrored magenta bags contain 1 shiny lavender bag, 4 shiny red bags, 5 dotted beige bags.\n" +
                "dim black bags contain 3 dull salmon bags, 1 wavy purple bag.\n" +
                "mirrored blue bags contain 2 vibrant green bags, 1 dull teal bag, 2 shiny turquoise bags.\n" +
                "dotted turquoise bags contain 3 clear lavender bags.\n" +
                "shiny fuchsia bags contain 1 clear beige bag, 3 dotted olive bags, 4 vibrant white bags, 1 bright tomato bag.\n" +
                "drab bronze bags contain 4 clear teal bags, 1 muted silver bag.\n" +
                "shiny yellow bags contain 1 pale yellow bag.\n" +
                "dim bronze bags contain 1 pale silver bag, 4 dull tan bags, 3 striped silver bags, 4 pale brown bags.\n" +
                "shiny magenta bags contain 4 wavy olive bags, 3 shiny gray bags, 2 drab magenta bags, 2 posh indigo bags.\n" +
                "shiny white bags contain 4 shiny salmon bags, 3 mirrored bronze bags.\n" +
                "muted tan bags contain 4 dull fuchsia bags.\n" +
                "dull black bags contain 2 mirrored purple bags.\n" +
                "dark black bags contain 5 light blue bags, 3 vibrant silver bags.\n" +
                "plaid gray bags contain 2 wavy blue bags, 5 dim turquoise bags, 5 mirrored salmon bags, 3 pale gold bags.\n" +
                "dull coral bags contain 5 drab cyan bags, 1 shiny aqua bag, 4 vibrant gray bags, 4 mirrored turquoise bags.\n" +
                "plaid coral bags contain 5 muted silver bags, 5 vibrant indigo bags, 2 dark orange bags, 3 mirrored purple bags.\n" +
                "shiny indigo bags contain 2 dotted gray bags, 4 muted olive bags, 4 dull tomato bags, 2 light silver bags.\n" +
                "bright fuchsia bags contain 4 vibrant brown bags, 3 faded coral bags.\n" +
                "wavy turquoise bags contain 3 drab chartreuse bags, 2 bright coral bags, 3 dark silver bags.\n" +
                "light magenta bags contain 4 bright olive bags, 3 dotted turquoise bags, 4 dim lime bags.\n" +
                "dark teal bags contain 2 dark blue bags, 1 light tan bag.\n" +
                "faded blue bags contain 1 posh red bag.\n" +
                "bright black bags contain 5 dotted gray bags, 2 pale magenta bags.\n" +
                "pale green bags contain 3 bright crimson bags.\n" +
                "striped indigo bags contain 3 bright indigo bags, 3 dotted blue bags.\n" +
                "light beige bags contain 4 dotted magenta bags.\n" +
                "pale cyan bags contain 1 light turquoise bag.\n" +
                "muted crimson bags contain 2 clear lavender bags, 2 pale blue bags, 3 light red bags.\n" +
                "pale coral bags contain 5 vibrant maroon bags, 4 drab teal bags, 2 dim fuchsia bags.\n" +
                "dull brown bags contain 3 pale magenta bags, 2 bright lime bags, 3 striped cyan bags.\n" +
                "drab olive bags contain 1 drab maroon bag, 3 light turquoise bags.\n" +
                "plaid white bags contain no other bags.\n" +
                "bright aqua bags contain 1 dull coral bag, 2 dotted chartreuse bags, 2 faded bronze bags.\n" +
                "clear green bags contain 1 plaid salmon bag, 2 wavy violet bags, 5 posh beige bags.\n" +
                "clear chartreuse bags contain 3 mirrored white bags, 1 dotted blue bag, 3 dull brown bags, 5 drab beige bags.\n" +
                "bright plum bags contain 2 pale chartreuse bags, 4 muted maroon bags, 2 dark salmon bags.\n" +
                "light olive bags contain 3 wavy cyan bags, 1 dark teal bag, 2 drab fuchsia bags.\n" +
                "clear teal bags contain 2 mirrored turquoise bags.\n" +
                "muted green bags contain 2 mirrored purple bags, 5 wavy turquoise bags.\n" +
                "drab coral bags contain 3 dim bronze bags, 1 posh indigo bag, 2 shiny green bags, 4 mirrored olive bags.\n" +
                "clear beige bags contain 1 drab magenta bag.\n" +
                "drab teal bags contain 1 bright brown bag.\n" +
                "dark gold bags contain 4 dark crimson bags.\n" +
                "striped maroon bags contain 2 striped silver bags, 2 posh lavender bags.\n" +
                "light fuchsia bags contain 5 drab violet bags, 5 bright black bags, 5 plaid tan bags.\n" +
                "pale beige bags contain 1 posh maroon bag, 3 striped aqua bags, 4 mirrored purple bags, 1 shiny gold bag.\n" +
                "plaid teal bags contain 2 posh brown bags, 4 pale tomato bags, 4 shiny indigo bags.\n" +
                "shiny chartreuse bags contain 4 muted gray bags, 3 pale indigo bags.\n" +
                "plaid olive bags contain 1 dull gold bag, 4 clear cyan bags.\n" +
                "dim magenta bags contain 5 vibrant yellow bags.\n" +
                "posh orange bags contain 2 dull lime bags, 5 posh maroon bags, 3 posh chartreuse bags, 5 wavy olive bags.\n" +
                "dotted coral bags contain 1 muted cyan bag.\n" +
                "bright indigo bags contain 5 muted coral bags, 5 drab olive bags, 1 dark orange bag, 2 striped gold bags.\n" +
                "drab lime bags contain 4 light turquoise bags, 4 vibrant indigo bags, 4 pale fuchsia bags.\n" +
                "mirrored gray bags contain 4 plaid black bags, 3 striped blue bags, 1 dark orange bag.\n" +
                "dark tomato bags contain 1 faded white bag, 4 light purple bags, 5 dark fuchsia bags, 2 dotted salmon bags.\n" +
                "striped olive bags contain 3 pale red bags, 1 dull yellow bag.\n" +
                "posh bronze bags contain 3 light plum bags, 4 dim beige bags, 3 striped gray bags.\n" +
                "striped tan bags contain 5 plaid white bags, 1 mirrored coral bag, 4 dull brown bags, 3 dull silver bags.\n" +
                "muted white bags contain 4 pale yellow bags.\n" +
                "plaid black bags contain 3 drab white bags, 1 pale red bag, 3 clear gray bags.\n" +
                "muted maroon bags contain 4 clear aqua bags.\n" +
                "pale lavender bags contain 3 faded indigo bags.\n" +
                "dull lime bags contain 2 faded red bags, 2 dull bronze bags, 2 muted turquoise bags, 5 posh gold bags.\n" +
                "dim salmon bags contain 3 wavy brown bags, 4 vibrant olive bags, 4 faded violet bags.\n" +
                "light cyan bags contain 4 shiny plum bags, 5 mirrored fuchsia bags.\n" +
                "vibrant tan bags contain 3 dim cyan bags, 4 pale gray bags, 4 wavy plum bags.\n" +
                "bright salmon bags contain 2 drab teal bags, 2 dotted fuchsia bags, 2 dull brown bags.\n" +
                "vibrant salmon bags contain 3 faded purple bags, 4 shiny indigo bags.\n" +
                "light gray bags contain 5 dim teal bags, 4 striped maroon bags.\n" +
                "striped brown bags contain 2 bright indigo bags, 1 wavy plum bag, 1 striped violet bag, 2 dim indigo bags.\n" +
                "clear lime bags contain 4 muted olive bags, 5 shiny crimson bags, 2 drab salmon bags, 5 dull black bags.\n" +
                "dotted purple bags contain 4 clear orange bags, 4 striped gold bags, 5 drab maroon bags.\n" +
                "shiny purple bags contain 4 plaid brown bags.\n" +
                "pale white bags contain 3 shiny tan bags, 2 striped beige bags, 1 mirrored coral bag.\n" +
                "mirrored purple bags contain no other bags.\n" +
                "dull salmon bags contain 1 striped blue bag, 3 shiny purple bags, 2 plaid red bags, 2 dim fuchsia bags.\n" +
                "dark chartreuse bags contain 4 muted chartreuse bags, 4 vibrant white bags, 4 dotted blue bags, 2 clear gray bags.\n" +
                "light coral bags contain 1 faded tomato bag.\n" +
                "wavy violet bags contain 5 clear orange bags, 4 mirrored turquoise bags, 1 striped brown bag.\n" +
                "dark coral bags contain 2 clear lavender bags, 3 clear gold bags, 4 dotted olive bags.\n" +
                "bright red bags contain 2 faded crimson bags, 5 wavy tomato bags, 3 posh brown bags.\n" +
                "muted bronze bags contain 3 mirrored gold bags.\n" +
                "mirrored maroon bags contain 2 wavy tomato bags, 2 mirrored indigo bags, 3 striped violet bags.\n" +
                "drab yellow bags contain 4 light fuchsia bags, 4 dull yellow bags, 3 dull olive bags, 5 striped red bags.\n" +
                "light plum bags contain 3 mirrored silver bags, 5 drab olive bags.\n" +
                "striped green bags contain 1 plaid brown bag, 2 dark black bags, 1 drab beige bag.\n" +
                "plaid violet bags contain no other bags.\n" +
                "clear blue bags contain 1 pale gold bag, 5 dim aqua bags.\n" +
                "posh white bags contain 4 striped tan bags, 3 posh tomato bags.\n" +
                "plaid lime bags contain 2 muted black bags, 2 bright bronze bags, 3 light chartreuse bags, 2 dull orange bags.\n" +
                "vibrant yellow bags contain 3 faded green bags, 2 clear black bags.\n" +
                "light orange bags contain 5 light yellow bags, 3 faded red bags, 2 striped maroon bags, 3 muted teal bags.\n" +
                "wavy teal bags contain 2 pale teal bags.\n" +
                "drab crimson bags contain 3 muted lime bags, 2 shiny lavender bags.\n" +
                "shiny cyan bags contain 3 bright cyan bags, 4 shiny tomato bags, 5 bright silver bags, 1 mirrored silver bag.\n" +
                "mirrored yellow bags contain 2 shiny beige bags, 3 dark green bags.\n" +
                "drab silver bags contain 1 dim coral bag, 5 faded aqua bags, 3 plaid salmon bags.\n" +
                "faded indigo bags contain 5 dotted purple bags, 5 dotted coral bags, 1 plaid coral bag, 3 bright cyan bags.\n" +
                "wavy red bags contain 4 mirrored black bags, 2 wavy lime bags, 5 vibrant red bags.\n" +
                "dim gold bags contain 2 bright coral bags, 3 pale yellow bags, 1 pale silver bag.\n" +
                "dim fuchsia bags contain 4 plaid white bags, 1 light turquoise bag, 5 faded violet bags, 5 mirrored purple bags.\n" +
                "dark gray bags contain 3 bright brown bags, 4 pale red bags.\n" +
                "muted tomato bags contain 3 drab plum bags, 5 bright lime bags.\n" +
                "dim green bags contain 4 shiny brown bags.\n" +
                "shiny black bags contain 2 clear plum bags, 4 light olive bags.\n" +
                "light green bags contain 3 light silver bags, 1 muted gray bag.\n" +
                "mirrored indigo bags contain 3 bright salmon bags, 2 dim gold bags, 4 bright tomato bags.\n" +
                "striped magenta bags contain 4 clear tan bags, 1 posh chartreuse bag, 3 dim lime bags, 3 wavy green bags.\n" +
                "wavy coral bags contain 1 dull yellow bag.\n" +
                "faded beige bags contain 5 shiny gray bags.\n" +
                "dim olive bags contain 4 dim plum bags, 5 dull yellow bags, 5 dark lavender bags.\n" +
                "light chartreuse bags contain 2 shiny tan bags.\n" +
                "clear purple bags contain 5 vibrant indigo bags, 1 bright coral bag, 5 dotted yellow bags, 1 drab maroon bag.\n" +
                "wavy cyan bags contain 4 clear black bags.\n" +
                "muted chartreuse bags contain 4 clear tomato bags, 2 pale red bags, 2 striped violet bags.\n" +
                "posh blue bags contain 5 wavy violet bags, 3 shiny green bags, 5 muted gray bags.\n" +
                "dim purple bags contain 3 light plum bags, 5 posh lime bags, 2 mirrored gray bags.\n" +
                "faded lavender bags contain 5 pale maroon bags, 5 light orange bags, 1 clear maroon bag, 1 dotted violet bag.\n" +
                "pale magenta bags contain 4 vibrant cyan bags, 2 wavy plum bags.\n" +
                "posh red bags contain no other bags.\n" +
                "pale silver bags contain 2 vibrant cyan bags, 2 dim blue bags, 3 pale plum bags.\n" +
                "dull beige bags contain 2 pale tan bags.\n" +
                "clear tomato bags contain 3 drab tomato bags, 1 pale white bag, 1 shiny aqua bag.\n" +
                "light white bags contain 5 dark gray bags, 1 mirrored black bag, 3 dotted gold bags, 1 pale red bag.\n" +
                "wavy gray bags contain 1 bright magenta bag, 3 pale maroon bags.\n" +
                "wavy tomato bags contain 1 dull silver bag, 1 pale white bag.\n" +
                "plaid orange bags contain 1 pale fuchsia bag, 1 dark green bag.\n" +
                "light brown bags contain 4 striped cyan bags, 4 pale yellow bags, 5 dull teal bags, 4 bright indigo bags.\n" +
                "posh lavender bags contain 1 dull maroon bag, 5 vibrant indigo bags, 2 dull tomato bags.\n" +
                "pale orange bags contain 3 plaid violet bags.\n" +
                "mirrored crimson bags contain 2 dark orange bags, 3 drab maroon bags.\n" +
                "faded bronze bags contain 3 dark crimson bags, 5 muted beige bags, 4 muted coral bags, 3 mirrored crimson bags.\n" +
                "pale brown bags contain 5 mirrored turquoise bags, 5 dull yellow bags.\n" +
                "plaid maroon bags contain 1 dim lime bag.\n" +
                "dim tan bags contain 5 posh maroon bags, 1 vibrant indigo bag, 4 mirrored silver bags.\n" +
                "muted gray bags contain 5 shiny aqua bags, 5 bright indigo bags, 5 dotted tomato bags, 4 mirrored silver bags.\n" +
                "bright chartreuse bags contain 1 mirrored turquoise bag.\n" +
                "muted silver bags contain 3 mirrored turquoise bags, 4 dotted black bags, 5 clear bronze bags, 5 dark orange bags.\n" +
                "vibrant brown bags contain 2 pale silver bags, 1 striped beige bag, 2 vibrant olive bags.\n" +
                "dim orange bags contain 3 vibrant gold bags.\n" +
                "mirrored aqua bags contain 5 dull tomato bags, 1 faded olive bag, 2 posh red bags, 1 muted olive bag.\n" +
                "plaid turquoise bags contain 2 dull teal bags, 2 drab maroon bags, 3 light tomato bags.\n" +
                "muted aqua bags contain 4 bright yellow bags, 5 dotted coral bags, 1 mirrored plum bag.\n" +
                "mirrored silver bags contain 2 vibrant cyan bags, 2 striped silver bags, 3 shiny gold bags.\n" +
                "muted salmon bags contain 1 clear orange bag, 1 muted coral bag, 4 clear bronze bags, 3 striped silver bags.\n" +
                "vibrant aqua bags contain 3 dotted purple bags, 1 striped teal bag.\n" +
                "clear lavender bags contain 1 pale magenta bag, 2 mirrored silver bags, 2 dull tomato bags, 2 clear violet bags.\n" +
                "shiny coral bags contain 4 muted lavender bags, 4 clear gray bags.\n" +
                "shiny blue bags contain 4 vibrant black bags, 3 dark red bags, 2 shiny bronze bags, 2 wavy turquoise bags.\n" +
                "vibrant gray bags contain 3 dotted red bags, 2 posh lavender bags, 4 striped gray bags, 1 shiny brown bag.\n" +
                "clear crimson bags contain 5 faded red bags.\n" +
                "muted turquoise bags contain 3 dark aqua bags, 1 faded bronze bag, 4 pale crimson bags, 5 faded violet bags.\n" +
                "muted brown bags contain 2 muted cyan bags, 5 striped gray bags, 1 vibrant lime bag.\n" +
                "mirrored teal bags contain 3 muted orange bags.\n" +
                "shiny crimson bags contain 2 wavy bronze bags, 1 wavy violet bag, 2 dark lavender bags, 2 drab bronze bags.\n" +
                "dull green bags contain 1 posh red bag, 2 dotted indigo bags.\n" +
                "clear tan bags contain 2 plaid gray bags.\n" +
                "shiny red bags contain 2 drab salmon bags, 4 dotted beige bags, 2 dull silver bags.\n" +
                "pale plum bags contain 5 mirrored turquoise bags.\n" +
                "shiny silver bags contain 3 vibrant yellow bags, 5 dotted indigo bags, 3 dotted chartreuse bags.\n" +
                "plaid lavender bags contain 4 dark plum bags, 2 mirrored bronze bags, 5 posh yellow bags, 3 dull bronze bags.\n" +
                "drab chartreuse bags contain 3 dull yellow bags, 5 clear tomato bags, 4 plaid violet bags, 2 dull maroon bags.\n" +
                "faded gold bags contain 5 dim fuchsia bags, 4 clear orange bags, 5 light green bags, 2 wavy blue bags.\n" +
                "plaid magenta bags contain 4 bright silver bags.\n" +
                "bright purple bags contain 4 muted orange bags.\n" +
                "clear indigo bags contain 5 dim turquoise bags.\n" +
                "drab plum bags contain 1 drab beige bag.\n" +
                "striped bronze bags contain 2 dim blue bags, 3 muted tomato bags.\n" +
                "plaid aqua bags contain 1 bright brown bag.\n" +
                "striped chartreuse bags contain 2 shiny green bags.\n" +
                "mirrored lavender bags contain 4 dull lime bags.\n" +
                "muted cyan bags contain 5 clear orange bags.\n" +
                "dotted cyan bags contain 3 posh fuchsia bags, 3 plaid coral bags.\n" +
                "vibrant blue bags contain 5 dotted beige bags, 3 mirrored red bags.\n" +
                "dim yellow bags contain 5 dim beige bags, 1 vibrant white bag, 1 striped violet bag, 4 muted chartreuse bags.\n" +
                "striped cyan bags contain 2 drab bronze bags, 5 striped silver bags.\n" +
                "posh gold bags contain 3 dim turquoise bags, 4 shiny bronze bags, 1 dark chartreuse bag.\n" +
                "bright tomato bags contain 1 pale maroon bag, 5 dull turquoise bags, 3 wavy plum bags.\n" +
                "bright magenta bags contain 1 vibrant aqua bag, 5 dull olive bags, 1 shiny crimson bag.\n" +
                "vibrant cyan bags contain 5 muted silver bags, 2 dull tomato bags, 1 clear gray bag, 1 drab maroon bag.\n" +
                "plaid brown bags contain 5 clear violet bags, 1 dark black bag.\n" +
                "drab maroon bags contain 2 plaid violet bags, 5 plaid white bags, 1 dark orange bag, 2 striped gold bags.\n" +
                "plaid green bags contain 2 pale tomato bags, 4 mirrored gold bags, 3 mirrored brown bags.\n" +
                "vibrant teal bags contain 5 light salmon bags, 5 dim salmon bags.\n" +
                "bright maroon bags contain 5 dull crimson bags.\n" +
                "faded aqua bags contain 5 muted olive bags.\n" +
                "faded lime bags contain 4 dark indigo bags, 2 pale plum bags, 4 dim tomato bags.\n" +
                "dim teal bags contain 2 bright olive bags, 2 clear violet bags, 4 shiny aqua bags.\n" +
                "dull tomato bags contain 2 dotted black bags, 3 mirrored turquoise bags, 1 striped gold bag, 2 clear bronze bags.\n" +
                "muted violet bags contain 3 dull yellow bags.\n" +
                "dotted white bags contain 2 posh purple bags, 1 muted chartreuse bag, 1 drab violet bag, 1 wavy blue bag.\n" +
                "dark salmon bags contain 3 faded cyan bags.\n" +
                "faded gray bags contain 4 shiny turquoise bags, 3 posh lime bags.\n" +
                "clear magenta bags contain 2 drab indigo bags, 4 pale crimson bags, 5 light turquoise bags.\n" +
                "dull tan bags contain 4 bright silver bags, 3 clear gray bags, 3 dark plum bags, 2 plaid blue bags.\n" +
                "drab aqua bags contain 2 drab plum bags, 1 dull turquoise bag, 4 faded cyan bags.\n" +
                "faded orange bags contain 4 dim cyan bags.\n" +
                "posh black bags contain 1 clear gray bag, 1 striped brown bag, 4 mirrored bronze bags.\n" +
                "light aqua bags contain 3 mirrored aqua bags, 2 clear lavender bags.\n" +
                "clear white bags contain 5 drab maroon bags, 5 posh bronze bags, 3 posh gold bags, 5 dark white bags.\n" +
                "pale fuchsia bags contain 3 clear gray bags, 2 clear violet bags, 5 striped gold bags.\n" +
                "muted plum bags contain 5 vibrant crimson bags.\n" +
                "striped blue bags contain 4 mirrored red bags, 4 shiny silver bags, 3 pale turquoise bags, 3 plaid violet bags.\n" +
                "vibrant violet bags contain 1 bright coral bag.\n" +
                "dim violet bags contain 4 pale teal bags, 1 faded orange bag, 4 vibrant gray bags, 4 dotted salmon bags.\n" +
                "dotted olive bags contain 4 mirrored salmon bags.\n" +
                "striped gold bags contain 2 clear gray bags, 2 dull yellow bags, 1 dotted black bag, 4 posh red bags.\n" +
                "wavy gold bags contain 3 bright yellow bags, 3 shiny beige bags.\n" +
                "shiny tomato bags contain 1 dark turquoise bag, 4 vibrant cyan bags, 4 dotted olive bags, 2 wavy plum bags.\n" +
                "wavy black bags contain 4 dotted indigo bags, 1 light tan bag, 5 bright cyan bags.\n").split("\n");


        Map<String,List<String>> bags = new HashMap<>();
        int numberOfBagColors=0;

        for(int i=0;i<inputLines.length;i++)
        {
            String currentLine = inputLines[i];
            String currentBagColor = currentLine.substring(0,currentLine.indexOf("contain")-1);
            List<String> currentBagContentsList = Arrays.asList(currentLine.substring(currentLine.indexOf("contain")+9,currentLine.indexOf(".")).split(", "));
            bags.put(currentBagColor,currentBagContentsList);
        }

        for (Map.Entry<String,List<String>> bag : bags.entrySet())
        {
            if(bagContainsItem(bags, bag.getKey()," shiny gold "))
                numberOfBagColors++;
        }

        System.out.println(numberOfBagColors);
    }
    public static boolean bagContainsItem(Map<String,List<String>> bags,String currentBag, String searchedItem)
    {
        List<String> currentBagContentsList = bags.get(currentBag);

        boolean currentBagContentsContainsItem = false;
        for (int z = 0; z < currentBagContentsList.size(); z++) {
            if(currentBagContentsList.get(z).contains(searchedItem))
                currentBagContentsContainsItem =  true;
        }
        if(currentBagContentsContainsItem)
            return true;
        else
        {
            for(int i=0;i<currentBagContentsList.size();i++)
            {
                String item = currentBagContentsList.get(i);
                item = item.replaceAll("\\d","").substring(1);

                if(item.endsWith("bag"))
                    item = item.replaceAll("bag","bags");

                if(bags.containsKey(item))
                    if(bagContainsItem(bags,item,searchedItem))
                        return true;
            }
        }

        return false;
    }
}
