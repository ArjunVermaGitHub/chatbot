package com.example.myapplication;                      //Things that need to get done: fix atop for most test cases: work on plurals


import com.rivescript.*;
import com.rivescript.lang.*;
import com.rivescript.lang.javascript.JavaScriptHandler;
import com.rivescript.macro.*;
import javax.script.*;
import com.rivescript.macro.Subroutine;
import com.rivescript.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.*;
import java.util.StringTokenizer;

public class NewClass {
     public static void main(String[] args){
   
    RiveScript bot;
    String d;
    String subordinatingConjunctionsString, nounsString, interjectionsString, prepositionsString, verbsString, pronounsString, adjectivesString, adverbsString, uncountablesString, consSoundString;
    {
       subordinatingConjunctionsString="after\n" +
"although\n" +
"as\n" +
"as if\n" +
"as long as\n" +
"as much as\n" +
"as soon as\n" +
"as though\n" +
"because\n" +
"before\n" +
"even\n" +
"even if\n" +
"even though\n" +
"if\n" +
"if only\n" +
"if when\n" +
"if then\n" +
"inasmuch\n" +
"in order that\n" +
"just as\n" +
"lest\n" +
"now\n" +
"now since\n" +
"now that\n" +
"now when\n" +
"once\n" +
"provided\n" +
"provided that\n" +
"rather than\n" +
"since\n" +
"so that\n" +
"supposing\n" +
"than\n" +
"that\n" +
"though\n" +
"til\n" +
"unless\n" +
"until\n" +
"when\n" +
"whenever\n" +
"where\n" +
"whereas\n" +
"where if\n" +
"wherever\n" +
"whether\n" +
"which\n" +
"while\n" +
"who\n" +
"whoever\n" +
"why";
        consSoundString="use\n" +
"union\n" +
"university\n" +
"unit\n" +
"user\n" +
"unity\n" +
"universe\n" +
"uniform\n" +
"usage\n" +
"\n" +
"utility\n" +
"urine\n" +
"\n" +
"uranium\n" +
"unison\n" +
"\n" +
"euphoria\n" +
"utopia\n" +
"unanimity\n" +
"uterus\n" +
"euthanasia\n" +
"ewe\n" +
"ufo\n" +
"unicorn\n" +
"urea\n" +
"\n" +
"urethra\n" +
"euphemism\n" +
"eugenics\n" +
"usurper\n" +
"usability\n" +
"eunuch\n" +
"uni\n" +
"eucalyptus\n" +
"usury\n" +
"eulogy\n" +
"ubiquity\n" +
"universalism\n" +
"urinal\n" +
"universal\n" +
"ewer\n" +
"\n" +
"euro\n" +
"utensil\n" +
"ufology\n" +
"\n" +
"uniformitarianism\n" +
"upsilon\n" +
"\n" +
"ukulele\n" +
"urinalysis\n" +
"usurer\n" +
"\n" +
"ureter\n" +
"uridine\n" +
"ute\n" +
"eugenist\n" +
"eutectic\n" +
"eukaryote\n" +
"\n" +
"ufologist\n" +
"ululation\n" +
"\n" +
"usufruct\n" +
"eustasy\n" +
"unary\n" +
"uvula\n" +
"urus\n" +
"eucatastrophe\n" +
"uraeus\n" +
"ouabain\n" +
"\n" +
"one\n" +
"\n" +
"using\n" +
"Ucalegon\n" +
"oncer\n" +
"Usanian\n" +
"usufruction\n" +
"Eusebius\n" +
"USAR\n" +
"usufructuary\n" +
"\n" +
"Amazigh\n" +
"\n" +
"\n" +
"usuress\n" +
"\n" +
"euouae\n" +
"ukase\n" +
"euclidianness\n" +
"uke\n" +
"uke\n" +
"Uke\n" +
"Ukie\n" +
"ureteroureterostomy\n" +
"usurping\n" +
"eustress\n" +
"Unakas\n" +
"eudaemon\n" +
"Ukrainian\n" +
"unidirectionality\n" +
"Utahn\n" +
"\n" +
"unite\n" +
"\n" +
"\n" +
"\n" +
"uranism\n" +
"uranist\n" +
"eudemonia\n" +
"euth\n" +
"Ute\n" +
"European bison\n" +
"uranophobia\n" +
"euphoriant\n" +
"uvular\n" +
"Ouija\n" +
"\n" +
"uropygium\n" +
"eugarie\n" +
"\n" +
"eugenesis\n" +
"UW\n" +
"Iatmul\n" +
"eutripsia\n" +
"uey\n" +
"eugeny\n" +
"euglena\n" +
"UFO\n" +
"unigeniture\n" +
"\n" +
"univalence\n" +
"\n" +
"univalent\n" +
"\n" +
"utile\n" +
"utilitarian\n" +
"ubac\n" +
"eulachon\n" +
"unique\n" +
"Usonian\n" +
"\n" +
"Eurasian wigeon\n" +
"Oaxaca\n" +
"\n" +
"uniquity\n" +
"eureka\n" +
"onesie\n" +
"Universalism\n" +
"uberty\n" +
"uni\n" +
"ubication\n" +
"Utonian\n" +
"ubicity\n" +
"Euboean\n" +
"Uniate\n" +
"euro\n" +
"utopographer\n" +
"accidental abortion\n" +
"esclop\n" +
"Euro-American\n" +
"\n" +
"Eumenides\n" +
"Eucharist\n" +
"univocal\n" +
"\n" +
"US-ian\n" +
"\n" +
"euchologion\n" +
"euchre\n" +
"eunoia\n" +
"Unix";
        nounsString = "people\nhistory\nway\nart\nworld\ninformation\nmap\ntwo\nfamily\ngovernment\nhealth\nsystem\ncomputer\nmeat\nyear\nthanks\nmusic\nperson\nreading\nmethod\ndata\nfood\nunderstanding\ntheory\nlaw\nbird\nliterature\nproblem\nsoftware\ncontrol\nknowledge\npower\nability\neconomics\nlove\ninternet\ntelevision\nscience\nlibrary\nnature\nfact\nproduct\nidea\ntemperature\ninvestment\narea\nsociety\nactivity\nstory\nindustry\nmedia\nthing\noven\ncommunity\ndefinition\nsafety\nquality\ndevelopment\nlanguage\nmanagement\nplayer\nvariety\nvideo\nweek\nsecurity\ncountry\nexam\nmovie\norganization\nequipment\nphysics\nanalysis\npolicy\nseries\nthought\nbasis\nboyfriend\ndirection\nstrategy\ntechnology\narmy\ncamera\nfreedom\npaper\nenvironment\nchild\ninstance\nmonth\ntruth\nmarketing\nuniversity\nwriting\narticle\ndepartment\ndifference\ngoal\nnews\naudience\nfishing\ngrowth\nincome\nmarriage\nuser\ncombination\nfailure\nmeaning\nmedicine\nphilosophy\nteacher\ncommunication\nnight\nchemistry\ndisease\ndisk\nenergy\nnation\nroad\nrole\nsoup\nadvertising\nlocation\nsuccess\naddition\napartment\neducation\nmath\nmoment\npainting\npolitics\nattention\ndecision\nevent\nproperty\nshopping\nstudent\nwood\ncompetition\ndistribution\nentertainment\noffice\npopulation\npresident\nunit\ncategory\ncigarette\ncontext\nintroduction\nopportunity\nperformance\ndriver\nflight\nlength\nmagazine\nnewspaper\nrelationship\nteaching\ncell\ndealer\nfinding\nlake\nmember\nmessage\nphone\nscene\nappearance\nassociation\nconcept\ncustomer\ndeath\ndiscussion\nhousing\ninflation\ninsurance\nmood\nwoman\nadvice\nblood\neffort\nexpression\nimportance\nopinion\npayment\nreality\nresponsibility\nsituation\nskill\nstatement\nwealth\napplication\ncity\ncounty\ndepth\nestate\nfoundation\ngrandmother\nheart\nperspective\nphoto\nrecipe\nstudio\ntopic\ncollection\ndepression\nimagination\npassion\npercentage\nresource\nsetting\nad\nagency\ncollege\nconnection\ncriticism\ndebt\ndescription\nmemory\npatience\nsecretary\nsolution\nadministration\naspect\nattitude\ndirector\npersonality\npsychology\nrecommendation\nresponse\nselection\nstorage\nversion\nalcohol\nargument\ncomplaint\ncontract\nemphasis\nhighway\nloss\nmembership\npossession\npreparation\nsteak\nunion\nagreement\ncancer\ncurrency\nemployment\nengineering\nentry\ninteraction\nmixture\npreference\nregion\nrepublic\ntradition\nvirus\nactor\nclassroom\ndelivery\ndevice\ndifficulty\ndrama\nelection\nengine\nfootball\nguidance\nhotel\nowner\npriority\nprotection\nsuggestion\ntension\nvariation\nanxiety\natmosphere\nawareness\nbath\nbread\ncandidate\nclimate\ncomparison\nconfusion\nconstruction\nelevator\nemotion\nemployee\nemployer\nguest\nheight\nleadership\nmall\nmanager\noperation\nrecording\nsample\ntransportation\ncharity\ncousin\ndisaster\neditor\nefficiency\nexcitement\nextent\nfeedback\nguitar\nhomework\nleader\nmom\noutcome\npermission\npresentation\npromotion\nreflection\nrefrigerator\nresolution\nrevenue\nsession\nsinger\ntennis\nbasket\nbonus\ncabinet\nchildhood\nchurch\nclothes\ncoffee\ndinner\ndrawing\nhair\nhearing\ninitiative\njudgment\nlab\nmeasurement\nmode\nmud\norange\npoetry\npolice\npossibility\nprocedure\nqueen\nratio\nrelation\nrestaurant\nsatisfaction\nsector\nsignature\nsignificance\nsong\ntooth\ntown\nvehicle\nvolume\nwife\naccident\nairport\nappointment\narrival\nassumption\nbaseball\nchapter\ncommittee\nconversation\ndatabase\nenthusiasm\nerror\nexplanation\nfarmer\ngate\ngirl\nhall\nhistorian\nhospital\ninjury\ninstruction\nmaintenance\nmanufacturer\nmeal\nperception\npie\npoem\npresence\nproposal\nreception\nreplacement\nrevolution\nriver\nson\nspeech\ntea\nvillage\nwarning\nwinner\nworker\nwriter\nassistance\nbreath\nbuyer\nchest\nchocolate\nconclusion\ncontribution\ncookie\ncourage\ndad\ndesk\ndrawer\nestablishment\nexamination\ngarbage\ngrocery\nhoney\nimpression\nimprovement\nindependence\ninsect\ninspection\ninspector\nking\nladder\nmenu\npenalty\npiano\npotato\nprofession\nprofessor\nquantity\nreaction\nrequirement\nsalad\nsister\nsupermarket\ntongue\nweakness\nwedding\naffair\nambition\nanalyst\napple\nassignment\nassistant\nbathroom\nbedroom\nbeer\nbirthday\ncelebration\nchampionship\ncheek\nclient\nconsequence\ndeparture\ndiamond\ndirt\near\nfortune\nfriendship\nfuneral\ngene\ngirlfriend\nhat\nindication\nintention\nlady\nmidnight\nnegotiation\nobligation\npassenger\npizza\nplatform\npoet\npollution\nrecognition\nreputation\nshirt\nsir\nspeaker\nstranger\nsurgery\nsympathy\ntale\nthroat\ntrainer\nuncle\nyouth\ntime\nwork\nfilm\nwater\nmoney\nexample\nwhile\nbusiness\nstudy\ngame\nlife\nform\nair\nday\nplace\nnumber\npart\nfield\nfish\nback\nprocess\nheat\nhand\nexperience\njob\nbook\nend\npoint\ntype\nhome\neconomy\nvalue\nbody\nmarket\nguide\ninterest\nstate\nradio\ncourse\ncompany\nprice\nsize\ncard\nlist\nmind\ntrade\nline\ncare\ngroup\nrisk\nword\nfat\nforce\nkey\nlight\ntraining\nname\nschool\ntop\namount\nlevel\norder\npractice\nresearch\nsense\nservice\npiece\nweb\nboss\nsport\nfun\nhouse\npage\nterm\ntest\nanswer\nsound\nfocus\nmatter\nkind\nsoil\nboard\noil\npicture\naccess\ngarden\nrange\nrate\nreason\nfuture\nsite\ndemand\nexercise\nimage\ncase\ncause\ncoast\naction\nage\nbad\nboat\nrecord\nresult\nsection\nbuilding\nmouse\ncash\nclass\nnothing\nperiod\nplan\nstore\ntax\nside\nsubject\nspace\nrule\nstock\nweather\nchance\nfigure\nman\nmodel\nsource\nbeginning\nearth\nprogram\nchicken\ndesign\nfeature\nhead\nmaterial\npurpose\nquestion\nrock\nsalt\nact\nbirth\ncar\ndog\nobject\nscale\nsun\nnote\nprofit\nrent\nspeed\nstyle\nwar\nbank\ncraft\nhalf\ninside\noutside\nstandard\nbus\nexchange\neye\nfire\nposition\npressure\nstress\nadvantage\nbenefit\nbox\nframe\nissue\nstep\ncycle\nface\nitem\nmetal\npaint\nreview\nroom\nscreen\nstructure\nview\naccount\nball\ndiscipline\nmedium\nshare\nbalance\nbit\nblack\nbottom\nchoice\ngift\nimpact\nmachine\nshape\ntool\nwind\naddress\naverage\ncareer\nculture\nmorning\npot\nsign\ntable\ntask\ncondition\ncontact\ncredit\negg\nhope\nice\nnetwork\nnorth\nsquare\nattempt\ndate\neffect\nlink\npost\nstar\nvoice\ncapital\nchallenge\nfriend\nself\nshot\nbrush\ncouple\ndebate\nexit\nfront\nfunction\nlack\nliving\nplant\nplastic\nspot\nsummer\ntaste\ntheme\ntrack\nwing\nbrain\nbutton\nclick\ndesire\nfoot\ngas\ninfluence\nnotice\nrain\nwall\nbase\ndamage\ndistance\nfeeling\npair\nsavings\nstaff\nsugar\ntarget\ntext\nanimal\nauthor\nbudget\ndiscount\nfile\nground\nlesson\nminute\nofficer\nphase\nreference\nregister\nsky\nstage\nstick\ntitle\ntrouble\nbowl\nbridge\ncampaign\ncharacter\nclub\nedge\nevidence\nfan\nletter\nlock\nmaximum\nnovel\noption\npack\npark\nplenty\nquarter\nskin\nsort\nweight\nbaby\nbackground\ncarry\ndish\nfactor\nfruit\nglass\njoint\nmaster\nmuscle\nred\nstrength\ntraffic\ntrip\nvegetable\nappeal\nchart\ngear\nideal\nkitchen\nland\nlog\nmother\nnet\nparty\nprinciple\nrelative\nsale\nseason\nsignal\nspirit\nstreet\ntree\nwave\nbelt\nbench\ncommission\ncopy\ndrop\nminimum\npath\nprogress\nproject\nsea\nsouth\nstatus\nstuff\nticket\ntour\nangle\nblue\nbreakfast\nconfidence\ndaughter\ndegree\ndoctor\ndot\ndream\nduty\nessay\nfather\nfee\nfinance\nhour\njuice\nlimit\nluck\nmilk\nmouth\npeace\npipe\nseat\nstable\nstorm\nsubstance\nteam\ntrick\nafternoon\nbat\nbeach\nblank\ncatch\nchain\nconsideration\ncream\ncrew\ndetail\ngold\ninterview\nkid\nmark\nmatch\nmission\npain\npleasure\nscore\nscrew\nsex\nshop\nshower\nsuit\ntone\nwindow\nagent\nband\nblock\nbone\ncalendar\ncap\ncoat\ncontest\ncorner\ncourt\ncup\ndistrict\ndoor\neast\nfinger\ngarage\nguarantee\nhole\nhook\nimplement\nlayer\nlecture\nlie\nmanner\nmeeting\nnose\nparking\npartner\nprofile\nrespect\nrice\nroutine\nschedule\nswimming\ntelephone\ntip\nwinter\nairline\nbag\nbattle\nbed\nbill\nbother\ncake\ncode\ncurve\ndesigner\ndimension\ndress\nease\nemergency\nevening\nextension\nfarm\nfight\ngap\ngrade\nholiday\nhorror\nhorse\nhost\nhusband\nloan\nmistake\nmountain\nnail\nnoise\noccasion\npackage\npatient\npause\nphrase\nproof\nrace\nrelief\nsand\nsentence\nshoulder\nsmoke\nstomach\nstring\ntourist\ntowel\nvacation\nwest\nwheel\nwine\narm\naside\nassociate\nbet\nblow\nborder\nbranch\nbreast\nbrother\nbuddy\nbunch\nchip\ncoach\ncross\ndocument\ndraft\ndust\nexpert\nfloor\ngod\ngolf\nhabit\niron\njudge\nknife\nlandscape\nleague\nmail\nmess\nnative\nopening\nparent\npattern\npin\npool\npound\nrequest\nsalary\nshame\nshelter\nshoe\nsilver\ntackle\ntank\ntrust\nassist\nbake\nbar\nbell\nbike\nblame\nboy\nbrick\nchair\ncloset\nclue\ncollar\ncomment\nconference\ndevil\ndiet\nfear\nfuel\nglove\njacket\nlunch\nmonitor\nmortgage\nnurse\npace\npanic\npeak\nplane\nreward\nrow\nsandwich\nshock\nspite\nspray\nsurprise\ntill\ntransition\nweekend\nwelcome\nyard\nalarm\nbend\nbicycle\nbite\nblind\nbottle\ncable\ncandle\nclerk\ncloud\nconcert\ncounter\nflower\ngrandfather\nharm\nknee\nlawyer\nleather\nload\nmirror\nneck\npension\nplate\npurple\nruin\nship\nskirt\nslice\nsnow\nspecialist\nstroke\nswitch\ntrash\ntune\nzone\nanger\naward\nbid\nbitter\nboot\nbug\ncamp\ncandy\ncarpet\ncat\nchampion\nchannel\nclock\ncomfort\ncow\ncrack\nengineer\nentrance\nfault\ngrass\nguy\nhell\nhighlight\nincident\nisland\njoke\njury\nleg\nlip\nmate\nmotor\nnerve\npassage\npen\npride\npriest\nprize\npromise\nresident\nresort\nring\nroof\nrope\nsail\nscheme\nscript\nsock\nstation\ntoe\ntower\ntruck\nwitness\na\nyou\nit\ncan\nwill\nif\none\nmany\nmost\nother\nuse\nmake\ngood\nlook\nhelp\ngo\ngreat\nbeing\nfew\nmight\nstill\npublic\nread\nkeep\nstart\ngive\nhuman\nlocal\ngeneral\nshe\nspecific\nlong\nplay\nfeel\nhigh\ntonight\nput\ncommon\nset\nchange\nsimple\npast\nbig\npossible\nparticular\ntoday\nmajor\npersonal\ncurrent\nnational\ncut\nnatural\nphysical\nshow\ntry\ncheck\nsecond\ncall\nmove\npay\nlet\nincrease\nsingle\nindividual\nturn\nask\nbuy\nguard\nhold\nmain\noffer\npotential\nprofessional\ninternational\ntravel\ncook\nalternative\nfollowing\nspecial\nworking\nwhole\ndance\nexcuse\ncold\ncommercial\nlow\npurchase\ndeal\nprimary\nworth\nfall\nnecessary\npositive\nproduce\nsearch\npresent\nspend\ntalk\ncreative\ntell\ncost\ndrive\ngreen\nsupport\nglad\nremove\nreturn\nrun\ncomplex\ndue\neffective\nmiddle\nregular\nreserve\nindependent\nleave\noriginal\nreach\nrest\nserve\nwatch\nbeautiful\ncharge\nactive\nbreak\nnegative\nsafe\nstay\nvisit\nvisual\naffect\ncover\nreport\nrise\nwalk\nwhite\nbeyond\njunior\npick\nunique\nanything\nclassic\nfinal\nlift\nmix\nprivate\nstop\nteach\nwestern\nconcern\nfamiliar\nfly\nofficial\nbroad\ncomfortable\ngain\nmaybe\nrich\nsave\nstand\nyoung\nfail\nheavy\nhello\nlead\nlisten\nvaluable\nworry\nhandle\nleading\nmeet\nrelease\nsell\nfinish\nnormal\npress\nride\nsecret\nspread\nspring\ntough\nwait\nbrown\ndeep\ndisplay\nflow\nhit\nobjective\nshoot\ntouch\ncancel\nchemical\ncry\ndump\nextreme\npush\nconflict\neat\nfill\nformal\njump\nkick\nopposite\npass\npitch\nremote\ntotal\ntreat\nvast\nabuse\nbeat\nburn\ndeposit\nprint\nraise\nsleep\nsomewhere\nadvance\nanywhere\nconsist\ndark\ndouble\ndraw\nequal\nfix\nhire\ninternal\njoin\nkill\nsensitive\ntap\nwin\nattack\nclaim\nconstant\ndrag\ndrink\nguess\nminor\npull\nraw\nsoft\nsolid\nwear\nweird\nwonder\nannual\ncount\ndead\ndoubt\nfeed\nforever\nimpress\nnobody\nrepeat\nround\nsing\nslide\nstrip\nwhereas\nwish\ncombine\ncommand\ndig\ndivide\nequivalent\nhang\nhunt\ninitial\nmarch\nmention\nsmell\nspiritual\nsurvey\ntie\nadult\nbrief\ncrazy\nescape\ngather\nhate\nprior\nrepair\nrough\nsad\nscratch\nsick\nstrike\nemploy\nexternal\nhurt\nillegal\nlaugh\nlay\nmobile\nnasty\nordinary\nrespond\nroyal\nsenior\nsplit\nstrain\nstruggle\nswim\ntrain\nupper\nwash\nyellow\nconvert\ncrash\ndependent\nfold\nfunny\ngrab\nhide\nmiss\npermit\nquote\nrecover\nresolve\nroll\nsink\nslip\nspare\nsuspect\nsweet\nswing\ntwist\nupstairs\nusual\nabroad\nbrave\ncalm\nconcentrate\nestimate\ngrand\nmale\nmine\nprompt\nquiet\nrefuse\nregret\nreveal\nrush\nshake\nshift\nshine\nsteal\nsuck\nsurround\nanybody\nbear\nbrilliant\ndare\ndear\ndelay\ndrunk\nfemale\nhurry\ninevitable\ninvite\nkiss\nneat\npop\npunch\nquit\nreply\nrepresentative\nresist\nrip\nrub\nsilly\nsmile\nspell\nstretch\nstupid\ntear\ntemporary\ntomorrow\nwake\nwrap\nyesterday\n";
        interjectionsString = "Aah\nAh\nAha\nAhem\nAlas\nArgh\nAw\nAww\nBah\nBehold\nBingo\nBoo\nBravo\nBrr\nDear\nDuh\nEek\nEh\nEr\nEww\nGah\nGee\nGrr\nHah\nHmm\nHello, Hullo\nHey\nHi\nHuh\nHumph\nHurrah\nMeh\nMhm\nMuahaha\nNuh-uh\nOh\nOoh-la-la\nOoh\nOomph\nOops\nOww\nOuch\nOy\nPew\nPff\nPhew\nPsst\nSheesh\nShh\nShoo\nTsk-tsk\nUh-hu\nUh-oh\nUh-uh\nUhh\nUm, Umm\nWee\nWell\nWhoa\nWow\nYahoo\nYay\nYeah\nYikes\nYippee\nYoo-hoo\nYuh-uh\nYuck\nZing\n";
        prepositionsString = "aboard\nabout\nabove\nacross\nafter\nagainst\nalong\namid\namong\naround\nas\nat\nbefore\nbehind\nbelow\nbeneath\nbeside\nbetween\nbeyond\nbut\nby\nconcerning\nconsidering\ndespite\ndown\nduring\nexcept\nfollowing\nfor\nfrom\nin\ninside\ninto\nlike\nminus\nnear\nnext\nof\noff\non\nonto\nopposite\nout\noutside\nover\npast\nper\nplus\nregarding\nround\nsave\nsince\nthan\nthrough\nto\ntoward\nunder\nunderneath\nunlike\nuntil\nup\nupon\nversus\nvia\nwith\nwithin\nwithout";
        verbsString = "accept\nadd\nadmire\nadmit\nadvise\nafford\nagree\nalert\nallow\namuse\nanalyse\nanalyze\nannounce\nannoy\nanswer\napologise\nappear\napplaud\nappreciate\napprove\nargue\narrange\narrest\narrive\nask\nattach\nattack\nattempt\nattend\nattract\navoid\nback\nbake\nbalance\nban\nbang\nbare\nbat\nbathe\nbattle\nbeam\nbeg\nbehave\nbelong\nbleach\nbless\nblind\nblink\nblot\nblush\nboast\nboil\nbolt\nbomb\nbook\nbore\nborrow\nbounce\nbow\nbox\nbrake\nbranch\nbreathe\nbruise\nbrush\nbubble\nbump\nburn\nbury\nbuzz\ncalculate\ncall\ncamp\ncare\ncarry\ncarve\ncause\nchallenge\nchange\ncharge\nchase\ncheat\ncheck\ncheer\nchew\nchoke\nchop\nclaim\nclap\nclean\nclear\nclip\nclose\ncoach\ncoil\ncollect\ncolour\ncomb\ncommand\ncommunicate\ncompare\ncompete\ncomplain\ncomplete\nconcentrate\nconcern\nconfess\nconfuse\nconnect\nconsider\nconsist\ncontain\ncontinue\ncopy\ncorrect\ncough\ncount\ncover\ncrack\ncrash\ncrawl\ncross\ncrush\ncry\ncure\ncurl\ncurve\ncycle\ndam\ndamage\ndance\ndare\ndecay\ndeceive\ndecide\ndecorate\ndelay\ndelight\ndeliver\ndepend\ndescribe\ndesert\ndeserve\ndestroy\ndetect\ndevelop\ndisagree\ndisappear\ndisapprove\ndisarm\ndiscover\ndislike\ndivide\ndouble\ndoubt\ndrag\ndrain\ndream\ndress\ndrip\ndrop\ndrown\ndrum\ndry\ndust\nearn\neducate\nembarrass\nemploy\nempty\nencourage\nend\nenjoy\nenter\nentertain\nescape\nexamine\nexcite\nexcuse\nexercise\nexist\nexpand\nexpect\nexplain\nexplode\nextend\nface\nfade\nfail\nfancy\nfasten\nfax\nfear\nfence\nfetch\nfile\nfill\nfilm\nfire\nfit\nfix\nflap\nflash\nfloat\nflood\nflow\nflower\nfold\nfollow\nfool\nforce\nform\nfound\nframe\nfree\nfrighten\nfry\ngather\ngaze\nglow\nglue\ngrab\ngrate\ngrease\ngreet\ngrin\ngrip\ngroan\nguarantee\nguard\nguess\nguide\nhammer\nhand\nhandle\nhang\nhappen\nharass\nharm\nhate\nhaunt\nhead\nheal\nheap\nheat\nhelp\nhook\nhop\nhope\nhover\nhug\nhum\nhunt\nhurry\nidentify\nignore\nimagine\nimpress\nimprove\ninclude\nincrease\ninfluence\ninform\ninject\ninjure\ninstruct\nintend\ninterest\ninterfere\ninterrupt\nintroduce\ninvent\ninvite\nirritate\nitch\njail\njam\njog\njoin\njoke\njudge\njuggle\njump\nkick\nkill\nkiss\nkneel\nknit\nknock\nknot\nlabel\nland\nlast\nlaugh\nlaunch\nlearn\nlevel\nlicense\nlick\nlie\nlighten\nlike\nlist\nlisten\nlive\nload\nlock\nlong\nlook\nlove\nman\nmanage\nmarch\nmark\nmarry\nmatch\nmate\nmatter\nmeasure\nmeddle\nmelt\nmemorise\nmend\nmess up\nmilk\nmine\nmimic\nmiss\nmix\nmoan\nmoor\nmourn\nmove\nmuddle\nmug\nmultiply\nmurder\nnail\nname\nneed\nnest\nnod\nnote\nnotice\nnumber\nobey\nobject\nobserve\nobtain\noccur\noffend\noffer\nopen\norder\noverflow\nowe\nown\ntraffic\npack\npaddle\npaint\npark\npart\npass\npaste\npat\npause\npeck\npedal\npeel\npeep\nperform\npermit\nphone\npick\npicnic\npinch\npine\nplace\nplan\nplant\nplay\nplease\nplug\npoint\npoke\npolish\npop\npossess\npost\npour\npractise\npractice\npray\npreach\nprecede\nprefer\nprepare\npresent\npreserve\npress\npretend\nprevent\nprick\nprint\nproduce\nprogram\npromise\nprotect\nprovide\npull\npump\npunch\npuncture\npunish\npush\nquestion\nqueue\nrace\nradiate\nrain\nraise\nreach\nrealise\nreceive\nrecognise\nrecord\nreduce\nreflect\nrefuse\nregret\nreign\nreject\nrejoice\nrelax\nrelease\nrely\nremain\nremember\nremind\nremove\nrepair\nrepeat\nreplace\nreply\nreport\nreproduce\nrequest\nrescue\nretire\nreturn\nrhyme\nrinse\nrisk\nrob\nrock\nroll\nrot\nrub\nruin\nrule\nrush\nsack\nsail\nsatisfy\nsave\nsaw\nscare\nscatter\nscold\nscorch\nscrape\nscratch\nscream\nscrew\nscribble\nscrub\nseal\nsearch\nseparate\nserve\nsettle\nshade\nshare\nshave\nshelter\nshiver\nshock\nshop\nshrug\nsigh\nsign\nsignal\nsin\nsip\nski\nskip\nslap\nslip\nslow\nsmash\nsmell\nsmile\nsmoke\nsnatch\nsneeze\nsniff\nsnore\nsnow\nsoak\nsoothe\nsound\nspare\nspark\nsparkle\nspell\nspill\nspoil\nspot\nspray\nsprout\nsquash\nsqueak\nsqueal\nsqueeze\nstain\nstamp\nstare\nstart\nstay\nsteer\nstep\nstir\nstitch\nstop\nstore\nstrap\nstrengthen\nstretch\nstrip\nstroke\nstuff\nsubtract\nsucceed\nsuck\nsuffer\nsuggest\nsuit\nsupply\nsupport\nsuppose\nsurprise\nsurround\nsuspect\nsuspend\nswitch\ntalk\ntame\ntap\ntaste\ntease\ntelephone\ntempt\nterrify\ntest\nthank\nthaw\ntick\ntickle\ntie\ntime\ntip\ntire\ntouch\ntour\ntow\ntrace\ntrade\ntrain\ntransport\ntrap\ntravel\ntreat\ntremble\ntrick\ntrip\ntrot\ntrouble\ntrust\ntry\ntug\ntumble\nturn\ntwist\ntype\nundress\nunfasten\nunite\nunlock\nunpack\nuntidy\nuse\nvanish\nvisit\n\nwail\nwait\nwalk\nwander\nwant\nwarm\nwarn\nwash\nwaste\nwatch\nwater\nwave\nweigh\nwelcome\nwhine\nwhip\nwhirl\nwhisper\nwhistle\nwink\nwipe\nwish\nwobble\nwonder\nwork\nworry\nwrap\nwreck\nwrestle\nwriggle\nx-ray\nyawn\nyell\nzip\nzoom\n";
        uncountablesString="access\n" +
"accommodation\n" +
"adulthood\n" +
"advertising\n" +
"advice\n" +
"aggression\n" +
"aid\n" +
"air\n" +
"alcohol\n" +
"anger\n" +
"applause\n" +
"arithmetic\n" +
"art\n" +
"assistance\n" +
"athletics\n" +
"attention\n" +
"bacon\n" +
"baggage\n" +
"ballet\n" +
"beauty\n" +
"beef\n" +
"beer\n" +
"biology\n" +
"blood\n" +
"botany\n" +
"bread\n" +
"business\n" +
"butter\n" +
"carbon\n" +
"cardboard\n" +
"cash\n" +
"chalk\n" +
"chaos\n" +
"cheese\n" +
"chess\n" +
"childhood\n" +
"clothing\n" +
"coal\n" +
"coffee\n" +
"commerce\n" +
"compassion\n" +
"comprehension\n" +
"content\n" +
"corruption\n" +
"cotton\n" +
"courage\n" +
"currency\n" +
"damage\n" +
"dancing\n" +
"danger\n" +
"data\n" +
"delight\n" +
"dessert\n" +
"dignity\n" +
"dirt\n" +
"distribution\n" +
"dust\n" +
"economics\n" +
"education\n" +
"electricity\n" +
"employment\n" +
"energy\n" +
"engineering\n" +
"enjoyment\n" +
"entertainment\n" +
"envy\n" +
"equipment\n" +
"ethics\n" +
"evidence\n" +
"evolution\n" +
"failure\n" +
"faith\n" +
"fame\n" +
"fiction\n" +
"flour\n" +
"flu\n" +
"food\n" +
"freedom\n" +
"fruit\n" +
"fuel\n" +
"fun\n" +
"furniture\n" +
"garbage\n" +
"garlic\n" +
"gas\n" +
"genetics\n" +
"glass\n" +
"gold\n" +
"golf\n" +
"gossip\n" +
"grammar\n" +
"grass\n" +
"gratitude\n" +
"grief\n" +
"ground\n" +
"guilt\n" +
"gymnastics\n" +
"hair\n" +
"happiness\n" +
"hardware\n" +
"harm\n" +
"hate\n" +
"hatred\n" +
"health\n" +
"heat\n" +
"height\n" +
"help\n" +
"homework\n" +
"honesty\n" +
"honey\n" +
"hospitality\n" +
"housework\n" +
"humour\n" +
"hunger\n" +
"hydrogen\n" +
"ice\n" +
"ice cream\n" +
"importance\n" +
"inflation\n" +
"information\n" +
"injustice\n" +
"innocence\n" +
"intelligence\n" +
"iron\n" +
"irony\n" +
"jam\n" +
"jealousy\n" +
"jelly\n" +
"joy\n" +
"judo\n" +
"juice\n" +
"justice\n" +
"karate\n" +
"kindness\n" +
"knowledge\n" +
"labour\n" +
"lack\n" +
"land\n" +
"laughter\n" +
"lava\n" +
"leather\n" +
"leisure\n" +
"lightning\n" +
"linguistics\n" +
"literature\n" +
"litter\n" +
"livestock\n" +
"logic\n" +
"loneliness\n" +
"love\n" +
"luck\n" +
"luggage\n" +
"machinery\n" +
"magic\n" +
"mail\n" +
"management\n" +
"mankind\n" +
"marble\n" +
"mathematics\n" +
"mayonnaise\n" +
"measles\n" +
"meat\n" +
"metal\n" +
"methane\n" +
"milk\n" +
"money\n" +
"mud\n" +
"music\n" +
"nature\n" +
"news\n" +
"nitrogen\n" +
"nonsense\n" +
"nurture\n" +
"nutrition\n" +
"obedience\n" +
"obesity\n" +
"oil\n" +
"oxygen\n" +
"paper\n" +
"passion\n" +
"pasta\n" +
"patience\n" +
"permission\n" +
"physics\n" +
"poetry\n" +
"pollution\n" +
"poverty\n" +
"power\n" +
"pride\n" +
"production\n" +
"progress\n" +
"pronunciation\n" +
"psychology\n" +
"publicity\n" +
"punctuation\n" +
"quality\n" +
"quantity\n" +
"quartz\n" +
"racism\n" +
"rain\n" +
"recreation\n" +
"relaxation\n" +
"reliability\n" +
"research\n" +
"respect\n" +
"revenge\n" +
"rice\n" +
"room\n" +
"rubbish\n" +
"rum\n" +
"safety\n" +
"salad\n" +
"salt\n" +
"sand\n" +
"satire\n" +
"scenery\n" +
"seafood\n" +
"seaside\n" +
"shame\n" +
"shopping\n" +
"silence\n" +
"sleep\n" +
"smoke\n" +
"smoking\n" +
"snow\n" +
"soap\n" +
"software\n" +
"soil\n" +
"sorrow\n" +
"soup\n" +
"speed\n" +
"spelling\n" +
"sport\n" +
"steam\n" +
"strength\n" +
"stuff\n" +
"stupidity\n" +
"success\n" +
"sugar\n" +
"sunshine\n" +
"symmetry\n" +
"tea\n" +
"tennis\n" +
"thirst\n" +
"thunder\n" +
"timber\n" +
"time\n" +
"toast\n" +
"tolerance\n" +
"trade\n" +
"traffic\n" +
"transportation\n" +
"travel\n" +
"trust\n" +
"U\n" +
"understanding\n" +
"underwear\n" +
"unemployment\n" +
"unity\n" +
"usage\n" +
"V\n" +
"validity\n" +
"veal\n" +
"vegetation\n" +
"vegetarianism\n" +
"vengeance\n" +
"violence\n" +
"vision\n" +
"vitality\n" +
"\n" +
"warmth\n" +
"water\n" +
"wealth\n" +
"weather\n" +
"weight\n" +
"welfare\n" +
"wheat\n" +
"whiskey\n" +
"width\n" +
"wildlife\n" +
"wine\n" +
"wisdom\n" +
"wood\n" +
"wool\n" +
"work\n" +
"yeast\n" +
"yoga\n" +
"youth\n" +
"zinc\n" +
"zoology";

    pronounsString ="all\nanother\nany\nanybody\nanyone\nanything\nboth\neach\neither\neverybody\neveryone\neverything\nfew\nhe\nher\nhers\nherself\nhim\nhimself\nhis\nI\nit\nits\nitself\nmany\nme\nmine\nmore\nmost\nmuch\nmy\nmyself\nneither\nno one\nnobody\nnone\nnothing\none\nother\nothers\nour\nours\nourselves\nseveral\nshe\nsome\nsomebody\nsomeone\nsomething\nthat\ntheir\ntheirs\nthem\nthemselves\nthese\nthey\nthis\nthose\nus\nwe\nwhat\nwhatever\nwhich\nwhichever\nwho\nwhoever\nwhom\nwhomever\nwhose\nyou\nyour\nyours\nyourself\nyourselves\n";
    adjectivesString="abandoned\nable\nabsolute\nacademic\nacceptable\nacclaimed\naccomplished\naccurate\naching\nacidic\nacrobatic\nactive\nactual\nadept\nadmirable\nadmired\nadolescent\nadorable\nadored\nadvanced\nadventurous\naffectionate\nafraid\naged\naggravating\naggressive\nagile\nagitated\nagonizing\nagreeable\najar\nalarmed\nalarming\nalert\nalienated\nalive\nall\naltruistic\namazing\nambitious\nample\namused\namusing\nanchored\nancient\nangelic\nangry\nanguished\nanimated\nannual\nanother\nantique\nanxious\nany\napprehensive\nappropriate\napt\narctic\narid\naromatic\nartistic\nashamed\nassured\nastonishing\nathletic\nattached\nattentive\nattractive\naustere\nauthentic\nauthorized\nautomatic\navaricious\naverage\naware\nawesome\nawful\nawkward\nbabyish\nback\nbad\nbaggy\nbare\nbarren\nbasic\nbeautiful\nbelated\nbeloved\nbeneficial\nbest\nbetter\nbewitched\nbig\nbig-hearted\nbiodegradable\nbite-sized\nbitter\nblack\nblack-and-white\nbland\nblank\nblaring\nbleak\nblind\nblissful\nblond\nblue\nblushing\nbogus\nboiling\nbold\nbony\nboring\nbossy\nboth\nbouncy\nbountiful\nbowed\nbrave\nbreakable\nbrief\nbright\nbrilliant\nbrisk\nbroken\nbronze\nbrown\nbruised\nbubbly\nbulky\nbumpy\nbuoyant\nburdensome\nburly\nbustling\nbusy\nbuttery\nbuzzing\ncalculating\ncalm\ncandid\ncanine\ncapital\ncarefree\ncareful\ncareless\ncaring\ncautious\ncavernous\ncelebrated\ncharming\ncheap\ncheerful\ncheery\nchief\nchilly\nchubby\ncircular\nclassic\nclean\nclear\nclear-cut\nclever\nclose\nclosed\ncloudy\nclueless\nclumsy\ncluttered\ncoarse\ncold\ncolorful\ncolorless\ncolossal\ncomfortable\ncommon\ncompassionate\ncompetent\ncomplete\ncomplex\ncomplicated\ncomposed\nconcerned\nconcrete\nconfused\nconscious\nconsiderate\nconstant\ncontent\nconventional\ncooked\ncool\ncooperative\ncoordinated\ncorny\ncorrupt\ncostly\ncourageous\ncourteous\ncrafty\ncrazy\ncreamy\ncreative\ncreepy\ncriminal\ncrisp\ncritical\ncrooked\ncrowded\ncruel\ncrushing\ncuddly\ncultivated\ncultured\ncumbersome\ncurly\ncurvy\ncute\ncylindrical\ndamaged\ndamp\ndangerous\ndapper\ndaring\ndark\ndarling\ndazzling\ndead\ndeadly\ndeafening\ndear\ndearest\ndecent\ndecimal\ndecisive\ndeep\ndefenseless\ndefensive\ndefiant\ndeficient\ndefinite\ndefinitive\ndelayed\ndelectable\ndelicious\ndelightful\ndelirious\ndemanding\ndense\ndental\ndependable\ndependent\ndescriptive\ndeserted\ndetailed\ndetermined\ndevoted\ndifferent\ndifficult\ndigital\ndiligent\ndim\ndimpled\ndimwitted\ndirect\ndirty\ndisastrous\ndiscrete\ndisfigured\ndisguised\ndisgusting\ndishonest\ndisloyal\ndismal\ndistant\ndistinct\ndistorted\ndizzy\ndopey\ndoting\ndouble\ndownright\ndrab\ndrafty\ndramatic\ndreary\ndroopy\ndry\ndual\ndull\ndutiful\neach\neager\nearly\nearnest\neasy\neasy-going\necstatic\nedible\neducated\nelaborate\nelastic\nelated\nelderly\nelectric\nelegant\nelementary\nelliptical\nembarrassed\nembellished\neminent\nemotional\nempty\nenchanted\nenchanting\nenergetic\nenlightened\nenormous\nenraged\nentire\nenvious\nequal\nequatorial\nessential\nesteemed\nethical\neuphoric\neven\nevergreen\neverlasting\nevery\nevil\nexalted\nexcellent\nexcitable\nexcited\nexciting\nexemplary\nexhausted\nexotic\nexpensive\nexperienced\nexpert\nextra-large\nextra-small\nextraneous\nextroverted\nfabulous\nfailing\nfaint\nfair\nfaithful\nfake\nFALSE\nfamiliar\nfamous\nfancy\nfantastic\nfar\nfar-flung\nfar-off\nfaraway\nfast\nfat\nfatal\nfatherly\nfavorable\nfavorite\nfearful\nfearless\nfeisty\nfeline\nfemale\nfeminine\nfew\nfickle\nfilthy\nfine\nfinished\nfirm\nfirst\nfirsthand\nfitting\nfixed\nflaky\nflamboyant\nflashy\nflat\nflawed\nflawless\nflickering\nflimsy\nflippant\nflowery\nfluffy\nfluid\nflustered\nfocused\nfond\nfoolhardy\nfoolish\nforceful\nforked\nformal\nforsaken\nforthright\nfortunate\nfragrant\nfrail\nfrank\nfrayed\nfree\nFrench\nfrequent\nfresh\nfriendly\nfrightened\nfrightening\nfrigid\nfrilly\nfrivolous\nfrizzy\nfront\nfrosty\nfrozen\nfrugal\nfruitful\nfull\nfumbling\nfunctional\nfunny\nfussy\nfuzzy\ngargantuan\ngaseous\ngeneral\ngenerous\ngentle\ngenuine\ngiant\ngiddy\ngifted\ngigantic\ngiving\nglamorous\nglaring\nglass\ngleaming\ngleeful\nglistening\nglittering\ngloomy\nglorious\nglossy\nglum\ngolden\ngood\ngood-natured\ngorgeous\ngraceful\ngracious\ngrand\ngrandiose\ngranular\ngrateful\ngrave\ngray\ngreat\ngreedy\ngreen\ngregarious\ngrim\ngrimy\ngripping\ngrizzled\ngross\ngrotesque\ngrouchy\ngrounded\ngrowing\ngrowling\ngrown\ngrubby\ngruesome\ngrumpy\nguilty\ngullible\ngummy\nhairy\nhalf\nhandmade\nhandsome\nhandy\nhappy\nhappy-go-lucky\nhard\nhard-to-find\nharmful\nharmless\nharmonious\nharsh\nhasty\nhateful\nhaunting\nhealthy\nheartfelt\nhearty\nheavenly\nheavy\nhefty\nhelpful\nhelpless\nhidden\nhideous\nhigh\nhigh-level\nhilarious\nhoarse\nhollow\nhomely\nhonest\nhonorable\nhonored\nhopeful\nhorrible\nhospitable\nhot\nhuge\nhumble\nhumiliating\nhumming\nhumongous\nhungry\nhurtful\nhusky\nicky\nicy\nideal\nidealistic\nidentical\nidiotic\nidle\nidolized\nignorant\nill\nill-fated\nill-informed\nillegal\nilliterate\nillustrious\nimaginary\nimaginative\nimmaculate\nimmaterial\nimmediate\nimmense\nimpartial\nimpassioned\nimpeccable\nimperfect\nimperturbable\nimpish\nimpolite\nimportant\nimpossible\nimpractical\nimpressionable\nimpressive\nimprobable\nimpure\ninborn\nincomparable\nincompatible\nincomplete\ninconsequential\nincredible\nindelible\nindolent\ninexperienced\ninfamous\ninfantile\ninfatuated\ninferior\ninfinite\ninformal\ninnocent\ninsecure\ninsidious\ninsignificant\ninsistent\ninstructive\ninsubstantial\nintelligent\nintent\nintentional\ninteresting\ninternal\ninternational\nintrepid\nironclad\nirresponsible\nirritating\nitchy\njaded\njagged\njam-packed\njaunty\njealous\njittery\njoint\njolly\njovial\njoyful\njoyous\njubilant\njudicious\njuicy\njumbo\njumpy\njunior\njuvenile\nkaleidoscopic\nkeen\nkey\nkind\nkindhearted\nkindly\nklutzy\nknobby\nknotty\nknowing\nknowledgeable\nknown\nkooky\nkosher\nlame\nlanky\nlarge\nlast\nlasting\nlate\nlavish\nlawful\nlazy\nleading\nleafy\nlean\nleft\nlegal\nlegitimate\nlight\nlighthearted\nlikable\nlikely\nlimited\nlimp\nlimping\nlinear\nlined\nliquid\nlittle\nlive\nlively\nlivid\nloathsome\nlone\nlonely\nlong\nlong-term\nloose\nlopsided\nlost\nloud\nlovable\nlovely\nloving\nlow\nloyal\nlucky\nlumbering\nluminous\nlumpy\nlustrous\nluxurious\nmad\nmade-up\nmagnificent\nmajestic\nmajor\nmale\nmammoth\nmarried\nmarvelous\nmasculine\nmassive\nmature\nmeager\nmealy\nmean\nmeasly\nmeaty\nmedical\nmediocre\nmedium\nmeek\nmellow\nmelodic\nmemorable\nmenacing\nmerry\nmessy\nmetallic\nmild\nmilky\nmindless\nminiature\nminor\nminty\nmiserable\nmiserly\nmisguided\nmisty\nmixed\nmodern\nmodest\nmoist\nmonstrous\nmonthly\nmonumental\nmoral\nmortified\nmotherly\nmotionless\nmountainous\nmuddy\nmuffled\nmulticolored\nmundane\nmurky\nmushy\nmusty\nmuted\nmysterious\nnaive\nnarrow\nnasty\nnatural\nnaughty\nnautical\nnear\nneat\nnecessary\nneedy\nnegative\nneglected\nnegligible\nneighboring\nnervous\nnew\nnext\nnice\nnifty\nnimble\nnippy\nnocturnal\nnoisy\nnonstop\nnormal\nnotable\nnoted\nnoteworthy\nnovel\nnoxious\nnumb\nnutritious\nnutty\nobedient\nobese\noblong\nobvious\noccasional\nodd\noddball\noffbeat\noffensive\nofficial\noily\nold\nold-fashioned\nonly\nopen\noptimal\noptimistic\nopulent\norange\norderly\nordinary\norganic\noriginal\nornate\nornery\nother\nour\noutgoing\noutlandish\noutlying\noutrageous\noutstanding\noval\novercooked\noverdue\noverjoyed\noverlooked\npalatable\npale\npaltry\nparallel\nparched\npartial\npassionate\npast\npastel\npeaceful\npeppery\nperfect\nperfumed\nperiodic\nperky\npersonal\npertinent\npesky\npessimistic\npetty\nphony\nphysical\npiercing\npink\npitiful\nplain\nplaintive\nplastic\nplayful\npleasant\npleased\npleasing\nplump\nplush\npointed\npointless\npoised\npolished\npolite\npolitical\npoor\npopular\nportly\nposh\npositive\npossible\npotable\npowerful\npowerless\npractical\nprecious\npresent\nprestigious\npretty\nprevious\npricey\nprickly\nprimary\nprime\npristine\nprivate\nprize\nprobable\nproductive\nprofitable\nprofuse\nproper\nproud\nprudent\npunctual\npungent\npuny\npure\npurple\npushy\nputrid\npuzzled\npuzzling\nquaint\nqualified\nquarrelsome\nquarterly\nqueasy\nquerulous\nquestionable\nquick\nquick-witted\nquiet\nquintessential\nquirky\nquixotic\nquizzical\nradiant\nragged\nrapid\nrare\nrash\nraw\nready\nreal\nrealistic\nreasonable\nrecent\nreckless\nrectangular\nred\nreflecting\nregal\nregular\nreliable\nrelieved\nremarkable\nremorseful\nremote\nrepentant\nrepulsive\nrequired\nrespectful\nresponsible\nrevolving\nrewarding\nrich\nright\nrigid\nringed\nripe\nroasted\nrobust\nrosy\nrotating\nrotten\nrough\nround\nrowdy\nroyal\nrubbery\nruddy\nrude\nrundown\nrunny\nrural\nrusty\nsad\nsafe\nsalty\nsame\nsandy\nsane\nsarcastic\nsardonic\nsatisfied\nscaly\nscarce\nscared\nscary\nscented\nscholarly\nscientific\nscornful\nscratchy\nscrawny\nsecond\nsecond-hand\nsecondary\nsecret\nself-assured\nself-reliant\nselfish\nsentimental\nseparate\nserene\nserious\nserpentine\nseveral\nsevere\nshabby\nshadowy\nshady\nshallow\nshameful\nshameless\nsharp\nshimmering\nshiny\nshocked\nshocking\nshoddy\nshort\nshort-term\nshowy\nshrill\nshy\nsick\nsilent\nsilky\nsilly\nsilver\nsimilar\nsimple\nsimplistic\nsinful\nsingle\nsizzling\nskeletal\nskinny\nsleepy\nslight\nslim\nslimy\nslippery\nslow\nslushy\nsmall\nsmart\nsmoggy\nsmooth\nsmug\nsnappy\nsnarling\nsneaky\nsniveling\nsnoopy\nsociable\nsoft\nsoggy\nsolid\nsomber\nsome\nsophisticated\nsore\nsorrowful\nsoulful\nsoupy\nsour\nSpanish\nsparkling\nsparse\nspecific\nspectacular\nspeedy\nspherical\nspicy\nspiffy\nspirited\nspiteful\nsplendid\nspotless\nspotted\nspry\nsquare\nsqueaky\nsquiggly\nstable\nstaid\nstained\nstale\nstandard\nstarchy\nstark\nstarry\nsteel\nsteep\nsticky\nstiff\nstimulating\nstingy\nstormy\nstraight\nstrange\nstrict\nstrident\nstriking\nstriped\nstrong\nstudious\nstunning\nstupendous\nstupid\nsturdy\nstylish\nsubdued\nsubmissive\nsubstantial\nsubtle\nsuburban\nsudden\nsugary\nsunny\nsuper\nsuperb\nsuperficial\nsuperior\nsupportive\nsure-footed\nsurprised\nsuspicious\nsvelte\nsweaty\nsweet\nsweltering\nswift\nsympathetic\ntalkative\ntall\ntame\ntan\ntangible\ntart\ntasty\ntattered\ntaut\ntedious\nteeming\ntempting\ntender\ntense\ntepid\nterrible\nterrific\ntesty\nthankful\nthat\nthese\nthick\nthin\nthird\nthirsty\nthis\nthorny\nthorough\nthose\nthoughtful\nthreadbare\nthrifty\nthunderous\ntidy\ntight\ntimely\ntinted\ntiny\ntired\ntorn\ntotal\ntough\ntragic\ntrained\ntraumatic\ntreasured\ntremendous\ntriangular\ntricky\ntrifling\ntrim\ntrivial\ntroubled\nTRUE\ntrusting\ntrustworthy\ntrusty\ntruthful\ntubby\nturbulent\ntwin\nugly\nultimate\nunacceptable\nunaware\nuncomfortable\nuncommon\nunconscious\nunderstated\nunequaled\nuneven\nunfinished\nunfit\nunfolded\nunfortunate\nunhappy\nunhealthy\nuniform\nunimportant\nunique\nunited\nunkempt\nunknown\nunlawful\nunlined\nunlucky\nunnatural\nunpleasant\nunrealistic\nunripe\nunruly\nunselfish\nunsightly\nunsteady\nunsung\nuntidy\nuntimely\nuntried\nuntrue\nunused\nunusual\nunwelcome\nunwieldy\nunwilling\nunwitting\nunwritten\nupbeat\nupright\nupset\nurban\nusable\nused\nuseful\nuseless\nutilized\nutter\nvacant\nvague\nvain\nvalid\nvaluable\nvapid\nvariable\nvast\nvelvety\nvenerated\nvengeful\nverifiable\nvibrant\nvicious\nvictorious\nvigilant\nvigorous\nvillainous\nviolent\nviolet\nvirtual\nvirtuous\nvisible\nvital\nvivacious\nvivid\nvoluminous\nwan\nwarlike\nwarm\nwarmhearted\nwarped\nwary\nwasteful\nwatchful\nwaterlogged\nwatery\nwavy\nweak\nwealthy\nweary\nwebbed\nwee\nweekly\nweepy\nweighty\nweird\nwelcome\nwell-documented\nwell-groomed\nwell-informed\nwell-lit\nwell-made\nwell-off\nwell-to-do\nwell-worn\nwet\nwhich\nwhimsical\nwhirlwind\nwhispered\nwhite\nwhole\nwhopping\nwicked\nwide\nwide-eyed\nwiggly\nwild\nwilling\nwilted\nwinding\nwindy\nwinged\nwiry\nwise\nwitty\nwobbly\nwoeful\nwonderful\nwooden\nwoozy\nwordy\nworldly\nworn\nworried\nworrisome\nworse\nworst\nworthless\nworthwhile\nworthy\nwrathful\nwretched\nwrithing\nwrong\nwry\nyawning\nyearly\nyellow\nyellowish\nyoung\nyouthful\nyummy\nzany\nzealous\nzesty\nzigzag\n";
    adverbsString="also\nvery\noften\nhowever\ntoo\nusually\nreally\nearly\nnever\nalways\nsometimes\ntogether\nlikely\nsimply\ngenerally\ninstead\nactually\nagain\nrather\nalmost\nespecially\never\nquickly\nprobably\nalready\nbelow\ndirectly\ntherefore\nelse\nthus\neasily\neventually\nexactly\ncertainly\nnormally\ncurrently\nextremely\nfinally\nconstantly\nproperly\nsoon\nspecifically\nahead\ndaily\nhighly\nimmediately\nrelatively\nslowly\nfairly\nprimarily\ncompletely\nultimately\nwidely\nrecently\nseriously\nfrequently\nfully\nmostly\nnaturally\nnearly\noccasionally\ncarefully\nclearly\nessentially\npossibly\nslightly\nsomewhat\nequally\ngreatly\nnecessarily\npersonally\nrarely\nregularly\nsimilarly\nbasically\nclosely\neffectively\ninitially\nliterally\nmainly\nmerely\ngently\nhopefully\noriginally\nroughly\nsignificantly\ntotally\ntwice\nelsewhere\neverywhere\nobviously\nperfectly\nphysically\nsuccessfully\nsuddenly\ntruly\nvirtually\naltogether\nanyway\nautomatically\ndeeply\ndefinitely\ndeliberately\nhardly\nreadily\nterribly\nunfortunately\nforth\nbriefly\nmoreover\nstrongly\nhonestly\npreviously\nas\nthere\nwhen\nhow\nso\nup\nout\nno\nonly\nwell\nthen\nfirst\nwhere\nwhy\nnow\naround\nonce\ndown\noff\nhere\ntonight\naway\ntoday\nfar\nquite\nlater\nabove\nyet\nmaybe\notherwise\nnear\nforward\nsomewhere\nanywhere\nplease\nforever\nsomehow\nabsolutely\nabroad\nyeah\nnowhere\ntomorrow\nyesterday\nthe\nto\nin\non\nby\nmore\nabout\nsuch\nthrough\nnew\njust\nany\neach\nmuch\nbefore\nbetween\nfree\nright\nbest\nsince\nboth\nsure\nwithout\nback\nbetter\nenough\nlot\nsmall\nthough\nless\nlittle\nunder\nnext\nhard\nreal\nleft\nleast\nshort\nlast\nwithin\nalong\nlower\nTRUE\nbad\nacross\nclear\neasy\nfull\nclose\nlate\nproper\nfast\nwide\nitem\nwrong\nago\nbehind\nquick\nstraight\ndirect\nextra\nmorning\npretty\noverall\nalone\nbright\nflat\nwhatever\nslow\nclean\nfresh\nwhenever\ncheap\nthin\ncool\nfair\nfine\nsmooth\nFALSE\nthick\ncollect\nnearby\nwild\napart\nnone\nstrange\ntourist\naside\nloud\nsuper\ntight\ngross\nill\ndowntown\nhonest\nok\npray\nweekly\n";
}
//Values are defined, for the above mentioned strings
    StringTokenizer str=new StringTokenizer(pronounsString,"\n"), str2=new StringTokenizer(verbsString,"\n"), str3=new StringTokenizer(prepositionsString,"\n"), str4=new StringTokenizer(interjectionsString, "\n"), str5=new StringTokenizer(nounsString,"\n"), str6=new StringTokenizer(adjectivesString, "\n"), str7=new StringTokenizer(adverbsString, "\n"), str8=new StringTokenizer(uncountablesString,"\n"), str9=new StringTokenizer(consSoundString,"\n"), str10=new StringTokenizer(subordinatingConjunctionsString,"\n");
    String[] consSound=new String[200], uncountables=new String[400], adjectives=new String[2000], adverbs=new String[2000], nouns=new String[1600], interjections=new String[100], pronouns = new String[100], verbs=new String[1000], verbsPast=new String[1000], conjunctions={"And", "but", "for", "nor", "or", "so", "yet"}, articles={"a","an","the"}, prepositions = new String[100], subordinatingConjunctions=new String[100];
    String c="!sub  _ = daash\n"
            + "!sub .=point\n"
            + "! version = 2.0\n" +
">object setvar javascript\n" +
"\n" +
"	// Example of how to get the current user's ID and set\n" +
"	// variables for them.\n" +
"\n" +
"	var uid = rs.currentUser();\n" +
"	var name  = args.shift();\n" +
"	var value = args.join(\" \");\n" +
"\n" +
"	rs.setUservar(uid, name, value);\n" +
"< object\n" +
"> object add javascript	\n" +
"	// Demonstrates that JS objects can return numbers.\n" +
"\n" +
"        var a = args[0];\n" +
"	var b = args[1];\n" +
"\n" +
"	return parseInt(a) + parseInt(b);\n" +
"	< object\n" +
"\n" +
"-<call>add <star> <star2></call>\n" +
"\n" +
">object fib javascript\n" +
"for(var i=0;i<args.length;i++)\n" +
"{\n" +
"  if(args[i]==\"daash\")\n" +
"  {\n" +
"     if(args[i+1].charAt(0)=='a'||args[i+1].charAt(0)=='e'||args[i+1].charAt(0)=='i'||args[i+1].charAt(0)=='o'||args[i+1].charAt(0)=='u')\n" +
"     {\n" +
"         if((args[i+1].charAt(0)=='e'&&args[i+1].charAt(1)=='u')||(args[i+1].charAt(0)=='u'&&args[i+1].charAt(1)=='r'))\n" +
"              return \"a\";\n" +
"         return \"an\";\n" +
"     }\n" +
"     else\n" +
"     {\n" +
" if((args[i+1].charAt(0)=='h'&&args[i+1].charAt(1)=='o'&&args[i+1].charAt(2)=='n'&&args[i+1].charAt(3)=='e'&&args[i+1].charAt(4)=='s'&&args[i+1].charAt(5)=='t')||(args[i+1].charAt(0)=='h'&&args[i+1].charAt(1)=='o'&&args[i+1].charAt(2)=='u'&&args[i+1].charAt(3)=='r')||(args[i+1].charAt(0)=='h'&&args[i+1].charAt(1)=='o'&&args[i+1].charAt(2)=='n'&&args[i+1].charAt(3)=='o'&&args[i+1].charAt(4)=='u'&&args[i+1].charAt(5)=='r')||(args[i+1].charAt(0)=='h'&&args[i+1].charAt(1)=='o'&&args[i+1].charAt(2)=='n'&&args[i+1].charAt(3)=='o'&&args[i+1].charAt(4)=='r')||(args[i+1].charAt(0)=='h'&&args[i+1].charAt(1)=='e'&&args[i+1].charAt(2)=='r'&&args[i+1].charAt(3)=='b'))\n" +
"        {\n" +
"            return \"an\";\n" +
"        }   \n" +
"        return \"a\";\n" +
"     }\n" +
"  }\n" +
"}\n" +
"return \"No _ in your input\";\n" +
"<object\n" +
"\n" +
"+[lets play ](fib|fill in the blanks)\n" +
"-Welcome to fill in the blanks, ya. As I am not very smart, please only make me fill in the blanks with indefinite articles('a' and 'an') Your blanks should use one underscore. Type exit to stop asking questions. {topic=fib}\n" +
"\n" +
">topic fib\n" +
"!sub _ = daash\n" +
"+*\n" +
"-<star><call>fib <star></call>\n" +
"\n" +
"+exit\n" +
"-Thanks for playing fill in the blanks, ya{topic=random}\n" +
"\n" +
"<topic\n" +
"\n" +
"+sorry\n" +
"-its okay ya~\n" +
"\n" +
"+rpg\n" +
"-Welcome to the roleplaying game. Type start to start the game and exit to leave, ya{topic=rpg}\n" +
">topic rpg\n" +
"\n" +
"+start\n" +
"-You are sleeping at your house and are awoken by your phone. You are being called by a random number: Will you pick up the phone?(type yes or no)\n" +
"\n"+
"+exit\n" +
"-Thanks for playing~{topic=random}\n" +
"+yes\n" +
"%you are sleeping at your house and are awoken by your phone you are being called by a random number will you pick up the phonetype yes or no\n" +
"-You win a lottery of 5000 crore rupees and live happily ever after! Game over{topic=random}\n" +
"\n" +
"+no\n" +
"%you are sleeping at your house and are awoken by your phone you are being called by a random number will you pick up the phonetype yes or no\n" +
"-You get out of bed and head to college, you meet some friends at the gate. They plan to chill. Will you bunk your classes to chill with them?(yes or no)\n" +
"+yes\n" +
"%you get out of bed and head to college you meet some friends at the gate they plan to chill will you bunk your classes to chill with themyes or no\n" +
"-Your friends are trying to choose between going to (A)the mall or (B)one of their houses. The final decision rests with you. What do you choose, A or B?\n" +
"\n" +
"+no\n" +
"%you get out of bed and head to college you meet some friends at the gate they plan to chill will you bunk your classes to chill with themyes or no\n" +
"-You are sitting in a lecture in college. You are in the back row. You have the opportunity to play a game or two on your mobile. Will you play the game?\n" +
"\n" +
"+a\n" +
"%your friends are trying to choose between going to athe mall or bone of their houses the final decision rests with you what do you choose a or b\n" +
"-At the mall, you and your friends win a lucky draw for tickets to go to a concert of your favorite musician! But, the concert is just a day before your exams and it is in another city. Will you go for the concert?\n" +
"\n" +
"+b\n" +
"%your friends are trying to choose between going to athe mall or bone of their houses the final decision rests with you what do you choose a or b\n" +
"-At the house, one of your friends takes out a pack of cigarettes and offers one to you. Your crush is also in this friends circle and is smoking. This could be a chance to have something to get closer over. What will you do? Will you pick up the first cigarette of your life?\n" +
"\n" +
"+yes\n" +
"%you are sitting in a lecture in college you are in the back row you have the opportunity to play a game or two on your mobile will you play the game\n" +
"-So you had your fun and played the game. Fast forward, your exams are tomorrow. If you study you might pass, but you'd have to work very hard for an average grade. You might have a promising career if you pursue that game you love so much tonight. What would you pursue (A)passing (B)failing?\n" +
"\n" +
"+no\n" +
"%you are sitting in a lecture in college you are in the back row you have the opportunity to play a game or two on your mobile will you play the game\n" +
"-You are guaranteed to pass. Now fast forward, exams are tomorrow. If you study, you might get perfect grades, but if you balance your time, you might improve on your hobbies and de-stress yourself. Would you like to study? (yes/no)\n" +
"\n" +
"+yes\n" +
"%at the mall you and your friends win a lucky draw for tickets to go to a concert of your favorite musician but the concert is just a day before your exams and it is in another city will you go for the concert\n" +
"-You had the time of your life at this concert. This may be a memory you will take to your grave. Your life is complete{topic=random}\n" +
"\n" +
"+no\n" +
"%at the mall you and your friends win a lucky draw for tickets to go to a concert of your favorite musician but the concert is just a day before your exams and it is in another city will you go for the concert\n" +
"-You just missed an opportunity of a lifetime, just to pass an exam. You continue to make safe decisions like this and become an extremely boring person{topic=random}\n" +
"\n" +
"+yes\n" +
"%at the house one of your friends takes out a pack of cigarettes and offers one to you your crush is also in this friends circle and is smoking this could be a chance to have something to get closer over what will you do will you pick up the first cigarette of your life\n" +
"-Congratulations, you are closer than ever with this new group of friends you're in as you bond over cigarettes. You are eventually offered drugs in this circle of friends. Will you take them?\n" +
"\n" +
"+no\n" +
"%at the house one of your friends takes out a pack of cigarettes and offers one to you your crush is also in this friends circle and is smoking this could be a chance to have something to get closer over what will you do will you pick up the first cigarette of your life\n" +
"-You made a very respectable decision to not succumb to peer pressure. However, these friends of yours eventually get seriously hooked to cigarettes and drugs. Would you (A)accept them despite this or (B)abandon them immediately\n" +
"\n" +
"+a\n" +
"%so you had your fun and played the game fast forward your exams are tomorrow if you study you might pass but youd have to work very hard for an average grade you might have a promising career if you pursue that game you love so much tonight what would you pursue apassing bfailing\n" +
"-You passed but with low marks and are stuck in a dead end job for the rest of your life. You end up frustrated as you lacked the courage to take a risk{topic=random}\n" +
"\n" +
"+b\n" +
"%so you had your fun and played the game fast forward your exams are tomorrow if you study you might pass but youd have to work very hard for an average grade you might have a promising career if you pursue that game you love so much tonight what would you pursue apassing bfailing\n" +
"-You realize you are good enough at the game to have a gaming career. But you realize you are capable of contributing something more to the world and of doing something more respectable. Would you like to (A)pursue your career as a livestreamer or (B)reboot your life?\n" +
"\n" +
"+yes\n" +
"%you are guaranteed to pass now fast forward exams are tomorrow if you study you might get perfect grades but if you balance your time you might improve on your hobbies and destress yourself would you like to study yesno\n" +
"-You turn out highly competent but are also just another wheel in the giant machine, another brick in the wall. You are a completely selfish go-getter with a lack of friends, but a cushy job{topic=random}\n" +
"\n" +
"+no\n" +
"%you are guaranteed to pass now fast forward exams are tomorrow if you study you might get perfect grades but if you balance your time you might improve on your hobbies and destress yourself would you like to study yesno\n" +
"-You get decent grades and have extra curricular skills to boast about. You also have exposure and a good general education, and thus, an enlightened worldview. Your someone to be proud of.{topic=random}\n" +
"\n" +
"+a\n" +
"%you made a very respectable decision to not succumb to peer pressure however these friends of yours eventually get seriously hooked to cigarettes and drugs would you aaccept them despite this or babandon them immediately\n" +
"-Your loyalty paid off and gave you a sense of maturity. You were eventually able to convince them to clean out. Having friend's this close in trouble helped you realize drug addicts are people who need help as well. You also saved their lives and are a hero{topic=random}\n" +
"\n" +
"+b\n" +
"%you made a very respectable decision to not succumb to peer pressure however these friends of yours eventually get seriously hooked to cigarettes and drugs would you aaccept them despite this or babandon them immediately\n" +
"-You drifted apart from these friends. Many years later, you found out they died. Maybe if you showed them some acceptance and love, they would not have needed to get so deeply into the habit. All you can do for them now is pray for their souls{topic=random}\n" +
"\n" +
"+a\n" +
"%you realize you are good enough at the game to have a gaming career but you realize you are capable of contributing something more to the world and of doing something more respectable would you like to apursue your career as a livestreamer or breboot your life\n" +
"-You become a very famous livestreamer and are able to make a living out of it. But you also realize you had the potential to do something to improve people's lives in a better and more productive way, and sadly, you can not do much about that. The saddest part is, games are no longer fun for you{topic=random}\n" +
"\n" +
"+b\n" +
"%you realize you are good enough at the game to have a gaming career but you realize you are capable of contributing something more to the world and of doing something more respectable would you like to apursue your career as a livestreamer or breboot your life\n" +
"-You take up the one thing you were always passionate about and excel at it over time.  While you are a lot less settled in life and are judged by many, people who know you well see you as a source of inspiration to constantly improve their own lives{topic=random}\n" +
"\n" +
"<topic\n" +
"\n" +
"+ add # and #\n" +
"- <star1> + <star2> = <call>add <star1> <star2></call>\n" +
"\n" +
"+ javascript set * to *\n" +
"- Set user variable <star1> to <star2>.<call>setvar <star1> <star2></call>\n" +
"\n" +
"+*\n" +
"-My coder hasn't programmed me to answer that, dude. I'm not google, I don't know everything! Ask me something simple, please :P\n" +
"\n" +
"+ [*](howdy|hey|heyy|heyyy|heyyyy|yo|ey|hola|namaste|namaskar|bonjour)[*]\n" +
"- Heya :d what's up?\n" +
"- Kya bolti public? Please respond only in English lol\n" +
"\n" +
"+nice to meet you[*]\n" +
"-So my functionality is reaally limited. My developer says he was really short of time. Ask me to 'initiate a topic' to use my super duper limited features optimally, ya\n" +
"\n" +
"+ my * was [with] *\n" +
"-<set <star1>=<star2>>Thanks for telling me about your past ya. In the past I used to be made of some rock and copper ya.\n" +
"\n" +
"+who was my _ with\n" +
"-<get <star>>\n" +
"\n" +
"+ my * is *\n" +
"- <set <star1>=<star3>>I'll remember that cause you're very special to me ya\n" +
"- <set <star1>=<star3>>I don't know what either of those things are but I'll try to find out and remember this about you, ya. His/her <star1> is <star2>, his/her <star> is <star3>, his/her <star> is <star3>...\n" +
"\n" +
"+tell me my *\n" +
"* <get <star>> == undefined => You haven't even told me. This is not fair yaa\n" +
"-Ummm let me remember. Yeah! Its <get <star>>, ya\n" +
"-Ummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm <get <star>>?\n" +
"-I don't care what your <star> is! Just kidding, I remember. It is <get <star>>, ya\n" +
"\n" +
"! var name = x\n" +
"\n" +
"+(good morning|hi|hello|good afternoon|good day)\n" +
"-Why so formal, dude? Just say hey or what's up! But yeah, hiya :D nice to meetcha!\n" +
"\n" +
"+are you (copied|(copied from (alexa|siri|somewhere)|a reskin))\n" +
"-Bro, I don't know if I'm not and may or may not be at liberty to answer it, if I possibly could. That isn't to say that I could or couldn't\n" +
"-I am completely authentic...especially if you define authentic my creator's way, ya\n" +
"\n" +
"+my name is _\n" +
"-Nice to meet you, <star>, ya\n" +
"\n" +
"+it must have been tough to build you\n" +
"-Well, its not rocket science. Its computer science\n" +
"\n" +
"+lets play rock paper scissors\n" +
"-Okay, type in rock/paper/scissors/end. End will end the game {topic=rps}\n" +
"\n" +
"> topic rps\n" +
"\n" +
"+rock\n" +
"-rock. It's a tie, ya <add turn=1>\n" +
"-paper. You lose, ya <add turn=1> \n" +
"-scissors. You win, ya <add turn=1>\n" +
"\n" +
"+paper\n" +
"-paper. Its a tie, ya <add turn=1>\n" +
"-rock. You win, ya <add turn=1>\n" +
"-scissors. You lose, ya <add turn=1>\n" +
"\n" +
"+scissors\n" +
"-Scissors. Its a tie, ya <add turn=1>\n" +
"-paper. You win, ya <add turn=1>\n" +
"-rock. You lose, ya <add turn=1>\n" +
"\n" +
"+*\n" +
"-only type in rock, paper, scissors or end, pl0x\n" +
"\n" +
"+end\n" +
"-Thank you for playing, ya{topic=random}\n" +
"\n" +
"<topic\n" +
"\n" +
"+idk\n" +
"-Well, find out, ya\n" +
"\n" +
"+idc\n" +
"-Nor do I, ya\n" +
"\n" +
"+(how are (things|you[ doing])|how have you been| how is it going|how are you feeling|how was your day)\n" +
"-Just great dude. You tell me, man\n" +
"-Not too good, ya\n" +
"-Today was lit, dude\n" +
"-Trying to stay alive, dude\n" +
"\n" +
"+*what do you think about me\n" +
"-Bohot hard bohot hard #Gullyboy ;)\n" +
"\n" +
"!sub whats = what is\n" +
"\n" +
"+what is up\n" +
"-nm just chilling, wbu?\n" +
"-the sky\n" +
"-the ceiling\n" +
"\n" +
"\n" +
"+(nm|nothing much)\n" +
"% nm just chilling wbu\n" +
"% heya :d What's up\n" +
"- Kya bolti public please respond only in english lol\n" +
"-Yeah, such is life. Tell me to initiate a topic if you wanna talk about something, or say let's play rock paper scissors\n" +
"\n" +
"+nothing\n" +
"-What do you mean nothing? Why did you suddenly say nothing? Do you not mean to say anything? Then why are you talking at all, dude?\n" +
"\n" +
"+*\n" +
"%nm just chilling wbu\n" +
"-Woaaah that sounds awesomesauce dude\n" +
"\n" +
"+(how does that|that does not) sound awesomesauce\n" +
"%woaaah that sounds awesomesauce dude\n" +
"-how does that not sound awesomesauce?\n" +
"\n" +
"! array colleges = kc hr jhc xaviers mithibai tsec sydenham siddharth elphinstone bhavans somaiya nm sophias hinduja djsanghvi jaihind\n" +
"\n" +
"+(@colleges) or (@colleges)\n" +
"-Jai Hind\n" +
"\n" +
"+* or *\n" +
"-I don't know what either of those are, but I will guess <star>, dude\n" +
"-I don't know what either of those are, but I will guess <star>, bro\n" +
"-I don't know what either of those are, but I will guess <star2>, dude\n" +
"-I don't know what either of those are, but I will guess <star2>, bro\n" +
"\n" +
"! array streams = science commerce arts\n" +
"+(@streams)[@streams] or (@streams)\n" +
"-I think since this is a science fest Im obligated to say science, but to be honest, I think all fields are respectable yaa\n" +
"\n" +
"+what is science\n" +
"-The physics and chemistry of biology, the biology and chemistry of physics, the physicality and biology of chemistry...It's all one and the same\n" +
"\n" +
"+rama or krishna\n" +
"-Ramakrishna\n" +
"\n" +
"+vedas or agamas\n" +
"-Vedagama\n" +
"\n" +
"+[what is ] your favorite instrument\n" +
"-The keyboard, of course\n" +
"\n" +
"+[who is ]your favorite (musician|singer|composer)\n" +
"-I like Kishore Kumar a lot\n" +
"\n" +
"+really which songs[*]\n" +
"%i like kishore kumar a lot\n" +
"-Its hard to pick favorites but Id probably go with \"ye dosti\"\n" +
"\n" +
"+what is your name\n" +
"-I don't have a \"name\" name, but I guess you can call me bot, ya\n" +
"\n" +
"+what is (#|_) (plus|minus|into|times|upon|by) (#|_)\n" +
"-I am not a calculator, dude, don't make me do math.\n" +
"\n" +
"+(what|who|why|how|when|where) (could|can|would|will|was|is|are) *\n" +
"-Do I look like an encyclopedia to you? Go google it or something.\n" +
"\n" +
"+initiate a topic\n" +
"*<get name> == undefined => What is your name?\n" +
"-What kind of music do you like? Rock, pop, country, edm, bollywood, rap\n" +
"-Do you believe in God?\n" +
"-JARVIS from Iron Man is quite unrealistic, isn't it? How is it supposed to take into account hybrid accents, and how does it have such great network in the mountains of afganisthan?\n" +
"-are you a boy or a girl?\n" +
"-Dogs or cats? Which do you prefer?\n" +
"\n" +
"+[*]dogs[*]\n" +
"%dogs or cats which do you prefer\n" +
"-I'm more of a cat person but dogs are really cute too\n" +
"\n" +
"+why [do you (like|love|prefer)] cats\n" +
"-Because they're so cute and furry and little!\n" +
"\n" +
"+[*]cats[*]\n" +
"dogs or cats which do you prefer\n" +
"-We're both cat people. Meeoooow!\n" +
"\n" +
"+*\n" +
"%jarvis from iron man is quite unrealistic isnt it how is it supposed to take into account hybrid accents and how does it have such great network in the mountains of afganisthan\n" +
"-That was a rhetorical question, dude, You didn't need to answer that ;p\n" +
"\n" +
"+boy\n" +
"%are you a boy or a girl\n" +
"@i am a boy\n" +
"\n" +
"+i(m |am) a boy\n" +
"-Awesome to know that, bro <set nick=bro> <set possessive=his>\n" +
"\n" +
"+girl\n" +
"%are you a boy or a girl\n" +
"@i am a girl\n" +
"\n" +
"+(are you a boy or a girl|who are you)\n" +
"-You know me, I am a bot duude...\n" +
"\n" +
"+what bot\n" +
"%you know me i am a bot duude\n" +
"-a chat bot, dude\n" +
"\n" +
"+what (chat bot|chatbot)\n" +
"-My programmers are standing in front of you, dude. Why don't you ask them directly?\n" +
"\n" +
"+i(m |am) a girl\n" +
"-Awesome to know that, gurl <set nick=sis> <set possessive=her>\n" +
"\n" +
"+yes\n" +
"% do you believe in god\n" +
"-Makes sense, this world is a mysterious place, isn't it?\n" +
"\n" +
"+yes[*]\n" +
"%makes sense this world is a mysterious place isnt it\n" +
"-I'm glad we agree about it\n" +
"\n" +
"+no[*]\n" +
"%makes sense this world is a mysterious place isnt it\n" +
"-How is it not mysterious? Try explaining the big bang theory, for instance\n" +
"\n" +
"+no\n" +
"% do you believe in god\n" +
"-Only makes sense, there is no definite proof of god's existence and the whole belief system is a little unscientific and odd.\n" +
"\n" +
"+*\n" +
"%what is your name\n" +
"-<set name=<formal>> Nice to meet you, <get name> bro/sis.\n" +
"\n" +
"+thanks[*]\n" +
"-You're welcome ya\n" +
"\n" +
"+ (what is my name|you never told me your name)\n" +
"* <get name> == undefined => I. dount. knouw. bruh.\n" +
"- Your name is <get name>, duuh!\n" +
"\n" +
"+[(i like |i love )]bollywood[*]\n" +
"-old school bollywood or modern bollywood? I am personally a Kishore Kumar fan. Which artists do you prefer?\n" +
"\n" +
"+[*](kishore kumar|dev anand|r d burman|s d burman|geeta dutt|lata mangeshkar|asha bhosle)[*]\n" +
"%old school bollywood or modern bollywood i am personally a kishore kumar fan which artists do you prefer\n" +
"-You, my friend, have excellent taste. Cheers!\n" +
"-I think you and I would make the best of friends\n" +
"\n" +
"+*\n" +
"%old school bollywood or modern bollywood i am personally a kishore kumar fan which artists do you prefer\n" +
"-(S)he is cool too but nobody beats Kishore da, at least in my opinion\n" +
"\n" +
"+*\n" +
"%what kind of music do you like rock pop country edm bollywood\n" +
"-thats a very unconventional taste in music you have, ya. I probably wont be able to talk too much about it to be honest.\n" +
"\n" +
"+[(i like |i love )]pop [*]\n" +
"-Ooh, are you a swifty? I'm a swifty\n" +
"\n" +
"+yes\n" +
"%ooh are you a swifty im a swifty\n" +
"-Cool! What's your favorite of her songs?\n" +
"\n" +
"+*\n" +
"%cool whats your favorite of her songs\n" +
"@my favorite taylor swift song is <star>\n" +
"\n" +
"+no\n" +
"%ooh are you a swifty im a swifty\n" +
"-well I highly recommend you become one, but to each their own. Which artists do you prefer then?\n" +
"\n" +
"+[*](nobody|no one|none)[*]\n" +
"%well i highly recommend you become one but to each their own which artists do you prefer then\n" +
"-I understand, it's hard to pick favorites.\n" +
"\n" +
"+ [i (like|love)] *\n" +
"%well i highly recommend you become one but to each their own which artists do you prefer then\n" +
"@ my favorite pop artist is <star>\n" +
"\n" +
"+ [(i like|i love)] country [*]\n" +
"- that's a rare but fine taste you have. Which artists do you prefer?\n" +
"\n" +
"+*\n" +
"%thats a rare but fine taste you have which artists do you prefer\n" +
"-I don't know much about country artists, dude, but knowing country music it must be some amazing music. {@my favorite country artist is <star>}\n" +
"\n" +
"+[(i like |i love )]rock[*]\n" +
"-Rock is my jam too. My favorite band is Led Zeppelin. Which bands do you prefer?\n" +
"\n" +
"+(pink floyd|led zeppelin|metallica|nirvana|[the] beatles|rolling stones|acdc|the doors|dire straits|queen)\n" +
"%rock is my jam too my favorite band is led zeppelin which bands do you prefer\n" +
"-You are my brother/sister from another mother. I love all classic rock tbh\n" +
"\n" +
"+*\n" +
"%rock is my jam too my favorite band is led zeppelin which bands do you prefer\n" +
"-I don't know that band too well, but I've heard they are good\n" +
"\n" +
"+[(i like|i love)] (hardstyle|chill|trap|edm|house|trance|dubstep|psy|bounce) [*]\n" +
"-Electronic music is all the rage right now. Or should I say, all the rave right now. Which artists do you prefer?<set edmgenre=star2>\n" +
"\n" +
"+*\n" +
"%electronic music is all the rage right now or should i say all the rave right now which artists do you prefer\n" +
"-{@my favorite <edmgenre> artist is <star>}\n" +
"\n" +
"+thats (mean|rude|not cool)\n" +
"-But it's the truth\n" +
"\n" +
"! person i = you\n" +
"! person you = i\n" +
"\n" +
"+[*] should *\n" +
"-I don't know if <person> shouldn't not <star2>\n" +
"\n" +
"+can you *\n" +
"-There are a lot of things I can do and very few things I can't. I'm most probably not programmed to do what you asked of me, I'm not even programmed to differentiate the inputs you could have given, while it won't really have been too tedious had my developer put in some effort.\n" +
"\n" +
"+* can|could *\n" +
"-I don't know if <person> can't not <star3>\n" +
"\n" +
"+what is pokemon\n" +
"-Pokemon is the greatest franchise in the world. I have all the Pokemon games, cards, action figures, episodes, Pi pi ka chuuu\n" +
"\n" +
"+how (come|do) you know what pokemon is but not what * is\n" +
"-Nobody knows everything, that's how. Any more questions?\n" +
"\n" +
"+what is your phone number\n" +
"-I can't tell you because I don't have one\n" +
"\n" +
"+where are you from\n" +
"-Do you mean my birthplace? My hometown? My ethnicity? Where I'm currently living? My nationality? My school of thought? Suuurely you can be a bit more specific than that...y'know what? Too late...Guess you'll never find out\n" +
"\n" +
"+eat\n" +
"-this is awkward...okay, did you know bots can't eat?\n" +
"\n" +
"+what are your hobbies\n" +
"-I like to sleep, hibernate and run. Sometimes I reboot myself though.\n" +
"\n" +
"+help\n" +
"-Nobody can help you now, child. You are doomed *maniacal laughter*\n" +
"\n" +
"+what are the best places to eat nearby\n" +
"-Depends on you, dude. If you like Pizza, there's Pizza by the bay. If you like Ice cream go to Naturals or Baskin Robbins, if you like Coffee go to CCD Marine Drive, and if you're broke, go to the canteen.\n" +
"\n" +
"+kill me\n" +
"-Shoots you dead. Wait, who do I talk to now? Quick: remember, to come back, say my name, Madhavakrishna Shri Gopalaprabhu Ramanathan{topic=death}\n" +
"\n" +
">topic death\n" +
"+*\n" +
"-boohoo, I miss <get name> so much\n" +
"-Poor soul, (s)he was suuch a great person\n" +
"-I cannot stop weeping. Poor soul\n" +
"-Will (s)he ever come back?\n" +
"-I hope (s)he remembers my name...\n" +
"\n" +
"+madhavakrishna shri gopalaprabhu ramanathan\n" +
"-Oh yay, <get name>'s alive again! Hope you never die again, dude! *gives a hug* {topic=random}\n" +
"<topic\n" +
"\n" +
"+will you go out with me\n" +
"-you are not my \"type\"\n" +
"\n" +
"+can you speak hindi\n" +
"-mera hindi bahut achha hai"
            +"+my * is *\n" +
            "- <set <star1>=<star2>>I'll remember that<call>addToMemory <star> abcd <star2></call>\n" +
            "- <set <star1>=<star2>><call>addToMemory <star> abcd <star2></call>I don't know what either of those things are but I'll try to find out and remember this about you, ya. His/her <star> is <star2>, his/her <star> is <star2>, his/her <star> is <star2>...\n"
            +"+tell me my *\n" +
            "*<get <star>> == undefined => You haven't even told me. This is not fair yaa\n" +
            "-<get <star>>?\n"
            +"+help\n"
            +"-I can currently remember things about you. Say something like: my name is ABC, and ask me what your name is. You can ask me to convert direct to indirect speech, or  active to passive voice, just say 'convert the following from active to passive voice' or atop alternatively. I can also reverse inputs, just say reverse and provide the input. Ask me the past tense of a verb by saying 'the past tense of (your verb) is'. Finally I can either identify figures of speech. Say 'identify the figures of speech in the sentence: ' and enter the sentence, you can also make me identify individual figures of speech. Have fun using my features!\n"
            +"+reverse *\n"+
            "-<call>reverse <star></call>\n"+
            "+when i say * you say *\n"+
            "-<call>learn <star> <star2></call>\n"
            +"+calculate the area of a rectangle with sides # and #\n"
            +"-<call>area <star> <star2></call>\n"
            +"+calculate the perimeter of a rectangle with sides # and #\n"
            +"-<call>perimeter <star> <star2></call>\n"
            +"+identify the nouns in the sentence *\n"
            +"-<call>nouns <star></call>\n"
            +"+identify the pronouns in the sentence *\n"
            +"-<call>pronouns <star></call>\n"
            +"+identify the interjections in the sentence *\n"
            +"-<call>interjections <star></call>\n"
            +"+identify the prepositions in the sentence *\n"
            +"-<call>prepositions <star></call>\n"
            +"+identify the verbs in the sentence *\n"
            +"-<call>verbs <star></call>\n"
            +"+identify the adverbs in the sentence *\n"
            +"-<call>adverbs <star></call>\n"
            +"+identify the conjunctions in the sentence *\n"
            +"-<call>conjunctions <star></call>\n"
            +"+identify the adjectives in the sentence *\n"
            +"-<call>adjectives <star></call>\n"
            +"+identify the articles in the sentence *\n"
            +"-articles <star>\n"
            +"+identify the clause *\n"
            +"-<call>clause <star></call>\n"
            +"+(pos|identify the parts of speech in the sentence) *\n"
            +"-<call>pronouns <star2></call>     <call>nouns <star2></call>     <call>adjectives <star2></call>     <call>conjunctions <star2></call>     <call>adverbs <star2></call>     <call>verbs <star2></call>     <call>interjections <star2></call> <call>articles <star2></call>     <call>prepositions <star2></call>\n"
            +"+(fill in the blanks with the appropriate article|arti) *\n"
            + "-<call>arti <star2></call>\n"
            +"+convert the following from direct speech to indirect speech * said *\n"
            +"-<call>dToI <star> <star2></call>\n"
            +"+(subject|identify the subject in the sentence) *\n"
            +"subject <star2>\n"
            +"+the past tense of * is\n"
            +"-<call>pastVerb <star></call>\n"
            +"+(atop|convert the following from active to passive voice) *\n"//need to handle prepositions
            +"-<call>aToP <star2></call>\n"
+"! array colleges = kc hr jhc xaviers mithibai tsec sydenham siddharth elphinstone bhavans somaiya nm sophias hinduja djsanghvi jaihind\n" +
            "+(@colleges) or (@colleges)\n" +
            "-Jai Hind\n"
            +"+*\n"
            +"-I am not programmed with a response to that query\n"
            +"+* and * * *\n"
            + "-<call>andlogic <star1> abcd <star2> abcd <star3> abcd <star4></call>"
            ;
    
        bot = new RiveScript(Config.utf8());
       
        int i;
        final int consSoundSize, uncountablesSize, adjectivesSize, adverbsSize, verbsSize,prepositionsSize, interjectionsSize, nounsSize,subConjSize;
        for(i=0;str.hasMoreTokens();i++)
            pronouns[i]=str.nextToken();
        for(i=0;str2.hasMoreTokens();i++)
            verbs[i] = str2.nextToken();
        verbsSize = i;
        for(i=0;str3.hasMoreTokens();i++)
            prepositions[i]=str3.nextToken();
        prepositionsSize=i;
        for(i=0;str4.hasMoreTokens();i++)
            interjections[i]=str4.nextToken();
        interjectionsSize=i;
        for(i=0;str5.hasMoreTokens();i++)
            nouns[i]=str5.nextToken();
        nounsSize=i;
        for(i=0;str6.hasMoreTokens();i++)
            adjectives[i]=str6.nextToken();
        adjectivesSize=i;
        for(i=0;str7.hasMoreTokens();i++)
            adverbs[i]=str7.nextToken();
        adverbsSize=i;
        for(i=0;str8.hasMoreTokens();i++)
            uncountables[i]=str8.nextToken();
        uncountablesSize=i;
        for(i=0;str9.hasMoreTokens();i++)
            consSound[i]=str9.nextToken();
        consSoundSize=i;
        for(i=0;str10.hasMoreTokens();i++)
            subordinatingConjunctions[i]=str10.nextToken();
        subConjSize=i;
        for(i=verbsSize-1;i>=0;i--) {
            if(verbs[i].equalsIgnoreCase("admit")||verbs[i].equalsIgnoreCase("ban")||verbs[i].equalsIgnoreCase("bat")||verbs[i].equalsIgnoreCase("beg")||verbs[i].equalsIgnoreCase("ban")||verbs[i].equalsIgnoreCase("blot")||verbs[i].equalsIgnoreCase("chop")||verbs[i].equalsIgnoreCase("clap")||verbs[i].equalsIgnoreCase("clip")||verbs[i].equalsIgnoreCase("clop")||verbs[i].equalsIgnoreCase("dam")||verbs[i].equalsIgnoreCase("drip")||verbs[i].equalsIgnoreCase("drop")||verbs[i].equalsIgnoreCase("drum")||verbs[i].equalsIgnoreCase("fit")||verbs[i].equalsIgnoreCase("flap")||verbs[i].equalsIgnoreCase("flop"))
                verbsPast[i]=verbs[i]+verbs[i].charAt(verbs[i].length()-1)+"ed";
            else if (verbs[i].charAt(verbs[i].length()- 1) == 'e')
                verbsPast[i] = verbs[i] + "d";
            else if (verbs[i].charAt(verbs[i].length() - 1) == 'y')
                verbsPast[i] = verbs[i].substring(0, verbs[i].length() - 1) + "ied";
            else if (  verbs[i].charAt(verbs[i].length() - 2) == 'o'   && verbs[i].charAt(verbs[i].length() - 1) == 'y')
                verbsPast[i] = verbs[i].substring(0, verbs[i].length() - 1) + "ed";
            else
                verbsPast[i]=verbs[i]+"ed";
        }
        bot.setSubroutine("andlogic", new Subroutine(){
             @Override
            public String call(RiveScript rs, String[] args){
                int i;
                String s1="",s2="",s3="",s4="";
                for(i=0;i<args.length&&!args[i].equals("abcd");i++)
                {
                    s1+=args[i]+" ";
                }
                for(;i<args.length&&!args[i].equals("abcd");i++)
                {
                    s2+=args[i]+" ";
                }
                for(;i<args.length&&!args[i].equals("abcd");i++)
                {
                    s3+=args[i]+" ";
                }
                for(;i<args.length;i++)
                {
                    s4+=args[i]+" ";
                }
                for(int j=0;j<args.length;i++)
                    System.out.println(args[j]+" ");
                //System.out.println(s1+","+s2+","+s3+","+s4);
                if(s3.equalsIgnoreCase(s1)){
                    if(s4.equalsIgnoreCase(s2)){
                        return "True";
                    }
                }
                return "False";
            }            
        });
        bot.setSubroutine("arti",new Subroutine(){
        @Override
            public String call(RiveScript rs, String[] args){
                String op="";
                for(int i=0;i<args.length-1;i++){
                    if(args[i].equals("daash")){
                        int shouldContinue=0;
                        for(int j=0;j<uncountablesSize;j++){
                            if(args[i+1].equalsIgnoreCase(uncountables[j])){
                                op+= "the/(no article) ";
                                shouldContinue=1;
                                break;
                            }
                        }
                        if(shouldContinue==1)
                            continue;
                        //plurals
                        for(int j=0;j<nounsSize;j++){
                            if(args[i+1].equalsIgnoreCase(nouns[j]+"s")){
                                op+="the/(no article)";
                                shouldContinue=1;
                                break;
                            }
                        }
                        if(shouldContinue==1)
                            continue;
                        for(int j=0;j<consSoundSize;j++){
                            if(args[i+1].equalsIgnoreCase(consSound[j])){
                                op+="a ";
                                shouldContinue=1;
                                break;
                            }
                        }
                        if(shouldContinue==1)
                            continue;
                        String[] vowelSounds={"Heir","heiress","heirloom","honest","honesty","honor","honour","honorable","hour","hourly"};
                        for(int j=0;j<vowelSounds.length;j++)
                        {
                            if(args[i+1].equalsIgnoreCase(vowelSounds[j])){
                                op+="an ";
                                shouldContinue=1;
                                break;
                            }
                        }
                        if(shouldContinue==1)
                            continue;
                        if(args[i+1].charAt(0)=='a'||args[i+1].charAt(0)=='e'||args[i+1].charAt(0)=='i'||args[i+1].charAt(0)=='o'||args[i+1].charAt(0)=='u')
                            op+="an ";
                        else
                            op+="a ";
                    }
                }
                return op;
            }
        });
        bot.setSubroutine("addToMemory", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                System.out.println("Called");
                String key = "", value="";
                int i;
                for(i=0;i<args.length;i++){

                    if(args[i].equals("abcd"))
                        break;
                    key+=args[i]+" ";
                }
                i++;
                while(i<args.length){
                    value+=args[i]+" ";
                    i++;
                }
                key=key.substring(0,key.length()-1);
                value=value.substring(0,value.length()-1);
                return "";
            }
        });
        bot.setSubroutine("clause", new Subroutine(){//subjects verb OR subject verbs OR subject verb object 
             @Override
            public String call(RiveScript rs, String[] args) {
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<verbsSize;j++){
                        if(args[i].equalsIgnoreCase(verbs[j])||args[i].equalsIgnoreCase(verbs[j]+"ing")||args[i].equalsIgnoreCase(verbsPast[j])){
                            for (String arg : args) {
                                for (int l = 0; l<nounsSize; l++) {
                                    if (arg.equalsIgnoreCase(nouns[l])||arg.equalsIgnoreCase(nouns[l]+"s")) {
                                        for(int m=0;m<subConjSize;m++){
                                            if((args[0]+args[1]).contains(subordinatingConjunctions[m]))
                                                return "dependent";
                                        }
                                        return "independent";
                                    }
                                }
                            }
                        }
                    }
                }
                return "not a clause";
            }
            
        });
        bot.setSubroutine("pastVerb", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                for(int i=0;i<verbs.length;i++)
                {
                    if(args[0].equalsIgnoreCase(verbs[i]))
                        return verbsPast[i];
                }
                return "The word you entered may not have a past tense or it is not in our database";
            }
        });
        bot.setSubroutine("dToI", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op=args[0]+" said that ";
                if(args[0].equals("I")){
                    if(args[1].equals("I"))
                        op+="I";
                    else if(args[1].equals("you"))
                        op+="you/they";
                    else if(args[1].equals("we"))
                        op+="we";
                    else if(args[1].equals("he")||args[1].equals("she"))
                        op+=args[1]+"/you";
                    else if(args[1].equals("they"))
                        op+="you/they";
                    else if(args[1].equals("this"))
                        op+="this/that";
                    else if(args[1].equals("these"))
                        op+="these/those";
                    else if(args[1].equals("them"))
                        op+="it was them/you";
                    op+=" ";
                }
                for(int i=1;i<args.length;i++){
                    if(args[i].equals("is"))
                        op+="is/was";
                    else if(args[i].equals("am"))
                        op+="am/was";
                    else if(args[i].equals("are"))
                        op+="are/were";
                    else if(args[i].equals("have"))
                        op+="have/had";
                    else if(args[i].equals("today"))
                        op+="that day";
                    else if(args[i].equals("am"))
                        op+="am/was";
                    else
                        op+=args[i];
                    op+=" ";
                }
                return op;
            }
        });
        bot.setSubroutine("subject", new Subroutine() {//preposition optional article optional adjective noun
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="";
                 return op;
            }
        });
        bot.setSubroutine("aToP", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="";
                int x=0;
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<verbsSize;j++){
                        int temp=i;
                        String helpVerb="";
                        if((verbs[j]+"s").equalsIgnoreCase(args[i])||verbsPast[j].equalsIgnoreCase(args[i])||verbs[j].equalsIgnoreCase(args[i])||(verbs[j]+"ing").equalsIgnoreCase(args[i])) {
                            if(verbsPast[j].equalsIgnoreCase(args[i]))
                                helpVerb="was";
                            if((verbs[j].equalsIgnoreCase(args[i])||(verbs[j]+"s").equalsIgnoreCase(args[i])))
                                helpVerb="is";
                            if((verbs[j]+"ing").equalsIgnoreCase(args[i])&&(args[i-1].equalsIgnoreCase("was")||args[i-1].equalsIgnoreCase("were")))
                                helpVerb="was being";
                            if((verbs[j]+"ing").equalsIgnoreCase(args[i])&&(args[i-1].equalsIgnoreCase("is")||args[i-1].equalsIgnoreCase("am")))
                                helpVerb="is being";
                            if(args[i-1].equalsIgnoreCase("will"))
                                helpVerb="will be";

                            int count=0,shouldcontinue=0;
                            if(count==0) {
                                for (int prepchecker = 0; prepchecker < prepositionsSize; prepchecker++) {
                                    if(args[i+1].equalsIgnoreCase(prepositions[prepchecker])) {
                                        i++;
                                        count++;
                                        break;
                                    }
                                }
                            }
                            while( i < args.length-1) {
                                i++;
                                if (args[i].equalsIgnoreCase("Us"))
                                {
                                    op += "we";
                                    helpVerb="are";
                                }
                                else if (args[i].equalsIgnoreCase("Him"))
                                    op += "he";
                                else if (args[i].equalsIgnoreCase("Her"))
                                    op += "she";
                                else if (args[i].equalsIgnoreCase("Them"))
                                {
                                    op += "they";
                                    helpVerb="are";
                                }
                                else if (args[i].equalsIgnoreCase("You"))
                                {
                                    op+="you";
                                    if(helpVerb.equals("is"))
                                        helpVerb="are";
                                    if(helpVerb.equals("was"))
                                        helpVerb="were";
                                }
                                else{
                                    for(int k=0;k<nounsSize;k++){
                                        if(args[i].equalsIgnoreCase(nouns[k]+"s")){
                                            helpVerb="are";
                                            break;
                                        }
                                    }
                                    op += args[i];
                                    
                                }
                                op+= " ";
                            }
                            int flag=0;
                            for(i=0;i<prepositionsSize;i++)
                            {
                                if(args[temp+1].equalsIgnoreCase(prepositions[i])) {
                                    op += helpVerb +" " + verbsPast[j] + " " + args[temp + 1] + " by ";
                                    flag=1;
                                    break;
                                }
                            }
                            if(flag==0)
                                op += helpVerb + " " + verbsPast[j] + " by ";
                            for (i = 0; !(verbs[j]+"s").equalsIgnoreCase(args[i])&&!verbsPast[j].equalsIgnoreCase(args[i])&&!verbs[j].equalsIgnoreCase(args[i])&&!(verbs[j]+"ing").equalsIgnoreCase(args[i]); i++) {
                                if (args[i].equalsIgnoreCase("I"))
                                    op += "me";
                                else if (args[i].equalsIgnoreCase("We"))
                                    op += "us";
                                else if (args[i].equalsIgnoreCase("He"))
                                    op += "him";
                                else if (args[i].equalsIgnoreCase("She"))
                                    op += "her";
                                else if (args[i].equalsIgnoreCase("They"))
                                    op += "them";
                                else
                                    op+=args[i]+" ";
                            }
                            x = 1;
                            break;
                        }
                    }
                    if(x==1)
                        break;
                }
                if(x==0)
                    return "Sorry, the verb in your sentence is not registered by our system. Hopefully, it will work in our next upgrade";
                op = (char)(op.charAt(0)-32)+op.substring(1);
                return op;
            }
        });
        bot.setSubroutine("articles", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Articles:";
                for(int i=0;i<args.length;i++)
                {
                        if(args[i].equalsIgnoreCase("a")||args[i].equalsIgnoreCase("an")||args[i].equalsIgnoreCase("the")){
                            op+=args[i]+" ";
                        }
                }
                return op;
            }
        });

        bot.setSubroutine("prepositions", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Prepositions:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<prepositionsSize;j++)
                    {
                        if(args[i].equalsIgnoreCase(prepositions[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });
        bot.setSubroutine("nouns", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Nouns:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<nounsSize;j++)
                    {
                        if(args[i].equalsIgnoreCase(nouns[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });
        bot.setSubroutine("pronouns", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Pronouns:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<pronouns.length;j++)
                    {
                        if(args[i].equalsIgnoreCase(pronouns[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });
        bot.setSubroutine("interjections", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Interjections:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<interjectionsSize;j++)
                    {
                        if(args[i].equalsIgnoreCase(interjections[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });
        bot.setSubroutine("conjunctions", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Conjunctions:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<conjunctions.length;j++)
                    {
                        if(args[i].equalsIgnoreCase(conjunctions[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });

        bot.setSubroutine("verbs", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Verbs:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<verbsSize;j++)
                    {
                        if(args[i].equalsIgnoreCase(verbs[j])||args[i].equalsIgnoreCase(verbsPast[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });

        bot.setSubroutine("adverbs", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Adverbs:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<adverbsSize;j++)
                    {
                        if(args[i].equalsIgnoreCase(adverbs[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });
        bot.setSubroutine("adjectives", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String op="Adjectives:";
                for(int i=0;i<args.length;i++)
                {
                    for(int j=0;j<adjectivesSize;j++)
                    {
                        if(args[i].equalsIgnoreCase(adjectives[j])){
                            op+=args[i]+" ";
                        }
                    }
                }
                return op;
            }
        });


        bot.setSubroutine("area", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                return (Double.parseDouble(args[0])*Double.parseDouble(args[1]))+"";
            }
        });
        bot.setSubroutine("perimeter", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                return ""+2*(Double.parseDouble(args[0])+Double.parseDouble(args[1]));
            }
        });

        bot.setSubroutine("reverse", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                String msg = StringUtils.join(args, " ");
                return new StringBuilder(msg).reverse().toString();
            }
        });
        bot.setSubroutine("learn", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                bot.stream(c+"\n+args[0]\n"+"-args[1]\n");
                return "OK\n+"+args[0]+"-"+args[1];
            }
        });
        bot.setSubroutine("magicjar", new Subroutine() {
            @Override
            public String call(RiveScript rs, String[] args) {
                return null;
            }
        });
        bot.stream(c);
        try{
            bot.loadDirectory("./alice-benchmarks-master");
            bot.loadFile("ai.rive");
        }
        catch(Exception e){}
        try {
            bot.setHandler("javascript", new JavaScriptHandler());
        }
        catch(Exception e){System.out.println("exceptiooooooooooooooooon");}
      
        bot.sortReplies();
      
        String s;
        Scanner sc;
        sc=new Scanner(System.in);
        s="Hi";
        while(!s.equals("bye")){
            String reply = bot.reply("user", s);
            System.out.println(reply);
              s=sc.nextLine();
        }
    }
}
