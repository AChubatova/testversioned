package Tiger0189

import Tiger0189.buildTypes.*
import Tiger0189.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0189")
    name = "Tiger0189"

    vcsRoot(Tiger0189_cVCSroot)

    buildType(Tiger0189_Hi1)
    buildType(Tiger0189_Hi2)
    buildType(Tiger0189_Hi0)
    buildType(Tiger0189_Hi3)
})
