(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-7ceedaeb"],{1681:function(t,e,a){},"4bd4":function(t,e,a){"use strict";a("4de4"),a("7db0"),a("4160"),a("caad"),a("07ac"),a("2532"),a("159b");var i=a("5530"),n=a("58df"),s=a("7e2b"),o=a("3206");e["a"]=Object(n["a"])(s["a"],Object(o["b"])("form")).extend({name:"v-form",provide:function(){return{form:this}},inheritAttrs:!1,props:{disabled:Boolean,lazyValidation:Boolean,readonly:Boolean,value:Boolean},data:function(){return{inputs:[],watchers:[],errorBag:{}}},watch:{errorBag:{handler:function(t){var e=Object.values(t).includes(!0);this.$emit("input",!e)},deep:!0,immediate:!0}},methods:{watchInput:function(t){var e=this,a=function(t){return t.$watch("hasError",(function(a){e.$set(e.errorBag,t._uid,a)}),{immediate:!0})},i={_uid:t._uid,valid:function(){},shouldValidate:function(){}};return this.lazyValidation?i.shouldValidate=t.$watch("shouldValidate",(function(n){n&&(e.errorBag.hasOwnProperty(t._uid)||(i.valid=a(t)))})):i.valid=a(t),i},validate:function(){return 0===this.inputs.filter((function(t){return!t.validate(!0)})).length},reset:function(){this.inputs.forEach((function(t){return t.reset()})),this.resetErrorBag()},resetErrorBag:function(){var t=this;this.lazyValidation&&setTimeout((function(){t.errorBag={}}),0)},resetValidation:function(){this.inputs.forEach((function(t){return t.resetValidation()})),this.resetErrorBag()},register:function(t){this.inputs.push(t),this.watchers.push(this.watchInput(t))},unregister:function(t){var e=this.inputs.find((function(e){return e._uid===t._uid}));if(e){var a=this.watchers.find((function(t){return t._uid===e._uid}));a&&(a.valid(),a.shouldValidate()),this.watchers=this.watchers.filter((function(t){return t._uid!==e._uid})),this.inputs=this.inputs.filter((function(t){return t._uid!==e._uid})),this.$delete(this.errorBag,e._uid)}}},render:function(t){var e=this;return t("form",{staticClass:"v-form",attrs:Object(i["a"])({novalidate:!0},this.attrs$),on:{submit:function(t){return e.$emit("submit",t)}}},this.$slots.default)}})},"78a0":function(t,e,a){"use strict";a.r(e);var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("v-container",{attrs:{id:"user-profile",fluid:"",tag:"section"}},[a("v-row",{attrs:{justify:"center"}},[a("v-col",{attrs:{cols:"12",md:"8"}},[a("base-material-card",{scopedSlots:t._u([{key:"heading",fn:function(){return[a("div",{staticClass:"display-2 font-weight-medium"},[t._v(" My Profile ")]),a("div",{staticClass:"subtitle-1 font-weight-medium"},[t._v(" personal profile as a academic scholar ")])]},proxy:!0}])},[a("v-form",{attrs:{model:t.userInfo}},[a("v-container",{staticClass:"py-0"},[a("v-row",[a("v-col",{attrs:{cols:"12",md:"6"}},[a("v-text-field",{staticClass:"purple-input",attrs:{label:"region",disabled:""},model:{value:t.userInfo.region,callback:function(e){t.$set(t.userInfo,"region",e)},expression:"userInfo.region"}})],1),a("v-col",{attrs:{cols:"12",md:"6"}},[a("v-text-field",{attrs:{label:"Institution",disabled:""},model:{value:t.userInfo.institution,callback:function(e){t.$set(t.userInfo,"institution",e)},expression:"userInfo.institution"}})],1),a("v-col",{attrs:{cols:"12",md:"6"}},[a("v-text-field",{staticClass:"purple-input",attrs:{label:"username(ID)",disabled:""},model:{value:t.userInfo.username,callback:function(e){t.$set(t.userInfo,"username",e)},expression:"userInfo.username"}})],1),a("v-col",{attrs:{cols:"12",md:"6"}},[a("v-text-field",{staticClass:"purple-input",attrs:{label:"email address",disabled:""},model:{value:t.userInfo.email,callback:function(e){t.$set(t.userInfo,"email",e)},expression:"userInfo.email"}})],1),a("v-col",{attrs:{cols:"12",md:"6"}},[a("v-text-field",{staticClass:"purple-input",attrs:{label:"fullname",disabled:""},model:{value:t.userInfo.fullname,callback:function(e){t.$set(t.userInfo,"fullname",e)},expression:"userInfo.fullname"}})],1),a("v-col",{attrs:{cols:"12"}},[a("v-textarea",{staticClass:"purple-input",attrs:{label:"About Me",value:"Our team produces the most amazing websites.We are errangels and designed for CyberChair essay system. For more information and contact, please email to B@trace.analysis.com",disabled:""}})],1),a("v-col",{staticClass:"text-right",attrs:{cols:"12"}},[a("v-btn",{staticClass:"mr-0",attrs:{color:"success"},on:{click:t.logout}},[t._v(" Logout ")])],1)],1)],1)],1)],1)],1)],1)],1)},n=[],s=(a("ac1f"),a("5319"),{data:function(){return{snackbar:!1,snackbar_color:"success",timeout:2e3,tips_text:"",userInfo:{username:"A",fullname:"A",email:"A@trace.analysis.com",region:"City, Country",institution:"trace analysis university"}}},methods:{loadProfileData:function(){var t=this,e=localStorage.getItem("username"),a="api/user/userinfo",i=this;this.$axios.get(a,{params:{username:e}}).then((function(e){if(200==e.data.responseCode&&"success"==e.data.responseMessage){var a=e.data.responseBody.UserInformation;i.userInfo.username=a.username,i.userInfo.email=a.email,i.userInfo.fullname=a.fullname,i.userInfo.region=a.region,i.userInfo.institution=a.institution}else t.tips_text="errors occurred when getting the information",t.$toast(t.tips_text,{color:"red"})})).catch((function(e){t.tips_text="error occurred when loading profile data",t.$toast(t.tips_text,{color:"red"})}))},logout:function(){this.tips_text="you are going to loggout",this.$toast(this.tips_text,{color:"red"}),this.$store.commit("logout"),window.setTimeout(function(){this.$router.replace("/login")}.bind(this),2e3)}},mounted:function(){this.loadProfileData()}}),o=s,r=a("2877"),u=a("6544"),l=a.n(u),c=a("8336"),d=a("62ad"),f=a("a523"),h=a("4bd4"),p=a("0fd9"),m=a("8654"),v=a("a844"),g=Object(r["a"])(o,i,n,!1,null,null,null);e["default"]=g.exports;l()(g,{VBtn:c["a"],VCol:d["a"],VContainer:f["a"],VForm:h["a"],VRow:p["a"],VTextField:m["a"],VTextarea:v["a"]})},a844:function(t,e,a){"use strict";a("a9e3");var i=a("5530"),n=(a("1681"),a("8654")),s=a("58df"),o=Object(s["a"])(n["a"]);e["a"]=o.extend({name:"v-textarea",props:{autoGrow:Boolean,noResize:Boolean,rowHeight:{type:[Number,String],default:24,validator:function(t){return!isNaN(parseFloat(t))}},rows:{type:[Number,String],default:5,validator:function(t){return!isNaN(parseInt(t,10))}}},computed:{classes:function(){return Object(i["a"])({"v-textarea":!0,"v-textarea--auto-grow":this.autoGrow,"v-textarea--no-resize":this.noResizeHandle},n["a"].options.computed.classes.call(this))},noResizeHandle:function(){return this.noResize||this.autoGrow}},watch:{lazyValue:function(){this.autoGrow&&this.$nextTick(this.calculateInputHeight)},rowHeight:function(){this.autoGrow&&this.$nextTick(this.calculateInputHeight)}},mounted:function(){var t=this;setTimeout((function(){t.autoGrow&&t.calculateInputHeight()}),0)},methods:{calculateInputHeight:function(){var t=this.$refs.input;if(t){t.style.height="0";var e=t.scrollHeight,a=parseInt(this.rows,10)*parseFloat(this.rowHeight);t.style.height=Math.max(a,e)+"px"}},genInput:function(){var t=n["a"].options.methods.genInput.call(this);return t.tag="textarea",delete t.data.attrs.type,t.data.attrs.rows=this.rows,t},onInput:function(t){n["a"].options.methods.onInput.call(this,t),this.autoGrow&&this.calculateInputHeight()},onKeyDown:function(t){this.isFocused&&13===t.keyCode&&t.stopPropagation(),this.$emit("keydown",t)}}})}}]);
//# sourceMappingURL=chunk-7ceedaeb.55b4d86c.js.map