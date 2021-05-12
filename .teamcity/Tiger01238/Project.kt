package Tiger01238

import Tiger01238.buildTypes.*
import Tiger01238.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01238")
    name = "Tiger01238"

    vcsRoot(Tiger01238_cVCSroot)

    buildType(Tiger01238_Hi3)
    buildType(Tiger01238_Hi1)
    buildType(Tiger01238_Hi2)
    buildType(Tiger01238_Hi0)
})
