def solution(rsp):
    rsp_re = {'0':'5','2':'0','5':'2'}
    return ''.join(rsp_re[i] for i in rsp)