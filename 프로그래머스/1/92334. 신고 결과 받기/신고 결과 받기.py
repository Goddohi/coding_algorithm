'''
def solution(id_list, report, k):
    
    id_report_list = [[] for _ in range(len(id_list))]
    id_report_count = [0]*len(id_list)
    multi_check=-1; #복수신고인지 검증
    
    for report_view in report:
        multi_check+=1
        if report.index(report_view)!=multi_check:
            print(report_view)
            continue
        a,b = report_view.split();
        id_report_list[id_list.index(a)].append(b)
        id_report_count[id_list.index(b)] +=1;
    
    answer = [0]*len(id_list)
    multi_check=0; #작업용으로 재활용
    for i in id_report_count:
        if k<=i:
            count=0
            for j in id_report_list:
                if id_list[multi_check] in j:
                    answer[count] +=1
                count+=1
        multi_check+=1
    return answer
'''
def solution(id_list, report, k):
    report_count = {id: {"repoter": set(), "mail": 0} for id in id_list}
    for report_view in report:
        repoter,repoted = report_view.split()
        report_count[repoted]["repoter"].add(repoter)
    for key in report_count:
        if len(report_count[key]["repoter"]) >= k:
            for user in report_count[key]["repoter"]:
                report_count[user]["mail"] += 1
    answer = [value["mail"] for value in report_count.values()]
    return answer