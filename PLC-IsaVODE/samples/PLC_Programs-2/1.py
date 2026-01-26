import os

# مسیر فعلی
current_dir = os.getcwd()

# لیست فایل‌ها رو می‌گیریم
files = [f for f in os.listdir(current_dir) if os.path.isfile(os.path.join(current_dir, f))]

# فایل‌ها رو بر اساس سایزشون مرتب می‌کنیم
files.sort(key=lambda x: os.path.getsize(os.path.join(current_dir, x)))

# شماره‌گذاری می‌کنیم
for index, filename in enumerate(files, start=1):
    # جلوی فایل‌های دیگه مثل .py از خود این کد رو بگیریم
    if filename == os.path.basename(__file__):
        continue

    # نام جدید
    new_name = f"{index}-{filename}"
    
    # مسیر فایل قدیم و جدید
    old_file = os.path.join(current_dir, filename)
    new_file = os.path.join(current_dir, new_name)

    # تغییر نام
    os.rename(old_file, new_file)
    print(f"تغییر نام داده شد: {filename} → {new_name}")
