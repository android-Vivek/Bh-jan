package com.rajendra.bhajanaarti.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.rajendra.bhajanaarti.R


class Written_Aarti_Text : AppCompatActivity() {
    internal var product1 = "गणेश आरती-(Ganesh Aarti)"
    internal var product2 = "कृष्ण आरती- (Krishna Aarti)"
    internal var product3 = "संतोषी माता की आरती- (Santoshi Mata Aarti)"
    internal var product4 = "श्री साईं बाबा की आरती- (Sai Baba Aarti)"
    internal var product5 = "शनि देवजी की आरती- (Shani Dev Aarti)"
    internal var product6 = "दुर्गा जी की आरती- (Durga Aarti)"
    internal var product7 = "कालीमाता आरती- (Kali Mata Aarti)"
    internal var product8 = "लक्ष्मीजी की आरती- (Laxmi Mata Aarti)"
    internal var product9 = "शिव आरती- (Shiv Aarti)"
    internal var product10 = "बृहस्पति देवता की आरती- (Brihaspati Aarti)"
    internal var product11 = "जय अम्बे गौरी मैया जय श्यामा गौरी- (Jai ambe gauri maiya jai shyama gauri)"
    internal var Product12 = "दुर्गे दुर्घट भारी- (Durge Durghat Bhari)"
    internal var Product13 = "प्रार्थना- (Prayer)"
    internal var Product14 = "पपुष्पांजली- (Mantra pushpanjali)"

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_written__aarti__text)

        val mAdView = findViewById<View>(R.id.adView) as AdView
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val txtProduct = findViewById<View>(R.id.label) as TextView

        val i = intent
        // getting attached intent data
        val product = i.getStringExtra("product")

        // displaying selected product name

        if (product == product1) {

            txtProduct.text = "\n श्री गणेश जी की आरती (Ganesh Aarti)\n\n\n" +
                    "जय गणेश, जय गणेश, जय गणेश देवा .\n" +
                    "माता जाकी पार्वती, पिता महादेवा ॥\n" +
                    "जय गणेश, जय गणेश, जय गणेश देवा ॥\n\n" +
                    "एक दंत दयावंत, चार भुजाधारी .\n" +
                    "माथे पे सिंदूर सोहे, मूसे की सवारी ॥\n" +
                    "जय गणेश, जय गणेश, जय गणेश देवा ॥\n\n" +
                    "अंधन को आंख देत, कोढ़िन को काया .\n" +
                    "बांझन को पुत्र देत, निर्धन को माया ॥\n" +
                    "जय गणेश, जय गणेश, जय गणेश देवा ॥\n\n" +
                    "हार चढ़ै, फूल चढ़ै और चढ़ै मेवा .\n" +
                    "लड्डुअन को भोग लगे, संत करे सेवा ॥\n" +
                    "जय गणेश, जय गणेश, जय गणेश देवा ॥\n\n" +
                    "दीनन की लाज राखो, शंभु सुतवारी .\n" +
                    "कामना को पूर्ण करो, जग बलिहारी ॥\n" +
                    "जय गणेश, जय गणेश, जय गणेश देवा ॥\n"
        } else if (product == product2) {

            txtProduct.text = "\n कृष्ण आरती/ Krishna Aarti\n\n\n" +
                    "आरती कुंजबिहारी की, श्री गिरिधर कृष्णमुरारी की ॥\n\n" +
                    "गले में बैजंती माला, बजावै मुरली मधुर बाला।\n" +
                    "श्रवण में कुण्डल झलकाला, नंद के आनंद नंदलाला।\n" +
                    "गगन सम अंग कांति काली, राधिका चमक रही आली ।\n" +
                    "लतन में ठाढ़े बनमाली;भ्रमर सी अलक, कस्तूरी तिलक,\n" +
                    "चंद्र सी झलक;ललित छवि श्यामा प्यारी की ॥\n\n" +
                    "श्री गिरिधर कृष्णमुरारी की...\n" +
                    "कनकमय मोर मुकुट बिलसै, देवता दरसन को तरसैं ।\n" +
                    "गगन सों सुमन रासि बरसै;बजे मुरचंग, मधुर मिरदंग,\n" +
                    "ग्वालिन संग;अतुल रति गोप कुमारी की ॥\n\n" +
                    "श्री गिरिधर कृष्णमुरारी की...\n" +
                    "जहां ते प्रकट भई गंगा, कलुष कलि हारिणि श्रीगंगा ।\n" +
                    "स्मरन ते होत मोह भंगा;बसी सिव सीस, जटा के बीच,\n" +
                    "हरै अघ कीच;चरन छवि श्रीबनवारी की ॥\n\n" +
                    "श्री गिरिधर कृष्णमुरारी की...\n" +
                    "चमकती उज्ज्वल तट रेनू, बज रही वृंदावन बेनू ।\n" +
                    "चहुं दिसि गोपि ग्वाल धेनू;हंसत मृदु मंद,चांदनी चंद,\n" +
                    "कटत भव फंद;टेर सुन दीन भिखारी की ॥\n\n" +
                    "श्री गिरिधर कृष्णमुरारी की"
        } else if (product == product3) {
            txtProduct.text = "\nसंतोषी माता की आरती / Santoshi Mata Aarti\n\n\n" +
                    "जय संतोषी माता, मैया जय संतोषी माता ।\n" +
                    "अपने सेवक जन को, सुख संपति दाता ॥ जय ॥\n\n" +
                    "सुंदर चीर सुनहरी, मां धारण कीन्हो ।\n" +
                    "हीरा पन्ना दमके, तन श्रृंगार लीन्हो ॥ जय ॥\n\n" +
                    "गेरू लाल छटा छवि, बदन कमल सोहे ।\n" +
                    "मंद हँसत करूणामयी, त्रिभुवन जन मोहे ॥ जय ॥\n\n" +
                    "स्वर्ण सिंहासन बैठी, चंवर ढुरे प्यारे ।\n" +
                    "धूप, दीप, मधुमेवा, भोग धरें न्यारे ॥ जय ॥\n\n" +
                    " गुड़ अरु चना परमप्रिय, तामे संतोष कियो।\n" +
                    "संतोषी कहलाई, भक्तन वैभव दियो ॥ जय ॥\n\n" +
                    "शुक्रवार प्रिय मानत, आज दिवस सोही ।\n" +
                    "भक्त मण्डली छाई, कथा सुनत मोही ॥ जय ॥\n\n" +
                    "मंदिर जगमग ज्योति, मंगल ध्वनि छाई ।\n" +
                    "विनय करें हम बालक, चरनन सिर नाई ॥ जय ॥\n\n" +
                    "भक्ति भावमय पूजा, अंगीकृत कीजै ।\n" +
                    "जो मन बसे हमारे, इच्छा फल दीजै ॥ जय ॥\n\n" +
                    "दुखी, दरिद्री ,रोगी , संकटमुक्त किए ।\n" +
                    "बहु धनधान्य भरे घर, सुख सौभाग्य दिए ॥ जय ॥\n\n" +
                    "ध्यान धर्यो जिस जन ने, मनवांछित फल पायो ।\n" +
                    "पूजा कथा श्रवण कर, घर आनंद आयो ॥ जय ॥\n\n" +
                    "शरण गहे की लज्जा, राखियो जगदंबे ।\n" +
                    "संकट तू ही निवारे, दयामयी अंबे ॥ जय ॥\n\n" +
                    "संतोषी मां की आरती, जो कोई नर गावे ।\n" +
                    "ॠद्धिसिद्धि सुख संपत्ति, जी भरकर पावे ॥ जय ॥"
        } else if (product == product4) {
            txtProduct.text = "\nश्री साईं बाबा की आरती / (Sai Baba Aarti)\n\n\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे।\n" +
                    "भक्तजनों के कारण, उनके कष्ट निवारण॥\n\n" +
                    "शिरडी में अव-तरे, ॐ जय साईं हरे।\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे॥\n\n" +
                    "दुखियन के सब कष्टन काजे, शिरडी में प्रभु आप विराजे।\n" +
                    "फूलों की गल माला राजे, कफनी, शैला सुन्दर साजे॥\n\n" +
                    "कारज सब के करें, ॐ जय साईं हरे।\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे॥\n\n" +
                    "काकड़ आरत भक्तन गावें, गुरु शयन को चावड़ी जावें।\n" +
                    "सब रोगों को उदी भगावे, गुरु फकीरा हमको भावे॥\n\n" +
                    "भक्तन भक्ति करें, ॐ जय साईं हरे।\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे॥\n\n" +
                    "हिन्दु मुस्लिम सिक्ख इसाईं, बौद्ध जैन सब भाई भाई।\n" +
                    "रक्षा करते बाबा साईं, शरण गहे जब द्वारिकामाई॥\n\n" +
                    "अविरल धूनि जरे, ॐ जय साईं हरे।\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे॥\n\n" +
                    "भक्तों में प्रिय शामा भावे, हेमडजी से चरित लिखावे।\n" +
                    "गुरुवार की संध्या आवे, शिव, साईं के दोहे गावे॥\n\n" +
                    "अंखियन प्रेम झरे, ॐ जय साईं हरे।\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे॥\n\n" +
                    "ॐ जय साईं हरे, बाबा शिरडी साईं हरे।\n" +
                    "शिरडी साईं हरे, बाबा ॐ जय साईं हरे॥\n\n" +
                    "श्री सद्गुरु साईंनाथ महाराज की जय॥\n"
        } else if (product == product5) {
            txtProduct.text = "\nशनि देवजी की आरती (Shani Dev Aarti)\n\n\n" +
                    "जय जय श्री शनिदेव भक्तन हितकारी।\n" +
                    "सूरज के पुत्र प्रभु छाया महतारी॥ जय.॥\n\n" +
                    "श्याम अंक वक्र दृष्ट चतुर्भुजा धारी।\n" +
                    "नीलाम्बर धार नाथ गज की असवारी॥ जय.॥\n\n" +
                    "क्रीट मुकुट शीश रजित दिपत है लिलारी।\n" +
                    "मुक्तन की माला गले शोभित बलिहारी॥ जय.॥\n\n" +
                    "मोदक मिष्ठान पान चढ़त हैं सुपारी।\n" +
                    "लोहा तिल तेल उड़द महिषी अति प्यारी॥ जय.॥\n\n" +
                    "देव दनुज ऋषि मुनि सुमरिन नर नारी।\n" +
                    "विश्वनाथ धरत ध्यान शरण हैं तुम्हारी ॥जय.॥\n\n"
        } else if (product == product6) {
            txtProduct.text = "\nदुर्गा जी की आरती (Durga Aarti)\n\n\n" +

                    "जय अम्बे गौरी, मैया जय श्यामा गौरी तुम को निस दिन ध्यावत\n" +
                    "मैयाजी को निस दिन ध्यावत हरि ब्रह्मा शिवजी ।| जय अम्बे गौरी ॥\n\n" +

                    "माँग सिन्दूर विराजत टीको मृग मद को |मैया टीको मृगमद को\n" +
                    "उज्ज्वल से दो नैना चन्द्रवदन नीको|| जय अम्बे गौरी ॥\n\n" +

                    "कनक समान कलेवर रक्ताम्बर साजे| मैया रक्ताम्बर साजे\n" +
                    "रक्त पुष्प गले माला कण्ठ हार साजे|| जय अम्बे गौरी ॥\n\n" +

                    "केहरि वाहन राजत खड्ग कृपाण धारी| मैया खड्ग कृपाण धारी\n" +
                    "सुर नर मुनि जन सेवत तिनके दुख हारी|| जय अम्बे गौरी ॥\n\n" +

                    "कानन कुण्डल शोभित नासाग्रे मोती| मैया नासाग्रे मोती\n" +
                    "कोटिक चन्द्र दिवाकर सम राजत ज्योति|| जय अम्बे गौरी ॥\n\n" +

                    "शम्भु निशम्भु बिडारे महिषासुर घाती| मैया महिषासुर घाती\n" +
                    "धूम्र विलोचन नैना निशदिन मदमाती|| जय अम्बे गौरी ॥\n\n" +

                    "चण्ड मुण्ड शोणित बीज हरे| मैया शोणित बीज हरे\n" +
                    "मधु कैटभ दोउ मारे सुर भयहीन करे|| जय अम्बे गौरी ॥\n\n" +

                    "ब्रह्माणी रुद्राणी तुम कमला रानी| मैया तुम कमला रानी\n" +
                    "आगम निगम बखानी तुम शिव पटरानी|| जय अम्बे गौरी ॥\n\n" +

                    "चौंसठ योगिन गावत नृत्य करत भैरों| मैया नृत्य करत भैरों\n" +
                    "बाजत ताल मृदंग और बाजत डमरू|| जय अम्बे गौरी ॥\n\n" +

                    "तुम हो जग की माता तुम ही हो भर्ता| मैया तुम ही हो भर्ता\n" +
                    "भक्तन की दुख हर्ता सुख सम्पति कर्ता|| जय अम्बे गौरी ॥\n\n" +

                    "भुजा चार अति शोभित वर मुद्रा धारी| मैया वर मुद्रा धारी\n" +
                    "मन वाँछित फल पावत देवता नर नारी|| जय अम्बे गौरी ॥\n\n" +

                    "कंचन थाल विराजत अगर कपूर बाती| मैया अगर कपूर बाती\n" +
                    "माल केतु में राजत कोटि रतन ज्योती|| बोलो जय अम्बे गौरी ॥\n\n" +

                    "माँ अम्बे की आरती जो कोई नर गावे| मैया जो कोई नर गावे\n" +
                    "कहत शिवानन्द स्वामी सुख सम्पति पावे|| जय अम्बे गौरी ॥\n\n"
        } else if (product == product7) {
            txtProduct.text = "\nकालीमाता आरती (Kali Mata Aarti)\n\n\n" +
                    "मंगल की सेवा सुन मेरी देवा ,हाथ जोड तेरे द्वार खडे।\n" +
                    "पान सुपारी ध्वजा नारियल ले ज्वाला तेरी भेट धरेसुन।।\n\n" +
                    "जगदम्बे न कर विलम्बे, संतन के भडांर भरे।\n" +
                    "सन्तन प्रतिपाली सदा खुशहाली, जै काली कल्याण करे ।।\n\n" +
                    "बुद्धि विधाता तू जग माता ,मेरा कारज सिद्व रे।\n" +
                    "चरण कमल का लिया आसरा शरण तुम्हारी आन पडे।।\n\n" +
                    "जब जब भीड पडी भक्तन पर, तब तब आप सहाय करे।\n" +
                    "गुरु के वार सकल जग मोहयो, तरूणी रूप अनूप धरेमाता।।\n\n" +
                    "होकर पुत्र खिलावे, कही भार्या भोग करेशुक्र सुखदाई सदा।\n" +
                    "सहाई संत खडे जयकार करे ।।5।।\n\n" +
                    "ब्रह्मा विष्णु महेश फल लिये भेट तेरे द्वार खडेअटल सिहांसन।\n" +
                    "बैठी मेरी माता, सिर सोने का छत्र फिरेवार शनिचर।।\n\n" +
                    "कुकम बरणो, जब लकड पर हुकुम करे ।\n" +
                    "खड्ग खप्पर त्रिशुल हाथ लिये, रक्त बीज को भस्म करे।।\n\n" +
                    "शुम्भ निशुम्भ को क्षण मे मारे ,महिषासुर को पकड दले ।\n" +
                    "आदित वारी आदि भवानी ,जन अपने को कष्ट हरे ।।\n\n" +
                    "कुपित होकर दनव मारे, चण्डमुण्ड सब चूर करे।\n" +
                    "जब तुम देखी दया रूप हो, पल मे सकंट दूर करे।।\n\n" +
                    "सौम्य स्वभाव धरयो मेरी माता ,जन की अर्ज कबूल करे ।\n" +
                    "सात बार की महिमा बरनी, सब गुण कौन बखान करे।।\n\n" +
                    "सिंह पीठ पर चढी भवानी, अटल भवन मे राज्य करे।\n" +
                    "दर्शन पावे मंगल गावे ,सिद्ध साधक तेरी भेट धरे ।।\n\n" +
                    "ब्रह्मा वेद पढे तेरे द्वारे, शिव शंकर हरी ध्यान धरे।\n" +
                    "इन्द्र कृष्ण तेरी करे आरती, चॅवर कुबेर डुलाय रहे।।\n\n" +
                    "जय जननी जय मातु भवानी , अटल भवन मे राज्य करे।\n" +
                    "सन्तन प्रतिपाली सदा खुशहाली, मैया जै काली कल्याण करे।।\n\n"
        } else if (product == product8) {
            txtProduct.text = "\nलक्ष्मीजी की आरती (Laxmi Mata Aarti)\n\n\n" +
                    "महालक्ष्मी नमस्तुभ्यं, नमस्तुभ्यं सुरेश्र्वरी |\n" +
                    "हरिप्रिये नमस्तुभ्यं, नमस्तुभ्यं दयानिधे ॥\n\n" +
                    "ॐ जय लक्ष्मी माता मैया जय लक्ष्मी माता |\n" +
                    "तुमको निसदिन सेवत, हर विष्णु विधाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "उमा ,रमा,ब्रम्हाणी, तुम जग की माता |\n" +
                    "सूर्य चद्रंमा ध्यावत, नारद ऋषि गाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "दुर्गारुप निरंजन, सुख संपत्ति दाता |\n" +
                    "जो कोई तुमको ध्याता, ऋद्धि सिद्धी धन पाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "तुम ही पाताल निवासनी, तुम ही शुभदाता |\n" +
                    "कर्मप्रभाव प्रकाशनी, भवनिधि की त्राता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "जिस घर तुम रहती हो, ताँहि में हैं सद् गुण आता|\n" +
                    "सब सभंव हो जाता, मन नहीं घबराता॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "तुम बिन यज्ञ ना होता, वस्त्र न कोई पाता |\n" +
                    "खान पान का वैभव, सब तुमसे आता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "शुभ गुण मंदिर सुंदर क्षीरनिधि जाता|\n" +
                    "रत्न चतुर्दश तुम बिन ,कोई नहीं पाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "महालक्ष्मी जी की आरती ,जो कोई नर गाता |\n" +
                    "उँर आंनद समाा,पाप उतर जाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "स्थिर चर जगत बचावै ,कर्म प्रेर ल्याता |\n" +
                    "रामप्रताप मैया जी की शुभ दृष्टि पाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता....\n" +
                    "ॐ जय लक्ष्मी माता मैया जय लक्ष्मी माता |\n" +
                    "तुमको निसदिन सेवत, हर विष्णु विधाता ॥\n\n" +
                    "ॐ जय लक्ष्मी माता..\n"
        } else if (product == product9) {
            txtProduct.text = "\nशिव आरती (Shiv Aarti)\n\n" +
                    "ॐ जय जगदीश हरे, स्वामी जय जगदीश हरे।\n" +
                    "भक्त जनों के संकट, क्षण में दूर करे॥ ॐ जय जगदीश\n\n" +
                    "जो ध्यावे फल पावे, दुःख बिनसे मन का।\n" +
                    "सुख सम्पति घर आवे, कष्ट मिटे तन का॥ ॐ जय जगदीश\n\n" +
                    "मात पिता तुम मेरे, शरण गहूं मैं किसकी।\n" +
                    "तुम बिन और न दूजा, आस करूं मैं जिसकी॥ ॐ जय जगदीश\n\n" +
                    "तुम पूरण परमात्मा, तुम अंतरयामी।\n" +
                    "पारब्रह्म परमेश्वर, तुम सब के स्वामी॥ ॐ जय जगदीश\n\n" +
                    "तुम करुणा के सागर, तुम पालनकर्ता।\n" +
                    "मैं सेवक तुम स्वामी, कृपा करो भर्ता॥ ॐ जय जगदीश\n\n" +
                    "तुम हो एक अगोचर, सबके प्राणपति।\n" +
                    "किस विधि मिलूं दयामय, तुमको मैं कुमति॥ ॐ जय जगदीश\n\n" +
                    "दीनबंधु दुखहर्ता, तुम रक्षक मेरे।\n" +
                    "करुणा हाथ बढ़ाओ, द्वार पड़ा तेरे॥ ॐ जय जगदीश\n\n" +
                    "विषय विकार मिटाओ, पाप हरो देवा।\n" +
                    "श्रद्धा भक्ति बढ़ाओ, संतन की सेवा॥ ॐ जय जगदीश\n\n"
        } else if (product == product10) {
            txtProduct.text = "\nबृहस्पति देवता की आरती (Brihaspati Aarti)\n\n\n" +
                    "जय बृहस्पति देवा, ऊँ जय बृहस्पति देवा ।\n" +
                    "छि छिन भोग लगाऊँ, कदली फल मेवा ॥\n\n" +
                    "तुम पूरण परमात्मा, तुम अन्तर्यामी ।\n" +
                    "जगतपिता जगदीश्वर, तुम सबके स्वामी ॥\n\n" +
                    "चरणामृत निज निर्मल, सब पातक हर्ता ।\n" +
                    "सकल मनोरथ दायक, कृपा करो भर्ता ॥\n\n" +
                    "तन, मन, धन अर्पण कर, जो जन शरण पड़े ।\n" +
                    "प्रभु प्रकट तब होकर, आकर द्घार खड़े ॥\n\n" +
                    "दीनदयाल दयानिधि, भक्तन हितकारी ।\n" +
                    "पाप दोष सब हर्ता, भव बंधन हारी ॥\n\n" +
                    "सकल मनोरथ दायक, सब संशय हारो ।\n" +
                    "विषय विकार मिटाओ, संतन सुखकारी ॥\n\n" +
                    "जो कोई आरती तेरी, प्रेम सहत गावे ।\n" +
                    "जेठानन्द आनन्दकर, सो निश्चय पावे ॥\n\n"
        } else if (product == product11) {
            txtProduct.text = "\n जय अम्बे गौरी मैया जय श्यामा गौरी\n\n\n" +
                    "जय अम्बे गौरी, मैया जय श्यामा गौरी,\n" +
                    "तुमको निशदिन ध्यावत, हरि ब्रह्मा शिवरी।\n" +
                    "\n" +
                    "मांग सिंदूर विराजत, टीको मृगमद को,\n" +
                    "उज्ज्वल से दोउ नैना, चंद्रवदन नीको॥\n" +
                    "\n" +
                    "कनक समान कलेवर, रक्ताम्बर राजै,\n" +
                    "रक्तपुष्प गल माला, कंठन पर साजै॥\n" +
                    "\n" +
                    "केहरि वाहन राजत, खड्ग खप्पर धारी,\n" +
                    "सुर-नर-मुनिजन सेवत, तिनके दुखहारी॥\n" +
                    "\n" +
                    "कानन कुण्डल शोभित, नासाग्रे मोती,\n" +
                    "कोटिक चंद्र दिवाकर, सम राजत ज्योती॥\n" +
                    "\n" +
                    "शुंभ-निशुंभ बिदारे, महिषासुर घाती,\n" +
                    "धूम्र विलोचन नैना, निशदिन मदमाती॥\n" +
                    "\n" +
                    "चण्ड-मुण्ड संहारे, शोणित बीज हरे,\n" +
                    "मधु-कैटभ दोउ मारे, सुर भयहीन करे॥\n" +
                    "\n" +
                    "ब्रह्माणी, रूद्राणी, तुम कमला रानी,\n" +
                    "आगम निगम बखानी, तुम शिव पटरानी॥\n" +
                    "\n" +
                    "चौंसठ योगिनी मंगल गावत, नृत्य करत भैरों,\n" +
                    "बाजत ताल मृदंगा, अरू बाजत डमरू॥\n" +
                    "\n" +
                    "तुम ही जग की माता, तुम ही हो भरता,\n" +
                    "भक्तन की दुख हरता, सुख संपति करता॥\n" +
                    "\n" +
                    "भुजा चार अति शोभित, खडग खप्पर धारी,\n" +
                    "मनवांछित फल पावत, सेवत नर नारी॥\n" +
                    "\n" +
                    "कंचन थाल विराजत, अगर कपूर बाती,\n" +
                    "श्रीमालकेतु में राजत, कोटि रतन ज्योती॥\n" +
                    "\n" +
                    "श्री अंबेजी की आरति, जो कोइ नर गावे,\n" +
                    "कहत शिवानंद स्वामी, सुख-संपति पावे॥"
        } else if (product == Product12) {
            txtProduct.text = "\n दुर्गे दुर्घट भारी\n\n\n" +
                    "दुर्गे दुर्घट भारी तुजवीण संसारी \n" +
                    "अनाथ नाथे अंबे करुणा विस्तारी \n" +
                    "वारी वारी जन्म मरण तेवारी \n" +
                    "हारी पडलो आता संकट नेवारी\n" +
                    "जय देवी जय देवी जय महिषासुर मर्दिनी \n" +
                    "सुरवर ईश्वर वरदे तारक संजीवनी \n" +
                    "जय देवी जय देवी\n" +
                    "\n" +
                    "\n" +
                    "तुजवीण  भुवनी पाहत तुज ऐसे नाही \n" +
                    "चारी श्रमले परंतु न बोलवे काही \n" +
                    "साही विवाद करिता पडिलो प्रवाही \n" +
                    "ते तू भक्ता लागे ते तू दस लागे पावस लवलाही \n" +
                    "जय देवी जय देवी जय महिषासुर मर्दिनी \n" +
                    "सुरवर ईश्वर वरदे तारक संजीवनी \n" +
                    "जय देवी जय देवी\n" +
                    "\n" +
                    "\n" +
                    "प्रसन्न वदने प्रसन्न होशी निजदासा \n" +
                    "क्लेशांपासून तोडी होई भोपाषा \n" +
                    "आंबे तुजवाचून कोण पुरवी आशा \n" +
                    "नरहर तल्लीन झाला पद पंकज लेशा\n" +
                    "जय देवी जय देवी जय महिषासुर मर्दिनी \n" +
                    "सुरवर ईश्वर वरदे तारक संजीवनी \n" +
                    "जय देवी जय देवी"
        } else if (product == Product13) {
            txtProduct.text = "\n प्रार्थना\n\n\n" +
                    "सदा सर्वदा योग तूझा घडावा |" +
                    "तुझे कारणी देह माझा पडावा |" +
                    "उपेक्षू नको गूणवंता अनंता |" +
                    "रघूनायका मागणे हेचि आतां  ||\n\n" +
                    "कैलास राणा शिव  चंद्रमौळी |" +
                    "फणींद्र माथा मुकुटी झळाळी ||" +
                    "कारुण्य सिंधू  भवदु:खहारी |" +
                    "तुजवीण शंभो मज  कोण तारी ||\n\n" +
                    "मोरया मोरया  मी बाळ तान्हें |" +
                    "तुझीच सेवा करु काय जाणे ||" +
                    "अन्याय माझे कोट्यानुकोटी |" +
                    "मोरेश्वरा ब तू घाल पोटी ||\n\n" +
                    "ज्या ज्या ठीकांणी मन जाय माझे  |" +
                    "त्या त्या  ठीकांणी निजरुप  तुझे ||" +
                    "मी ठेवितो मस्तक ज्या ठीकांणी |" +
                    "तेथे तुझे सदगुरु पाय दोन्ही ||" +
                    "अलंकापुरी पुण्य भूमी पवित्र |\n\n" +
                    "तिथे नांदतो ग्यानराजा सुपात्र |" +
                    "तया आठविता महापुण्यराशी|" +
                    "नमस्कार माझा सदगुरु गयानेश्वराशी ||"
        } else if (product == Product14) {
            txtProduct.text = "\n पपुष्पांजली\n\n\n" +
                    "ॐ यज्ञेन यज्ञमयजंत देवास्तानि\n" +
                    "धर्माणि प्रथमान्यासन्|\n" +
                    "ते हं नाकं महिमान: सचंत\n" +
                    "यत्र पूर्वे साध्या: संति देवा:\n\n" +
                    "ॐ राजाधिराजाय प्रसह्ये साहिने|\n" +
                    "नमो वयं वैश्रवणाय कुर्महे\n" +
                    "स मे कामान्कामकामाय मह्यम्|\n" +
                    "कामेश्वरो वैश्रवणो ददातु|\n" +
                    "कुबेराय वैश्रवणाय |\n\n" +
                    "महाराजाय नम: ॐ स्वस्ति\n" +
                    "साम्राज्यं भौज्यं स्वाराज्यं वैराज्यं\n" +
                    "पारमेष्ठ्यं राज्यं\n" +
                    "माहाराज्यमाधिपत्यमयं समंतपर्यायी\n\n" +
                    "स्यात्सार्वभौम: सार्वायुष\n" +
                    "आंतादापरार्धात्पृथिव्यै\n" +
                    "समुद्रपर्यंता या एकराळिति\n" +
                    "तदप्येष श्लोकोऽभिगीतो मरुत:\n" +
                    "परिवेष्टारो मरुत्तस्यावसन्गृहे\n" +
                    "आविक्षितस्य कामप्रेर्विश्वेदेवा: सभासद इति\n" +
                    "\n"
        }


    }

}