-- 코드를 작성해주세요
select hd.dept_id, hd.dept_name_en, round(avg(he.sal)) as AVG_SAL from hr_department as hd join hr_employees as he on hd.dept_id = he.dept_id group by hd.dept_id order by 3 desc;