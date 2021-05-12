package Tiger0941

import Tiger0941.buildTypes.*
import Tiger0941.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0941")
    name = "Tiger0941"

    vcsRoot(Tiger0941_cVCSroot)

    buildType(Tiger0941_Hi3)
    buildType(Tiger0941_Hi0)
    buildType(Tiger0941_Hi1)
    buildType(Tiger0941_Hi2)
})
