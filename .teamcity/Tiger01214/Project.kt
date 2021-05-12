package Tiger01214

import Tiger01214.buildTypes.*
import Tiger01214.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01214")
    name = "Tiger01214"

    vcsRoot(Tiger01214_cVCSroot)

    buildType(Tiger01214_Hi3)
    buildType(Tiger01214_Hi0)
    buildType(Tiger01214_Hi1)
    buildType(Tiger01214_Hi2)
})
