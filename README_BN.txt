আল-ইকরা স্মার্ট স্কুল Android APK build project

এই ZIP হলো Android Studio/Gradle project, APK ফাইল নয়। এতে বাংলা/English স্ক্রিন ও Student/Teacher/Admin/Parent ডেমো লগইন আছে। আসল লগইন, ডেটাবেস, উপস্থিতি/রেজাল্ট সংরক্ষণ/ফি/নোটিফিকেশন এখনো নেই।

ফোন থেকে APK build:
1. GitHub অ্যাকাউন্টে সাইন ইন করুন এবং New repository তৈরি করুন (Public বা Private)।
2. ZIP ফাইলটি ফোনে Extract করুন।
3. GitHub ওয়েবসাইটে repository খুলে Add file > Upload files দিয়ে ZIP-এর ভেতরের সব ফাইল/ফোল্ডার আপলোড করুন। .github ফোল্ডারটি যেন বাদ না যায়।
4. Commit changes করুন।
5. Repository-র Actions ট্যাব খুলুন। Build Android APK workflow বেছে Run workflow চাপুন, অথবা push-এর পর স্বয়ংক্রিয়ভাবে চলতে দিন।
6. Build শেষ হলে run খুলে Artifacts অংশ থেকে Al-Ikra-Smart-School-APK ডাউনলোড করুন।
7. ZIP artifact Extract করে app-debug.apk ফোনে ইনস্টল করুন। Android চাইলে এই ফাইলের জন্য Install unknown apps অনুমতি দিতে হবে। শুধু নিজের তৈরি/বিশ্বস্ত APK ইনস্টল করবেন।

গুরুত্বপূর্ণ:
- APK-টি demo shell মাত্র। login buttons বাস্তব authentication নয় এবং কোনো school data save করে না।
- বাস্তব শিক্ষার্থী/শিক্ষক তথ্য দেওয়ার আগে secure backend, database, access controls, backups, privacy protections ও testing লাগবে।
- স্কুলের লোগোর পরিবর্তে আপাতত সাধারণ text logo আছে।
- Android app ID bd.alikra.school; Play Store release-এর আগে signing ও final checks প্রয়োজন।


অ্যাপের ডেভেলপার হিসেবে দেখানো হবে: Shamim Ahmad Choudhury
নোট: এটি এখনো ডেমো অ্যাপ। বাস্তব লগইন, ডেটাবেস, উপস্থিতি, ফলাফল, ফি ইত্যাদি চালু করতে আলাদা ব্যাকএন্ড/সার্ভার ও ফিচার ডেভেলপমেন্ট লাগবে।

ডেভেলপার: Shamim Ahmad Choudhury
পদবি: Software and Hardware Engineer
মোবাইল: +8801773682886

স্কুলের আসল লোগো যোগ করা হয়েছে: app/src/main/assets/school-logo.jpg

গুরুত্বপূর্ণ GitHub নির্দেশনা: .github/workflows/build-apk.yml ফোল্ডার/ফাইলের নামের শুরুতে ডট অবশ্যই রাখতে হবে। ZIP-এর ভেতরে এই পথটি ঠিক এভাবেই আছে। GitHub-এ আপলোডের সময় পুরো ZIP-কে একটি ফাইল হিসেবে আপলোড করবেন না; ZIP Extract করে ভেতরের সব ফাইল রিপোজিটরির root-এ আপলোড করুন।
