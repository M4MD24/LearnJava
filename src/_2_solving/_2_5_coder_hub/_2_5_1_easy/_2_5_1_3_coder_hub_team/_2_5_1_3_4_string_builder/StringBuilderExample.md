# <div dir="rtl">بناء النصوص</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة دالة function تستقبل قيمة نصية من نوع string. تقوم بالدالة ببناء وإرجاع قيمة نصية بناءًا على القيمة المدخلة. عن طريق تكرار الاحرف بعدد معين تحدده القيمة المدخلة. على سبيل المثال:
</b>
</li>
<li>
<b>
4a يعني أنه يجب تكرار الحرف "a" أربع مرات. النتيجة المتوقعة هي aaaa. تقوم الدالة بإنشاء النص المطلوب باتباع تلك التعليمات، باستخدام مبدأ Last-In, FirstOut
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
expression = 3[a]2[bc]
```

#### <div dir="rtl">المُخرجات</div>

```text
aaabcbc
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
expression = 3[a2[c]]
```

#### <div dir="rtl">المُخرجات</div>

```text
accaccacc
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
expression = 2[abc]3[cd]ef
```

#### <div dir="rtl">المُخرجات</div>

```text
abcabccdcdcdef
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
expression = abc3[cd]xyz
```

#### <div dir="rtl">المُخرجات</div>

```text
abccdcdcdxyz
```