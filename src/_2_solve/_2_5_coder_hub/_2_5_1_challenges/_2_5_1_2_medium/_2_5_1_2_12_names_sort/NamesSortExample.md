# <div dir="rtl">الترتيب الشرطي</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة دالة function تستقبل متغيرين، المتغير الأول وهو مصفوفة array من نوع string تحتوي على مجموعة من الأسماء، والمتغير الثاني هو مصفوفة array من نوع string نوع الترتيب إما: ابجدي (ASC) وهو التصاعدي أو (DESC) وهو التنازلي وتقوم الدالة function بترتيب الإسم الأخير حسب نوع الترتيب المدخل
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
namesArray = [Ahmed Omar, Yousef Abdullah]
order = ASC
```

#### <div dir="rtl">المُخرجات</div>

```text
[Ahmed Omar, Yousef Abdullah]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
namesArray = [Khaled Bader, Khaled Bader, Mohammed Yahya]
order = DESC
```

#### <div dir="rtl">المُخرجات</div>

```text
[Mohammed Yahya,Khaled Bader,Khaled Bader]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
namesArray = [Khaled Bader]
order = ASC
```

#### <div dir="rtl">المُخرجات</div>

```text
[Khaled Bader]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
namesArray = []
order = DESC
```

#### <div dir="rtl">المُخرجات</div>

```text
[]
```