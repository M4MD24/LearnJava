# <div dir="rtl">فاتورة رمضان بعد الضريبة</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
في أجواء شهر رمضان المبارك، قررت إحدى الشركات إرسال نشرة بريدية رمضانية تحتوي على محتوى مميز وخاص بهذه المناسبة. لكن القائمة التي ستُرسل منها النشرة تحتوي على العديد من العناوين المتكررة، كما تشمل عناوين من نطاقات بريدية لا ترغب الشركة باستهدافها في حملتها الرمضانية.

ممكن تساعدك :
:Emails (emails)
قائمة بعناوين البريد الإلكتروني مثل ["user@gmail.com", "admin@company.com"].

:Excluded Domains (excludedDomains)
قائمة تحتوي على أسماء النطاقات التي يجب تجاهلها (استبعادها) مثل ["gmail.com", "yahoo.com"].

الهدف من التحدي:
كتابة دالة filterSubscribers(emails, excludedDomains) تعيد قائمة نظيفة من عناوين البريد الإلكتروني من خلال:

إزالة التكرارات (مع تجاهل حالة الأحرف حتى لا يتم احتساب User@gmail.com و user@gmail.com كعناوين مختلفة).

استبعاد أي عنوان ينتمي إلى أحد النطاقات في قائمة excludedDomains.

مثال:
لنفترض أن لديك البيانات التالية:
const emails = [

"user@gmail.com",

"admin@company.com",

"info@yahoo.com",

"USER@gmail.com",

"support@company.com",

"sales@business.org"

];

const excludedDomains = ["gmail.com", "yahoo.com"];

النتيجة :
[

"admin@company.com",

"support@company.com",

"sales@business.org"

]

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
emails = ['user@gmail.com', 'admin@company.com', 'info@yahoo.com', 'user@gmail.com', 'support@company.com', 'sales@business.org']
excludedDomains = ['gmail.com', 'yahoo.com']
```

#### <div dir="rtl">المُخرجات</div>

```text
['admin@company.com','support@company.com','sales@business.org']
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
emails = ['info@domain.com', 'info@domain.com', 'sales@business.com']
excludedDomains = []
```

#### <div dir="rtl">المُخرجات</div>

```text
['info@domain.com','sales@business.com']
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
emails = ['tester@Gmail.com', 'tester@gmail.com', 'dev@yahoo.com', 'user@mySite.org']
excludedDomains = ['gmail.com', 'yahoo.com']
```

#### <div dir="rtl">المُخرجات</div>

```text
['user@mySite.org']
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
emails = ['admin@company.com', 'admin@Company.com', 'admin@company.com']
excludedDomains = ['outlook.com']
```

#### <div dir="rtl">المُخرجات</div>

```text
['admin@company.com']
```