<div dir="rtl">

# <div dir="rtl">التحقق من الجملة إذا كانت (Palindrome)</div>

## <div dir="rtl">السؤال</div>

<li>
<b>
الجملة تعتبر باليندروم (Palindrome) إذا كانت تقرأ بنفس الشكل عند قراءتها من الأمام أو من الخلف، بعد:

تحويل جميع الأحرف إلى أحرف صغيرة.

إزالة جميع الأحرف غير الأبجدية الرقمية (مثل المسافات والعلامات).

اكتب دالة isPalindrome تأخذ نصًا s كمدخل، وتُعيد:

true إذا كانت الجملة باليندروم.

false إذا لم تكن كذلك.

مثال:
المدخل:
s = "A man, a plan, a canal: Panama"

الخطوات:
تحويل الأحرف إلى صغيرة: "a man, a plan, a canal: panama"

إزالة الأحرف غير الأبجدية الرقمية: "amanaplanacanalpanama"

التحقق من التماثل:

"amanaplanacanalpanama" يقرأ بنفس الشكل من الأمام والخلف.

الناتج:
true

الهدف :
تعلم كيفية التعامل مع النصوص وتنظيفها باستخدام التعابير العادية.

تحسين المهارات في التحقق من التماثل.

</b>
</li>

</div>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = 'A man, a plan, a canal: Panama'
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = 'race a car'
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = ' '
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = 'madam'
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```