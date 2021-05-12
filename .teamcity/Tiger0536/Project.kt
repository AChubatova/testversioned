package Tiger0536

import Tiger0536.buildTypes.*
import Tiger0536.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0536")
    name = "Tiger0536"

    vcsRoot(Tiger0536_cVCSroot)

    buildType(Tiger0536_Hi0)
    buildType(Tiger0536_Hi2)
    buildType(Tiger0536_Hi1)
    buildType(Tiger0536_Hi3)
})
