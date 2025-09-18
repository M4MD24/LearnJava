# <div dir="rtl">فلترة الكلمات المكررة</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
تخيل أنك تعمل في شركة نشر كبيرة، حيث يُطلب منك مراجعة النصوص للتأكد من خلوها من الكلمات المكررة. الكاتب الذي يرسل

النصوص دائمًا يكرر نفس الكلمات بطرق مختلفة، مثل:

"Goodbye bye bye world world world"

مهمتك هي تنظيف النصوص بحيث يتم الاحتفاظ بالكلمة الأولى فقط من أي كلمة مكررة، بغض النظر عن حالة الأحرف.

مثاال:
قبل الفلترة :
Goodbye bye bye world world world

بعد الفلترة :
Goodbye bye world

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
sentence = 'Goodbye bye bye world world world'
```

#### <div dir="rtl">المُخرجات</div>

```text
'Goodbye bye world'
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
sentence = 'Sam went went to to to his business'
```

#### <div dir="rtl">المُخرجات</div>

```text
'Sam went to his business'
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
sentence = 'Reya is is the the best player in eye eye game'
```

#### <div dir="rtl">المُخرجات</div>

```text
'Reya is the best player in eye game'
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
sentence = 'in inthe'
```

#### <div dir="rtl">المُخرجات</div>

```text
'in inthe'
```