/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
var citiesByState = {
AndhraPradesh:["Adoni","Amaravati","Anantapur","Bhimavaram","Chittoor","Adilabad",
"Anantapur","Kakinada","Guntur","Karimnagar","Khammam","Krishna","Kurnool","Mahbubnagar",
"Medak","Nalgonda","Nizamabad","Ongole","Hyderabad","Srikakulam","Nellore","Visakhapatnam",
"Vizianagaram","Warangal","Eluru","Kadapa"],

Arunachal_Pradesh:["Anjaw","Changlang","East Siang","Kurung Kumey","Lohit","Lower Dibang Valley","Lower Subansiri",
"Papum Pare","Tawang","Tirap","Dibang Valley","Upper Siang","Upper Subansiri","West Kameng" ,"West Siang"],

Assam:["Baksa","Barpeta","Bongaigaon","Cachar","Chirang","Darrang","Dhemaji","Dima Hasao",
    "Dhubri","Dibrugarh","Guwahati","Goalpara","Golaghat","Hailakandi","Jorhat","Kamrup","Kamrup Metropolitan",
    "Karbi Anglong","Karimganj","Kokrajhar","Lakhimpur","Marigaon","Nagaon","Nalbari","Sibsagar",
    "Sonitpur","Tinsukia","Udalguri"],
Bihar:["Araria","Arwal","Aurangabad","Banka","Begusarai","Bhagalpur","Bhojpur","Buxar",
    "Darbhanga","East Champaran","Gaya","Gopalganj","Jamui","Jehanabad","Kaimur","Katihar",
    "Khagaria","Kishanganj","Lakhisarai","Madhepura","Madhubani","Munger","Muzaffarpur","Nalanda",
    "Nawada","Patna","Purnia","Rohtas","Saharsa","Samastipur","Saran","Sheikhpura","Sheohar",
    "Sitamarhi","Siwan","Supaul","Vaishali","West Champaran"],
Chandigarh:["Chandigarh"],

Chhattisgarh:["Bastar","Bijapur","Bhilai","Bilaspur","Dantewada","Dhamtari","Durg","Jashpur",
    "Janjgir-Champa","Korba","Koriya","Kanker","Kabirdham (Kawardha)","Mahasamund","Narayanpur",
    "Raigarh","Rajnandgaon","Raipur","Surguja"],

Dadra_and_Nagar_Haveli:["Dadra and Nagar Haveli"],

Daman_and_Diu :["Daman", "Diu"],

Delhi:["Karawal Nagar","Kirari Suleman Nagar","Nangloi Jat","New Delhi","Sultan Pur Majra"],

Goa:["North Goa","South Goa"],

Gujarat :["Ahmedabad","Amreli district","Anand","Banaskantha","Bharuch","Bhavnagar","Dahod",
    "The Dangs","Gandhinagar","Jamnagar","Junagadh","Kutch","Kheda","Mehsana","Narmada","Navsari",
    "Patan","Panchmahal","Porbandar","Rajkot","Sabarkantha","Surendranagar","Surat","Vyara",
    "Vadodara","Valsad"],

Haryana :["Ambala","Bhiwani","Faridabad","Fatehabad","Gurgaon","Hissar","Jhajjar","Jind",
    "Karnal","Kaithal","Kurukshetra","Mahendragarh","Mewat","Palwal","Panchkula","Panipat",
    "Rewari","Rohtak","Sirsa","Sonipat","Yamuna Nagar"],

Himachal_Pradesh :["Bilaspur","Chamba","Hamirpur","Kangra","Kinnaur","Kullu","Lahaul and Spiti",
    "Mandi","Shimla","Sirmaur","Solan","Una"],

Jammu_and_Kashmir :["Anantnag","Badgam","Bandipora","Baramulla","Doda","Ganderbal","Jammu",
    "Kargil","Kathua","Kishtwar","Kupwara","Kulgam","Leh","Poonch","Pulwama","Rajauri","Ramban",
    "Reasi","Samba","Shopian","Srinagar","Udhampur"],

Jharkhand :["Bokaro","Chatra","Deoghar","Dhanbad","Dumka","East Singhbhum","Garhwa","Giridih",
    "Godda","Gumla","Hazaribag","Jamtara","Khunti","Koderma","Latehar","Lohardaga","Pakur",
    "Palamu","Ramgarh","Ranchi","Sahibganj","Seraikela Kharsawan","Simdega","West Singhbhum"],

Karnataka:["Bagalkot","Bangalore Rural","Bangalore Urban","Belgaum","Bellary","Bidar","Bijapur",
    "Chamarajnagar","Chikkamagaluru","Chikkaballapur","Chitradurga","Davanagere","Dharwad",
    "Dakshina Kannada","Gadag","Gulbarga","Hassan","Haveri district","Kodagu","Kolar","Koppal",
    "Mandya","Mysore","Raichur","Shimoga","Tumkur","Udupi","Uttara Kannada","Ramanagara","Yadgir"],

Kerala :["Alappuzha","Ernakulam","Idukki","Kannur","Kasaragod","Kollam","Kottayam","Kozhikode",
    "Malappuram","Palakkad","Pathanamthitta","Thrissur","Thiruvananthapuram","Wayanad"],

Madhya_Pradesh :["Alirajpur","Anuppur","Ashok Nagar","Balaghat","Barwani","Betul","Bhind","Bhopal",
    "Burhanpur","Chhatarpur","Chhindwara","Damoh","Datia","Dewas","Dhar","Dindori","Guna","Gwalior",
    "Harda","Hoshangabad","Indore","Jabalpur","Jhabua","Katni","Khandwa (East Nimar)",
    "Khargone (West Nimar)","Mandla","Mandsaur","Morena","Narsinghpur","Neemuch","Panna","Rewa",
    "Rajgarh","Ratlam","Raisen","Sagar","Satna","Sehore","Seoni","Shahdol","Shajapur","Sheopur",
    "Shivpuri","Sidhi","Singrauli","Tikamgarh","Ujjain","Umaria","Vidisha"],

Maharashtra :["Ahmednagar","Akola","Amravati","Aurangabad","Bhandara","Beed","Buldhana","Chandrapur",
    "Dhule","Gadchiroli","Gondia","Hingoli","Jalgaon","Jalna","Kolhapur","Latur","Mumbai City",
    "Mumbai suburban","Nandurbar","Nanded","Nagpur","Nashik","Osmanabad","Parbhani","Pune","Raigad",
    "Ratnagiri","Sindhudurg","Sangli","Solapur","Satara","Thane","Wardha","Washim","Yavatmal"],

Manipur:["Bishnupur","Churachandpur","Chandel","Imphal East","Senapati","Tamenglong","Thoubal",
    "Ukhrul","Imphal West"],

Meghalaya :["East Garo Hills","East Khasi Hills","Jaintia Hills","Ri Bhoi","South Garo Hills","West Garo Hills","West Khasi Hills"],


Mizoram :["Aizawl","Champhai","Kolasib","Lawngtlai","Lunglei","Mamit","Saiha","Serchhip"],

Nagaland :["Dimapur","Kohima","Mokokchung","Mon","Phek","Tuensang","Wokha","Zunheboto"],

Odisha :["Angul","Boudh (Bauda)","Bhadrak","Bhubaneswar","Balangir","Bargarh (Baragarh)",
    "Balasore","Cuttack","Debagarh (Deogarh)","Dhenkanal","Ganjam","Gajapati","Jharsuguda",
    "Jajpur","Jagatsinghpur","Khordha","Kendujhar (Keonjhar)","Kalahandi","Kandhamal","Koraput",
    "Kendrapara","Malkangiri","Mayurbhanj","Nabarangpur","Nuapada","Nayagarh","Puri","Rayagada",
    "Sambalpur","Subarnapur (Sonepur)","Sundergarh"],

Pondicherry :["Karaikal","Mahe","Pondicherry","Yanam"],

Punjab :["Amritsar","Barnala","Bathinda","Firozpur","FaridkotFatehgarh Sahib","Fazilka",
    "Gurdaspur","Hoshiarpur","Jalandhar","Kapurthala","Ludhiana","Mansa","Moga","Sri Muktsar Sahib",
    "Pathankot","Patiala","Rupnagar","Ajitgarh (Mohali)","Sangrur","Nawanshahr","Tarn Taran"],

Rajasthan :["Ajmer","Alwar","Bikaner","Barmer","Banswara","Bharatpur","Baran","Bundi","Bhilwara",
    "Churu","Chittorgarh","Dausa","Dholpur","Dungapur","Ganganagar","Hanumangarh","Jhunjhunu",
    "Jalore","Jodhpur","Jaipur","Jaisalmer","Jhalawar","Karauli","Kota","Nagaur","Pali","Pratapgarh",
    "Rajsamand","Sikar","Sawai Madhopur","Sirohi","Tonk","Udaipur"],


Sikkim :["Gangtok","East Sikkim","North Sikkim","South Sikkim","West Sikkim"],

Tamil_Nadu :["Ariyalur","Chennai","Coimbatore","Cuddalore","Dharmapuri","Dindigul","Erode","Kanchipuram","Kanyakumari","Karur","Madurai","Nagapattinam","Nilgiris","Namakkal","Perambalur","Pudukkottai","Ramanathapuram","Salem","Sivaganga","Tirupur","Tiruchirappalli","Theni","Tirunelveli","Thanjavur","Thoothukudi","Tiruvallur","Tiruvarur","Tiruvannamalai","Vellore","Viluppuram","Virudhunagar"],


Tripura :["Agartala","Dhalai","North Tripura","South Tripura","Khowai","West Tripura"],


Uttar_Pradesh :["Agra","Allahabad","Aligarh","Ambedkar Nagar","Auraiya","AzamgarhBarabanki",
            "Budaun","Bagpat","Bahraich","Bijnor","Ballia","Banda","Balrampur","Bareilly","Basti",
            "Bulandshahr","Chandauli","Chhatrapati Shahuji Maharaj Nagar","Chitrakoot","Deoria",
            "Etah","Kanshi Ram Nagar","Etawah","Firozabad","Farrukhabad","Fatehpur","Faizabad",
            "Gautam Buddh Nagar","Gonda","Ghazipur","Gorakhpur","Ghaziabad","Hamirpur","Hardoi",
            "Mahamaya Nagar","Jhansi","Jalaun","Jyotiba Phule Nagar","Jaunpur district",
            "Ramabai Nagar (Kanpur Dehat)","Kannauj","Kanpur","Kaushambi","Kushinagar","Lalitpur",
            "Lakhimpur Kheri","Lucknow","Mau","Meerut","Maharajganj","Mahoba","Mirzapur","Moradabad",
            "Mainpuri","Mathura","Muzaffarnagar","Panchsheel Nagar district","Pilibhit","Shamli",
            "Pratapgarh","Rampur","Raebareli","Saharanpur","Sitapur","Shahjahanpur","Sant Kabir Nagar",
            "Siddharthnagar","Sonbhadra","Sant Ravidas Nagar","Sultanpur","Shravasti","Unnao","Varanasi"],


Uttarakhand :["Almora","Bageshwar","Chamoli","Champawat","Dehradun","Haridwar","Nainital",
    "Pauri Garhwal","Pithoragarh","Rudraprayag","Tehri Garhwal","Udham Singh Nagar","Uttarkashi"],

West_Bengal :["Birbhum","Bankura","Bardhaman","Darjeeling","Dakshin Dinajpur","Hooghly","Howrah",
    "Jalpaiguri","Cooch Behar","Kolkata","Maldah","Paschim Medinipur","Purba Medinipur","Murshidabad",
    "Nadia","North 24 Parganas","South 24 Parganas","Purulia","Uttar Dinajpur"],

}
function makeSubmenu(value) {
   // alert(typeof (value));
if(value.length==0) document.getElementById("citySelect").innerHTML = "<option></option>";
else {
var citiesOptions = "";
for(cityId in citiesByState[value]) {
citiesOptions+="<option>"+citiesByState[value][cityId]+"</option>";
}
document.getElementById("citySelect").innerHTML = citiesOptions;
}
}
function display(a){
    
    alert("Hi");
}


function resetSelection() {
document.getElementById("countrySelect").selectedIndex = 0;
document.getElementById("citySelect").selectedIndex = 0;
}
